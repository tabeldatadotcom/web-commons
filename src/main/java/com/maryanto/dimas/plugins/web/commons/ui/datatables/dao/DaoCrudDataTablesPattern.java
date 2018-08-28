package com.maryanto.dimas.plugins.web.commons.ui.datatables.dao;

import com.maryanto.dimas.plugins.web.commons.data.dao.DaoCrudPattern;

import java.io.Serializable;

/**
 * @param <T>
 * @param <ID>
 */
public interface DaoCrudDataTablesPattern<T, ID extends Serializable> extends
        DaoCrudPattern<T, ID>,
        DaoDataTablesPattern<T> {
}
