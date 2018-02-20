package cn.gson.controller.date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2018 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : cn.gson.controller.date</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2018年02月20日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@ControllerAdvice
public class DateFormatAdvice {
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        simpleDateFormat.setLenient(false);
        //是否允许为空
        binder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
    }
}