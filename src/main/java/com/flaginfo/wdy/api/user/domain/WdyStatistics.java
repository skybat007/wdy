package com.flaginfo.wdy.api.user.domain;

import java.io.Serializable;
import java.util.Date;

import com.flaginfo.wdy.commons.domain.AbstractEntity;

public class WdyStatistics extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String spId;

    private String qsId;

    private Integer problemTotal;

    private Integer visitorNum;

    private Integer submitNum;

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
     * @return problem_total
     */
    public Integer getProblemTotal() {
        return problemTotal;
    }

    /**
     * @param problemTotal
     */
    public void setProblemTotal(Integer problemTotal) {
        this.problemTotal = problemTotal;
    }

    /**
     * @return visitor_num
     */
    public Integer getVisitorNum() {
        return visitorNum;
    }

    /**
     * @param visitorNum
     */
    public void setVisitorNum(Integer visitorNum) {
        this.visitorNum = visitorNum;
    }

    /**
     * @return submit_num
     */
    public Integer getSubmitNum() {
        return submitNum;
    }

    /**
     * @param submitNum
     */
    public void setSubmitNum(Integer submitNum) {
        this.submitNum = submitNum;
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