package com.flaginfo.wdy.api.user.domain;

import java.io.Serializable;
import java.util.Date;

import com.flaginfo.wdy.commons.domain.AbstractEntity;

public class WdyQuestionOption extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String qsId;

    private String optionKey;

    private String optionVal;

    private Integer optionSort;

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
     * @return option_key
     */
    public String getOptionKey() {
        return optionKey;
    }

    /**
     * @param optionKey
     */
    public void setOptionKey(String optionKey) {
        this.optionKey = optionKey;
    }

    /**
     * @return option_val
     */
    public String getOptionVal() {
        return optionVal;
    }

    /**
     * @param optionVal
     */
    public void setOptionVal(String optionVal) {
        this.optionVal = optionVal;
    }

    /**
     * @return option_sort
     */
    public Integer getOptionSort() {
        return optionSort;
    }

    /**
     * @param optionSort
     */
    public void setOptionSort(Integer optionSort) {
        this.optionSort = optionSort;
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