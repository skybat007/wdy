package com.flaginfo.wdy.api.user.domain;

import java.io.Serializable;
import java.util.Date;

import com.flaginfo.wdy.commons.domain.AbstractEntity;

public class WdyQuestionnaire extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String spId;

    private String questionnaireTitle;

    private String questionnaireDesc;

    private String resultPrompt;

    private Integer questionnaireStatus;

    private Date releaseTime;

    private Date deadline;

    private Date createTime;

    private Date updateTime;

    private Integer delFlag;

    /**
     * @return sp_id
     */
    public String getSpId() {
        return spId;
    }

    /**
     * @param spId
     */
    public void setSpId(String spId) {
        this.spId = spId;
    }

    /**
     * @return questionnaire_title
     */
    public String getQuestionnaireTitle() {
        return questionnaireTitle;
    }

    /**
     * @param questionnaireTitle
     */
    public void setQuestionnaireTitle(String questionnaireTitle) {
        this.questionnaireTitle = questionnaireTitle;
    }

    /**
     * @return questionnaire_desc
     */
    public String getQuestionnaireDesc() {
        return questionnaireDesc;
    }

    /**
     * @param questionnaireDesc
     */
    public void setQuestionnaireDesc(String questionnaireDesc) {
        this.questionnaireDesc = questionnaireDesc;
    }

    /**
     * @return result_prompt
     */
    public String getResultPrompt() {
        return resultPrompt;
    }

    /**
     * @param resultPrompt
     */
    public void setResultPrompt(String resultPrompt) {
        this.resultPrompt = resultPrompt;
    }

    /**
     * @return questionnaire_status
     */
    public Integer getQuestionnaireStatus() {
        return questionnaireStatus;
    }

    /**
     * @param questionnaireStatus
     */
    public void setQuestionnaireStatus(Integer questionnaireStatus) {
        this.questionnaireStatus = questionnaireStatus;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return release_time - ����ʱ��
     */
    public Date getReleaseTime() {
        return releaseTime;
    }

    /**
     * ���÷���ʱ��
     *
     * @param releaseTime ����ʱ��
     */
    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * ��ȡ��ֹʱ��
     *
     * @return deadline - ��ֹʱ��
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * ���ý�ֹʱ��
     *
     * @param deadline ��ֹʱ��
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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