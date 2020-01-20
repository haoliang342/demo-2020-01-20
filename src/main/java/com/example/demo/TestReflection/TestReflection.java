package com.example.demo.TestReflection;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.*;
import java.util.HashMap;

public class TestReflection {

    private static String TAG = "Reflection : {}";

    public static final Logger logger = LoggerFactory.getLogger(TestReflection.class);

    public void testRefleciton(){
        //获取Animal的Class对象
        Class c = Animal.class;
        //通过Class对象反射获取Animal的构造方法
        try {
            Constructor constructor =  c.getConstructor(String.class,int.class);
            //调用构造方法来获取实例
            try {
                Animal animal = (Animal) constructor.newInstance("x",3);
                System.out.println(animal.toString());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    /**
     * HashMap DEMO
     */
    public void testReflection1(){
        /**
         * ? 表示可以指向任意类型。
         */
        Class<?> c = HashMap.class;
        //获取类名
        String className = c.getCanonicalName();
        //获取类限定符
        String ModifiersName = Modifier.toString(c.getModifiers());
        logger.info("类名: " + className);
        logger.info( TAG + ModifiersName);
        //获取类泛型信息
        TypeVariable[] tv = c.getTypeParameters();
        if(tv.length>0){
            StringBuffer stringBuffer = new StringBuffer("Paramters : ");
            for(TypeVariable t : tv){
                stringBuffer.append(t.getName());
                stringBuffer.append(" ");
            }
            logger.info("类泛型信息: "+ stringBuffer.toString());
        }else {
            logger.info("no paramters");
        }

        //获取类实现的所有接口
        Type[] intfs   = c.getGenericInterfaces();
        if (intfs.length != 0) {
            StringBuilder interfaces = new StringBuilder("Implemented Interfaces : ");
            for (Type intf : intfs){
                interfaces.append(intf.toString());
                interfaces.append(" ");
            }
            logger.info(TAG ,interfaces.toString());
        } else {
            logger.info(TAG ,"  -- No Implemented Interfaces --");
        }
    }
}
