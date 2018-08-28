package com.maryanto.dimas.plugins.web.commons.ui.datatables.service;

import com.maryanto.dimas.plugins.web.commons.data.service.ServiceCrudPattern;

import java.io.Serializable;

/**
 * @param <T>
 * @param <ID>
 */
public interface ServiceCrudDataTablesPattern<T, ID extends Serializable> extends
        ServiceCrudPattern<T, ID>,
        ServiceDataTablesPattern<T> {
}
