package com.viettel.smartoffice.util.dozer;

import java.util.List;

public interface MapperProvider {

	<T> T mapObject(Object sourceObject, T destinationObject);

	<T> T map(Object sourceObject, Class<T> destinationClass);

	<T> T mapObject(Object sourceObject, T destinationObject, String mapId);

	<T> T map(Object sourceObject, Class<T> destinationClass, String mapId);

	<T> List<T> mapList(List<?> sourceObjects, Class<T> destinationClass);

	<T> List<T> mapList(List<?> sourceObjects, Class<T> destinationClass, String mapId);

}
