package com.flaginfo.wdy.api.user.service;

import com.flaginfo.wdy.api.user.domain.WdyQuestionAnswer;
import com.flaginfo.wdy.commons.service.BaseService;

/**
 * @author zhaocheng
 * @since 2017-2-20
 */
public interface AnswerService extends BaseService<WdyQuestionAnswer> {
	
	int selectByQsIdAndUserId(WdyQuestionAnswer answer);
	
}
