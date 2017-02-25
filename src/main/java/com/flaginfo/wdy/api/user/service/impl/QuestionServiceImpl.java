package com.flaginfo.wdy.api.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flaginfo.wdy.api.user.dao.WdyQuestionMapper;
import com.flaginfo.wdy.api.user.dao.WdyQuestionOptionMapper;
import com.flaginfo.wdy.api.user.domain.WdyQuestion;
import com.flaginfo.wdy.api.user.service.QuestionService;
import com.flaginfo.wdy.commons.dao.BaseDao;
import com.flaginfo.wdy.commons.service.BaseServiceImpl;

/**
 * @author zhaocheng
 * @since 2017-2-20
 */
@Service
@Transactional
public class QuestionServiceImpl extends BaseServiceImpl<WdyQuestion> implements QuestionService {

	@Autowired
	private WdyQuestionMapper questionDao;

	@Autowired
	private WdyQuestionOptionMapper questionOptionDao;

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<WdyQuestion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected BaseDao<WdyQuestion, String> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

//	public List<WdyQuestion> getAll(WdyQuestion question) {
//		if (question.getPage() != null && question.getRows() != null) {
//			PageHelper.startPage(question.getPage(), question.getRows());
//		}
//		return questionMapper.select(question);
//	}
//
//	public WdyQuestion getById(Integer id) {
//		return questionMapper.selectByPrimaryKey(id);
//	}
//
//	public void deleteById(Integer id) {
//		questionMapper.deleteByPrimaryKey(id);
//	}
//
//	public void save(WdyQuestion question) {
//		if (question.getId() != null) {
//			questionMapper.updateByPrimaryKey(question);
//		} else {
//			questionMapper.insert(question);
//		}
//	}
}
