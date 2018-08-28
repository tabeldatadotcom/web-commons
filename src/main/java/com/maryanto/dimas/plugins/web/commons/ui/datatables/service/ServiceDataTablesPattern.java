package com.maryanto.dimas.plugins.web.commons.ui.datatables.service;

import com.maryanto.dimas.plugins.web.commons.ui.datatables.DataTablesRequest;
import com.maryanto.dimas.plugins.web.commons.ui.datatables.DataTablesResponse;

/**
 * @param <T> Model class
 */
public interface ServiceDataTablesPattern<T> {

    /**
     * @param params
     * @return
     */
    DataTablesResponse<T> datatables(DataTablesRequest<T> params);
}
