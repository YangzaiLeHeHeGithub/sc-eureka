package com.yz.git.sc.sceureka;

import java.util.Objects;

/**
 * @description: 测试错误commit
 * @title: aa
 * @projectName： sc-eureka
 * @author： xuyang
 * @date： 2019/11/5/10:54
 * @version： 1.0
 */
public class aa {

    public static void main(String[] args) {

        System.out.println(Objects.equals(new Integer(1),1));


        Long  a1 = 1000L;
        Long a2 = new Long(1000);

        System.out.println(Objects.equals(a1,a2));
        System.out.println(a1.longValue() == a2.longValue());
        System.out.println(a1.longValue() == a2.longValue());
    }
}
