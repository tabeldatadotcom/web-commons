package com.maryanto.dimas.template.web.commons.data;

import java.io.Serializable;

/**
 * @param <T>
 * @param <ID>
 */
public interface CrudDataTablesPatternDao<T, ID extends Serializable> extends
        CrudPatternDao<T, ID>,
        DataTablesPatternDao<T> {
}
