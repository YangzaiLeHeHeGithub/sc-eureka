package com.yz.git.sc.sceureka;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @description: CollectToMap M
 * @title: CollectToMap
 * @projectName： sc-eureka
 * @author： xuyang
 * @date： 2019/12/3/16:24
 * @version： 1.0
 */
public class CollectToMap {

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
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        Map<String,String> userMaps = users.stream().collect(Collectors.toMap(User::getIdNo,User::getUsername,(old, n) -> old+"1"));
        //Collectors.toMap(User::getIdNo,User::getUsername,(old, n) -> old)

        System.out.println(userMaps);

    }

}
