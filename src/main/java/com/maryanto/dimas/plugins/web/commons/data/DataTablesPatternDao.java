package com.maryanto.dimas.plugins.web.commons.data;

import com.maryanto.dimas.plugins.web.commons.ui.datatables.DataTablesRequest;

import java.util.List;

/**
 * @param <T> target model
 */
public interface DataTablesPatternDao<T> {

    /**
     * @param params
     * @return
     */
    List<T> datatables(DataTablesRequest<T> params);

    /**
     * @param params
     * @return
     */
    Long datatables(T params);
}
