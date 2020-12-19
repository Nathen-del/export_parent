package cn.nathen.web.exceptions;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Copyright (C), 2018-2020
 * FileName: CustomerExceptionResolver
 * Author:   pdven
 * Date:     2020/12/19 16:49
 * Description: 自定义异常类
 * 自定义异常的处理器
 *     1. 自定义一个类实现HandlerExceptionResolver接口，
 *     2. 实现该接口的方法
 *     3. 创建异常处理器的对象
 */

@Component
public class CustomerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        ModelAndView mv = new ModelAndView();
        //2. 设置异常的信息保存 到request域中
        mv.addObject("errorMsg",ex.getMessage());
        //3. 设置跳转视图名称
        mv.setViewName("error");

        return mv;
    }
}
