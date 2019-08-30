package com.maryanto.dimas.plugins.web.commons.converter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateIso8601Converter {

    public static Timestamp fromIso8601(String tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        LocalDateTime value = LocalDateTime.parse(tanggal, formatter);
        return Timestamp.valueOf(value);
    }

    public static String fromTimestamp(Timestamp tanggal) {
        OffsetDateTime offsetDateTime = tanggal.toLocalDateTime().atOffset(ZoneOffset.ofHours(7));
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        String convert = offsetDateTime.format(formatter);
        return convert;
    }

}
