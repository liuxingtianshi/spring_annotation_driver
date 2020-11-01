package com.atguigu.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * ����һ��Spring�����FactoryBean
 */
public class ColorFactoryBean implements FactoryBean<Color> {

    /**
     * @return ����һ��Color��������������ӵ�������
     * @throws Exception
     */
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean...getObject...");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * @return true�����bean�ǵ�ʵ�����������б���һ�ݣ�false����ʵ����ÿ�λ�ȡ���ᴴ��һ���µ�bean��
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}