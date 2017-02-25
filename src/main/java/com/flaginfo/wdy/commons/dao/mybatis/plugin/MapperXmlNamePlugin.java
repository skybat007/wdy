package com.flaginfo.wdy.commons.dao.mybatis.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

public class MapperXmlNamePlugin extends PluginAdapter {

	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public void initialized(IntrospectedTable table) {
		super.initialized(table);

		table.setMyBatis3JavaMapperType(table.getMyBatis3JavaMapperType().replaceAll("Mapper", ""));
	}
}
