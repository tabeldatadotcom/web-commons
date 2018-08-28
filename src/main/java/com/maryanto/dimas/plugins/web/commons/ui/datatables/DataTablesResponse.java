package com.maryanto.dimas.plugins.web.commons.ui.datatables;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@ToString(exclude = "data")
public class DataTablesResponse<T> {

    private List<T> data;
    private Long draw;
    private Long recordsTotal;
    private Long recordsFiltered;

}
