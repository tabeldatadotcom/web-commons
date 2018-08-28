package com.maryanto.dimas.template.web.commons.ui.datatables;

import java.util.List;

public interface DatatablesUtil<T> {

    List<T> list(DataTablesRequest<T> param);

    Long list(T param);

    T save(T param);

    T update(T param);
}
