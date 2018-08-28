package com.maryanto.dimas.plugins.web.commons.data;

import com.maryanto.dimas.plugins.web.commons.ui.datatables.DataTablesRequest;
import com.maryanto.dimas.plugins.web.commons.ui.datatables.DataTablesResponse;

/**
 * @param <T> Model class
 */
public interface DataTablesPatternService<T> {

    DataTablesResponse<T> datatables(DataTablesRequest<T> params);
}
