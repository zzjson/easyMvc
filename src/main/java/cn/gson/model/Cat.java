package cn.gson.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2018 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : cn.gson.model</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2018年02月17日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat {
    private String name;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
}