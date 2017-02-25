package com.flaginfo.wdy.api.user.domain;

import java.io.Serializable;
import java.util.Date;

import com.flaginfo.wdy.commons.domain.AbstractEntity;

public class WdyQuestionAnswer extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String qsId;

    private String userId;

    private Integer cost;

    private Integer source;

    private String fromIp;

    private Integer status;

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
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return cost
     */
    public Integer getCost() {
        return cost;
    }

    /**
     * @param cost
     */
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    /**
     * @return source
     */
    public Integer getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * @return from_ip
     */
    public String getFromIp() {
        return fromIp;
    }

    /**
     * @param fromIp
     */
    public void setFromIp(String fromIp) {
        this.fromIp = fromIp;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
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