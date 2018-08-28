package com.maryanto.dimas.plugins.web.commons.data.service;

import com.maryanto.dimas.plugins.web.commons.ui.datatables.DataTablesRequest;
import com.maryanto.dimas.plugins.web.commons.ui.datatables.DataTablesResponse;

/**
 * @param <T> Model class
 */
public interface DataTablesPatternService<T> {

    /**
     * @param params
     * @return
     */
    DataTablesResponse<T> datatables(DataTablesRequest<T> params);
}
