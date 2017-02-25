package com.flaginfo.wdy.commons.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T extends Serializable, ID extends Serializable> {

	T selectByPrimaryKey(ID id);

	List<T> selectAll();

	int insert(T record);

	int insertSelective(T record);

	int deleteByPrimaryKey(ID id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);

}
