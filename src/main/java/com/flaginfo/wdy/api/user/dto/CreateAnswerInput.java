package com.flaginfo.wdy.api.user.dto;

import java.io.Serializable;
import java.util.List;

import com.flaginfo.wdy.api.user.domain.WdyAnswerDetail;

public class CreateAnswerInput implements Serializable {

	private static final long serialVersionUID = 1L;

	private String qsId;

	private String userId;

	private Integer cost;

	private Integer source;

	private String fromIp;

	private Integer status;

	private List<WdyAnswerDetail> answers;

	public String getQsId() {
		return qsId;
	}

	public void setQsId(String qsId) {
		this.qsId = qsId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public String getFromIp() {
		return fromIp;
	}

	public void setFromIp(String fromIp) {
		this.fromIp = fromIp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<WdyAnswerDetail> getAnswers() {
		return answers;
	}

	public void setAnswers(List<WdyAnswerDetail> answers) {
		this.answers = answers;
	}

}