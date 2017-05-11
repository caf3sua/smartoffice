package com.viettel.smartoffice.util.dozer;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

public class DozerMapperProvider implements MapperProvider {

	private DozerBeanMapper dozerMapper;

	public <T> T mapObject(Object src, T des) {
		if (src != null && des != null) dozerMapper.map(src, des);
		return des;
	}

	public <T> T map(Object src, Class<T> des) {
		return src != null && des != null ? dozerMapper.map(src, des) : null;
	}

	public <T> T mapObject(Object src, T des, String mapId) {
		if (src != null && des != null && mapId != null) dozerMapper.map(src, des, mapId);
		return des;
	}

	public <T> T map(Object src, Class<T> des, String mapId) {
		return src != null && des != null && mapId != null ? dozerMapper.map(src, des, mapId) : null;
	}

	public <T> List<T> mapList(List<?> src, Class<T> des) {
		List<T> results = new ArrayList<T>();
		if (src != null && des != null) {
			for (int i = 0; i < src.size(); i++) {
				results.add(this.map(src.get(i), des));
			}
		}
		return results;
	}

	public <T> List<T> mapList(List<?> src, Class<T> des, String mapId) {
		List<T> results = new ArrayList<T>();
		if (src != null && des != null && mapId != null) {
			for (int i = 0; i < src.size(); i++) {
				results.add(this.map(src.get(i), des, mapId));
			}
		}
		return results;
	}

	public void setDozerMapper(DozerBeanMapper dozerMapper) {
		this.dozerMapper = dozerMapper;
	}

}
