package com.maryanto.dimas.plugins.web.commons.ui.datatables;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataTablesRequest<T> {

    private Long draw;
    private Long length;
    private Long start;
    private String colDir;
    private Long colOrder;
    private T value;

}
