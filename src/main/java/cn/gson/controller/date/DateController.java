package cn.gson.controller.date;

import cn.gson.controller.annoations.Api;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2018 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : 日期</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2018年02月20日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@RequestMapping("/date")
@RestController
@Api
public class DateController {
    @GetMapping("/d")
    public Date getDate(@DateTimeFormat(pattern = "yyyy-MM-dd") Date d) {
        System.out.println(d);
        return d;
    }



}