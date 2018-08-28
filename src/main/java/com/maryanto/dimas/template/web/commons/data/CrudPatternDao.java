package com.maryanto.dimas.template.web.commons.data;

import java.io.Serializable;

public interface CrudPatternDao<T, ID extends Serializable> {

    T save(T param);

    T update(T param);

    boolean remove(T param);

    boolean remove(ID param);
}
