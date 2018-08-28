package com.maryanto.dimas.plugins.web.commons.converter;

import java.beans.PropertyEditorSupport;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtilConverter extends PropertyEditorSupport {

    public static final String DEFAULT_BATCH_PATTERN = "yyyy-MM-dd HH:mm:ss";
    private final SimpleDateFormat sdf;

    /**
     * uses default pattern dd/MM/yyyy for date parsing.
     */
    public DateUtilConverter() {
        this.sdf = new SimpleDateFormat(DEFAULT_BATCH_PATTERN);
    }

    public DateUtilConverter(String pattern) {
        this.sdf = new SimpleDateFormat(pattern);
    }

    @Override
    public void setAsText(String text) {
        try {
            setValue(new Date(this.sdf.parse(text).getTime()));
        } catch (ParseException ex) {
            throw new IllegalArgumentException("Could not parse date: " + ex.getMessage(), ex);
            //  ex.printStackTrace();
        }
    }

    @Override
    public String getAsText() {
        Date value = (Date) getValue();
        return (value != null ? this.sdf.format(value) : "");
    }
}
