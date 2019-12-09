package com.yz.git.sc.sceureka;

/**
 * @description: TestNullStr
 * @title: TestNullStr
 * @projectName： sc-eureka
 * @author： xuyang
 * @date： 2019/12/5/16:15
 * @version： 1.0
 */
public class TestNullStr {

    public static void main(String[] args) {
        method(null);
    }
    public static void method(String str){
        switch (str){

            case "sth":
                System.out.println("it`s sth");

            case "null":
                System.out.println("it`s null");
            default:
                System.out.println("default");
        }

    }
}
