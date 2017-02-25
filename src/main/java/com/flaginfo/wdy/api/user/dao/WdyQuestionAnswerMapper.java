package com.flaginfo.wdy.api.user.dao;

import com.flaginfo.wdy.api.user.domain.WdyQuestionAnswer;
import com.flaginfo.wdy.commons.dao.BaseDao;

public interface WdyQuestionAnswerMapper extends BaseDao<WdyQuestionAnswer, String> {

	int selectByQsIdAndUserId(WdyQuestionAnswer answer);
}