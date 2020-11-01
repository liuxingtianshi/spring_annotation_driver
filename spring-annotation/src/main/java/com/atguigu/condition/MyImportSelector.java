package com.atguigu.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * �Զ����߼�������Ҫ��������
 */
public class MyImportSelector implements ImportSelector {

    /**
     * @param importingClassMetadata :��ǰ��ע@Importע����������ע����Ϣ
     * @return ����Ҫ�����뵽�����е����ȫ����
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // TODO Auto-generated method stub
        //importingClassMetadata
        //������Ҫ����nullֵ
        return new String[]{"com.atguigu.bean.Blue", "com.atguigu.bean.Yellow"};
    }

}
