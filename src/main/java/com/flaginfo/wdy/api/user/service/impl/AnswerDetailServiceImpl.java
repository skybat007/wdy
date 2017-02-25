package com.flaginfo.wdy.api.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flaginfo.wdy.api.user.dao.WdyAnswerDetailMapper;
import com.flaginfo.wdy.api.user.domain.WdyAnswerDetail;
import com.flaginfo.wdy.api.user.service.AnswerDetailService;
import com.flaginfo.wdy.commons.dao.BaseDao;
import com.flaginfo.wdy.commons.service.BaseServiceImpl;

/**
 * @author zhaocheng
 * @since 2017-2-20
 */
@Service
@Transactional
public class AnswerDetailServiceImpl extends BaseServiceImpl<WdyAnswerDetail> implements AnswerDetailService {

	@Autowired
	private WdyAnswerDetailMapper answerDetailDao;

	public List<WdyAnswerDetail> getAll(WdyAnswerDetail questionnaire) {
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
	public List<WdyAnswerDetail> findAll() {
		return answerDetailDao.selectAll();

	}

	@Override
	protected BaseDao<WdyAnswerDetail, String> getDao() {
		return answerDetailDao;
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
