package com.maryanto.dimas.plugins.web.commons.data;

import java.io.Serializable;

/**
 * @param <T>
 * @param <ID>
 */
public interface CrudDataTablesPatternDao<T, ID extends Serializable> extends
        CrudPatternDao<T, ID>,
        DataTablesPatternDao<T> {
}
