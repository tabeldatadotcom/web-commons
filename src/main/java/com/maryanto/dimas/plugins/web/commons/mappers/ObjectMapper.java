package com.maryanto.dimas.plugins.web.commons.mappers;

/**
 * @param <T1> entity
 * @param <T2> dto
 */
public interface ObjectMapper<T1, T2> {

    T2 convertToDto(T1 entity);

    T1 convertToEntity(T2 dto);

}
