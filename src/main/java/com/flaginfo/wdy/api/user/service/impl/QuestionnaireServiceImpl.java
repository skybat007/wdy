package com.flaginfo.wdy.api.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flaginfo.wdy.api.user.dao.WdyQuestionnaireMapper;
import com.flaginfo.wdy.api.user.domain.WdyQuestionnaire;
import com.flaginfo.wdy.api.user.service.QuestionnaireService;
import com.flaginfo.wdy.commons.dao.BaseDao;
import com.flaginfo.wdy.commons.service.BaseServiceImpl;

/**
 * @author zhaocheng
 * @since 2017-2-20
 */
@Service
@Transactional
public class QuestionnaireServiceImpl extends BaseServiceImpl<WdyQuestionnaire> implements QuestionnaireService {

	@Autowired
	private WdyQuestionnaireMapper QuestionnaireDao;

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<WdyQuestionnaire> findAll() {
		return QuestionnaireDao.selectAll();
	}

	@Override
	protected BaseDao<WdyQuestionnaire, String> getDao() {
		return QuestionnaireDao;
	}

//	public List<WdyQuestionnaire> getAll(WdyQuestionnaire questionnaire) {
//		if (questionnaire.getPage() != null && questionnaire.getRows() != null) {
//			PageHelper.startPage(questionnaire.getPage(), questionnaire.getRows());
//		}
//		return questionnaireMapper.selectAll();
//	}
//
//	public WdyQuestionnaire getById(Integer id) {
//		return questionnaireMapper.selectByPrimaryKey(id);
//	}
//
//	public void deleteById(Integer id) {
//		questionnaireMapper.deleteByPrimaryKey(id);
//	}
//
//	public void save(WdyQuestionnaire questionnaire) {
//		if (questionnaire.getId() != null) {
//			questionnaireMapper.updateByPrimaryKey(questionnaire);
//		} else {
//			questionnaireMapper.insert(questionnaire);
//		}
//	}
}
