package com.maryanto.dimas.plugins.web.commons.data.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * @param <T>
 * @param <ID>
 */
public interface DaoCrudPattern<T, ID extends Serializable> {

    /**
     * @param param
     * @return
     */
    Optional<T> findId(ID param);

    /**
     * @return
     */
    List<T> findAll();

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
    boolean removeById(ID param);
}
