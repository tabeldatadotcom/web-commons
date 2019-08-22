package com.maryanto.dimas.plugin.test.mapper;

import com.maryanto.dimas.plugins.web.commons.ui.datatables.OrderingByColumns;
import junit.framework.TestCase;
import org.junit.Test;

public class TestOrderingColumns extends TestCase {

    private OrderingByColumns columns;

    @Override
    protected void setUp() throws Exception {
        this.columns = new OrderingByColumns("id", "name", "email", "created_date", "created_by", "last_updated_by", "last_updated_by");
    }

    @Test
    public void testOrderBy() {
        String asc0 = columns.orderBy("asc", 0L);
        assertEquals("order asc index ke 0", " order by id asc ", asc0);

        String desc7IndexOfOutbound = columns.orderBy("Desc", 7L);
        assertNotSame("order Desc index ke 7 notSame", " order by something asc ", desc7IndexOfOutbound);
        assertEquals("order Desc index ke 7 eq", "", desc7IndexOfOutbound);
    }
}
