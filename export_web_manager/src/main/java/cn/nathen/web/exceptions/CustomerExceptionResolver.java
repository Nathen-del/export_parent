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
 * Description: �Զ����쳣��
 * �Զ����쳣�Ĵ�����
 *     1. �Զ���һ����ʵ��HandlerExceptionResolver�ӿڣ�
 *     2. ʵ�ָýӿڵķ���
 *     3. �����쳣�������Ķ���
 */

@Component
public class CustomerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        ModelAndView mv = new ModelAndView();
        //2. �����쳣����Ϣ���� ��request����
        mv.addObject("errorMsg",ex.getMessage());
        //3. ������ת��ͼ����
        mv.setViewName("error");

        return mv;
    }
}
