package com.maryanto.dimas.plugins.web.commons.ui.datatables;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderingByColumns {

    private List<String> values = new ArrayList();

    /**
     * @param columnsName
     */
    public OrderingByColumns(String... columnsName) {
        this.values.clear();
        this.values = Arrays.asList(columnsName);
        System.out.println(this.values);
    }

    /**
     * @param dir   values ["asc", "desc"]
     * @param index
     * @return when catch error return empty string
     */
    public String orderBy(String dir, Long index) {
        String columnName = null;

        try {
            index = NumberUtils.toLong(index.toString(), 0L);
            columnName = (String) this.values.get(index.intValue());
            return String.format(" order by %s %s ", columnName, StringUtils.isNotBlank(dir) ? dir : "asc");
        } catch (IndexOutOfBoundsException var5) {
            return "";
        } catch (NullPointerException var6) {
            return "";
        }
    }
}
