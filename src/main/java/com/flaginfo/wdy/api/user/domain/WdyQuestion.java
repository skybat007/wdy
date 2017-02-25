package com.flaginfo.wdy.api.user.domain;

import java.io.Serializable;
import java.util.Date;

import com.flaginfo.wdy.commons.domain.AbstractEntity;

public class WdyQuestion extends AbstractEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String qsId;

    private String question;

    private Integer sort;

    private Integer type;

    private Integer isNeed;

    private Date createTime;

    private Date updateTime;

    private Integer delFlag;

    /**
     * @return qs_id
     */
    public String getQsId() {
        return qsId;
    }

    /**
     * @param qsId
     */
    public void setQsId(String qsId) {
        this.qsId = qsId;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return is_need
     */
    public Integer getIsNeed() {
        return isNeed;
    }

    /**
     * @param isNeed
     */
    public void setIsNeed(Integer isNeed) {
        this.isNeed = isNeed;
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