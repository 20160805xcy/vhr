package org.sang.common;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sang on 2018/1/13.
 */
public class DateConverter implements Converter<String,Date> {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public Date convert(String s) {
        if ("".equals(s) || s == null || "null".equals(s)) {
            Date date = null;
            try {
                date = simpleDateFormat.parse("2019-06-23");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return date;
        }
        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}