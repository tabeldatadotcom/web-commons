package com.maryanto.dimas.plugins.web.commons.data.service;

import java.io.Serializable;

/**
 * @param <T>
 * @param <ID>
 */
public interface CrudDataTablesPatternService<T, ID extends Serializable> extends
        CrudPatternService<T, ID>,
        DataTablesPatternService<T> {
}
