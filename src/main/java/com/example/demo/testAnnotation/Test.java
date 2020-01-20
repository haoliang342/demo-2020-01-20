package com.example.demo.testAnnotation;

@SuppressWarnings("deprecation")
@TestAnnotation(age = 22,name = "haol")
public class Test {

    public static void main(String[] args) {
        /**
         * 是否能获取到注解 TestAnnotation
         */
        boolean hasAnnotationFlog  = Test.class.isAnnotationPresent(TestAnnotation.class);
        if(hasAnnotationFlog){
            /**
             * 获取类上的注解
             */
            TestAnnotation testAnnotation = Test.class.getAnnotation(TestAnnotation.class);
            String name = testAnnotation.name();
            int age = testAnnotation.age();
            System.out.println("name : " + name + "---------------age : "+age );
        }
    }
}
