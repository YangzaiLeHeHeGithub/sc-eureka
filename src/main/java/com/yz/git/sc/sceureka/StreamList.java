package com.yz.git.sc.sceureka;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: StreamList
 * @title: StreamList
 * @projectName： sc-eureka
 * @author： xuyang
 * @date： 2019/12/4/10:26
 * @version： 1.0
 */
public class StreamList {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setUsername("张三");
        user1.setAge(0);
        user1.setGender(0);
        user1.setIdNo("10001");
        user1.setPhone("110");
        User user2 = new User();
        user2.setUsername("李四");
        user2.setAge(0);
        user2.setGender(0);
        user2.setIdNo("10002");
        user2.setPhone("120");
        User user3 = new User();
        user3.setUsername("王五");
        user3.setAge(0);
        user3.setGender(0);
        user3.setIdNo("10003");
        user3.setPhone("119");
        User user4 = new User();
        user4.setUsername("王五");
        user4.setAge(0);
        user4.setGender(0);
        user4.setIdNo("10003");
        user4.setPhone("119");
        User user5 = new User();
        user5.setUsername("王五2");
        user5.setAge(0);
        user5.setGender(0);
        user5.setIdNo("10004");
        user5.setPhone("119");
        User user6 = new User();
        user6.setUsername("王五3");
        user6.setAge(0);
        user6.setGender(0);
        user6.setIdNo("10005");
        user6.setPhone("119");
        List<User> list1 = new ArrayList<>();
        List<User> list2 = new ArrayList<>();
        List<User> listJiaoji = new ArrayList<>();
        List<User> listBingji = new ArrayList<>();
        List<User> listChaji = new ArrayList<>();
        list1.add(user1);
        list1.add(user2);
        list1.add(user3);
        list2.add(user4);
        list2.add(user5);
        list2.add(user6);
        listJiaoji = list1.stream().filter(list2::contains).collect(Collectors.toList());
        listBingji = Stream.of(list1, list2).flatMap(Collection::stream).distinct().collect(Collectors.toList());
        System.out.println(listJiaoji);
        System.out.println(listBingji);



    }
}
