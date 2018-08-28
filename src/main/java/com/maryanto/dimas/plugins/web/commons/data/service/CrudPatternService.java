package com.maryanto.dimas.plugins.web.commons.data.service;

import java.io.Serializable;

/**
 * @param <T>
 * @param <ID>
 */
public interface CrudPatternService<T, ID extends Serializable> {

    /**
     * @param param
     * @return
     */
    T save(T param);

    /**
     * @param param
     * @return
     */
    T update(T param);

    /**
     * @param param
     * @return
     */
    boolean remove(T param);

    /**
     * @param param
     * @return
     */
    boolean remove(ID param);
}