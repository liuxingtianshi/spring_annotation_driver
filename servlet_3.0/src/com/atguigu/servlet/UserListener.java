package com.atguigu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ������Ŀ��������ֹͣ
 */
public class UserListener implements ServletContextListener {

    /**
     * ����ServletContext����
     */
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("UserListener...contextDestroyed...");
    }

    /**
     * ����ServletContext������ʼ��
     * TODO ����ط�Ҳ���Ը�Servletע�����
     * @param arg0
     */
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        ServletContext servletContext = arg0.getServletContext();
        System.out.println("UserListener...contextInitialized...");
    }

}
