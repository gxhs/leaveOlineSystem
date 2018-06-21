package com.ssm.controller.converter;

import org.springframework.format.Formatter;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

//自定义参数绑定
//实现 将日期串转成日期类型(格式是yyyy-MM-dd)
public class DateFormatter implements Formatter<Date> {
    private SimpleDateFormat dateFormat;

    public DateFormatter(String datePattern) {
              dateFormat = new SimpleDateFormat(datePattern);
        dateFormat.setLenient(false);
    }

    @Override
    public Date parse(String s, Locale locale) throws ParseException {
             return new Date(dateFormat.parse(s).getTime());
    }
    @Override
    public String print(Date date, Locale locale) {
               return dateFormat.format(date);
    }
}
