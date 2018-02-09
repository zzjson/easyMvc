package cn.gson.zzymvc.bean;

import java.lang.reflect.Method;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2018 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : 用来封装每一个处理请求方法的信息</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2018年02月09日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
public class ControllerBean {

    private Class<?> controllerClass;

    //当前方法对象
    private Method controllerMethod;

    public ControllerBean(Class<?> controllerClass, Method controllerMethod) {
        this.controllerClass = controllerClass;
        this.controllerMethod = controllerMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }


    public Method getControllerMethod() {
        return controllerMethod;
    }
}