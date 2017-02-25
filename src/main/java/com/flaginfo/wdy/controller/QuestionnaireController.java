/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.flaginfo.wdy.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.flaginfo.wdy.api.user.domain.WdyAnswerDetail;
import com.flaginfo.wdy.api.user.domain.WdyQuestionAnswer;
import com.flaginfo.wdy.api.user.domain.WdyQuestionnaire;
import com.flaginfo.wdy.api.user.dto.CreateAnswerInput;
import com.flaginfo.wdy.api.user.service.AnswerDetailService;
import com.flaginfo.wdy.api.user.service.AnswerService;
import com.flaginfo.wdy.api.user.service.QuestionnaireService;
import com.flaginfo.wdy.commons.domain.ResponseMsg;
import com.flaginfo.wdy.constant.ExceptionConstant;

/**
 * @author zhaocheng
 * @since 2017-2-20
 */
@Controller
@RequestMapping("/questionnaires")
public class QuestionnaireController {

	@Autowired
	private QuestionnaireService questionnaireService;
	
	@Autowired
	private AnswerService answerService;
	
	@Autowired
	private AnswerDetailService answerDetailService;

	@RequestMapping
	public ModelAndView getAll(WdyQuestionnaire questionnaire) {
		ModelAndView result = new ModelAndView("questionnaires");

//		List<WdyQuestionnaire> list = questionnaireService.findAll(questionnaire);
//		result.addObject("pageInfo", new PageInfo<WdyQuestionnaire>(list));
//		result.addObject("queryParam", questionnaire);
//		result.addObject("page", questionnaire.getPage());
//		result.addObject("rows", questionnaire.getRows());
		return result;
	}

	@RequestMapping(value = "/add")
	public ModelAndView add() {
		ModelAndView result = new ModelAndView("editQuestionnaire");

		result.addObject("questionnaire", new WdyQuestionnaire());
		return result;
	}
	
	@RequestMapping(value = "/queryAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<WdyQuestionnaire>> queryAll() {
		return new ResponseEntity<>(questionnaireService.findAll(), HttpStatus.OK);
	}
	
	/**
	 * POST /createQuestionnaire -> create a new user
	 */
	@RequestMapping(value = "/createQuestionnaire", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createQuestionnaire(@Valid @RequestBody WdyQuestionnaire inputDto,
			HttpServletRequest request) {
		questionnaireService.create(inputDto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	/**
	 * POST /createAnswer -> 创建答卷
	 */
	@RequestMapping(value = "/createAnswer", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createAnswer(@Valid @RequestBody CreateAnswerInput inputDto,
			HttpServletRequest request) {
		ResponseMsg responseMsg = new ResponseMsg();

		WdyQuestionAnswer questionAnswer = new WdyQuestionAnswer();
		questionAnswer.setQsId(inputDto.getQsId());
		questionAnswer.setUserId(inputDto.getUserId());
		questionAnswer.setCost(inputDto.getCost());
		questionAnswer.setSource(inputDto.getSource());
		questionAnswer.setFromIp(inputDto.getFromIp());
		questionAnswer.setStatus(inputDto.getStatus());
		
		// 校验是否答卷人已提交过问卷
		int count = answerService.selectByQsIdAndUserId(questionAnswer);
		if (count > 0) {
			responseMsg.setSuccess(false);
			responseMsg.setErrorCode(ExceptionConstant.EXISTS_ERROR_CODE);
			responseMsg.setErrorMSg(ExceptionConstant.EXISTS_ERROR_MSG);
			return new ResponseEntity<>(responseMsg, HttpStatus.FOUND);
		}
		
		questionAnswer = answerService.create(questionAnswer);
		for(WdyAnswerDetail detail : inputDto.getAnswers()){
			detail.setAnswerId(questionAnswer.getId());
		}
		answerDetailService.create(inputDto.getAnswers());
		
		responseMsg.setData(questionAnswer);
		return new ResponseEntity<>(responseMsg, HttpStatus.CREATED);
	}

//	@RequestMapping(value = "/view/{id}")
//	public ModelAndView view(@PathVariable Integer id) {
//		ModelAndView result = new ModelAndView("editQuestionnaire");
//
//		WdyQuestionnaire questionnaire = questionnaireService.getById(id);
//		result.addObject("questionnaire", questionnaire);
//		return result;
//	}
//
//	@RequestMapping(value = "/delete/{id}")
//	public ModelAndView delete(@PathVariable Integer id, RedirectAttributes ra) {
//		ModelAndView result = new ModelAndView("redirect:/questionnaires");
//
//		questionnaireService.deleteById(id);
//		ra.addFlashAttribute("msg", "删除成功!");
//		return result;
//	}
//
//	@RequestMapping(value = "/save", method = RequestMethod.POST)
//	public ModelAndView save(WdyQuestionnaire questionnaire) {
//		ModelAndView result = new ModelAndView("editQuestionnaire");
//		String msg = questionnaire.getId() == null ? "新增成功!" : "更新成功!";
//		
//		questionnaire.setReleaseTime(new Date());
//		questionnaire.setDeadline(new Date());
//		questionnaire.setCreateTime(new Date());
//		questionnaire.setUpdateTime(new Date());
//		questionnaireService.save(questionnaire);
//		
//		result.addObject("questionnaire", questionnaire);
//		result.addObject("msg", msg);
//		return result;
//	}
}
