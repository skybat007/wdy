package com.flaginfo.wdy.api.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flaginfo.wdy.api.user.dao.WdyQuestionAnswerMapper;
import com.flaginfo.wdy.api.user.domain.WdyQuestionAnswer;
import com.flaginfo.wdy.api.user.service.AnswerService;
import com.flaginfo.wdy.commons.dao.BaseDao;
import com.flaginfo.wdy.commons.service.BaseServiceImpl;

/**
 * @author zhaocheng
 * @since 2017-2-20
 */
@Service
@Transactional
public class AnswerServiceImpl extends BaseServiceImpl<WdyQuestionAnswer> implements AnswerService {

	@Autowired
	private WdyQuestionAnswerMapper answerDao;

	public List<WdyQuestionAnswer> getAll(WdyQuestionAnswer questionnaire) {
//		if (questionnaire.getPage() != null && questionnaire.getRows() != null) {
//			PageHelper.startPage(questionnaire.getPage(), questionnaire.getRows());
//		}
		return findAll();
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public List<WdyQuestionAnswer> findAll() {
		return answerDao.selectAll();

	}

	@Override
	public int selectByQsIdAndUserId(WdyQuestionAnswer answer) {
		return answerDao.selectByQsIdAndUserId(answer);
	}
	
	@Override
	protected BaseDao<WdyQuestionAnswer, String> getDao() {
		return answerDao;
	}

/*	public WdyQuestionnaire getById(Integer id) {
		return questionnaireMapper.selectByPrimaryKey(id);
	}

	public void deleteById(Integer id) {
		questionnaireMapper.deleteByPrimaryKey(id);
	}*/

//	public void save(WdyQuestionAnswer questionnaire) {
//		if (questionnaire.getId() != null) {
//			questionnaireDao.updateByPrimaryKey(questionnaire);
//		} else {
//			questionnaireDao.insert(questionnaire);
//		}
//	}
}
