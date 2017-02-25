package com.flaginfo.wdy.api.user.domain;

import java.io.Serializable;
import java.util.Date;

import com.flaginfo.wdy.commons.domain.AbstractEntity;

public class WdyAnswerDetail extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String answerId;

	private String questionId;

	private String answerOption;

	private String answerDesc;

	private Date createTime;

	private Date updateTime;

	private Integer delFlag;

	public String getAnswerId() {
		return answerId;
	}

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}

	/**
	 * @return question_id
	 */
	public String getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId
	 */
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return answer_option
	 */
	public String getAnswerOption() {
		return answerOption;
	}

	/**
	 * @param answerOption
	 */
	public void setAnswerOption(String answerOption) {
		this.answerOption = answerOption;
	}

	/**
	 * @return answer_desc
	 */
	public String getAnswerDesc() {
		return answerDesc;
	}

	/**
	 * @param answerDesc
	 */
	public void setAnswerDesc(String answerDesc) {
		this.answerDesc = answerDesc;
	}

	/**
	 * @return create_time
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return update_time
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return del_flag
	 */
	public Integer getDelFlag() {
		return delFlag;
	}

	/**
	 * @param delFlag
	 */
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
}