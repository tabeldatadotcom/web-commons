package com.maryanto.dimas.plugin.test.mapper;

import com.maryanto.dimas.plugins.web.commons.converter.DateIso8601Converter;
import junit.framework.TestCase;
import org.junit.Test;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TestIso8601 extends TestCase {

    @Test
    public void testFromIso8601ToTimestamp() {
        String tanggal = "2016-02-01T16:00:00+07:00";
        Timestamp actualValue = DateIso8601Converter.fromIso8601(tanggal);
        LocalDateTime expected = LocalDateTime.of(2016, 2, 1, 16, 0, 0, 0);
        assertEquals("from String to Timestamp", Timestamp.valueOf(expected), actualValue);
    }

    @Test
    public void testFromTimestampOffset7ToIso8601() {
        LocalDateTime value = LocalDateTime.of(2016, 2, 1, 16, 0, 0, 0);
        String expected = "2016-02-01T16:00:00+07:00";
        String actualValue = DateIso8601Converter.fromTimestamp(Timestamp.valueOf(value));
        assertEquals("from timestamp to string", expected, actualValue);
    }
}
