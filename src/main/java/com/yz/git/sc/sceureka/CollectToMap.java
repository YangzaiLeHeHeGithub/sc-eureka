package com.yz.git.sc.sceureka;

import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        //003
//        User user1 = new User();
//        user1.setUsername("张三");
//        user1.setAge(0);
//        user1.setGender(0);
//        user1.setIdNo("10001");
//        user1.setPhone("110");
//        User user2 = new User();
//        user2.setUsername("李四");
//        user2.setAge(0);
//        user2.setGender(0);
//        user2.setIdNo("10002");
//        user2.setPhone("120");
//        User user3 = new User();
//        user3.setUsername("王五");
//        user3.setAge(0);
//        user3.setGender(0);
//        user3.setIdNo("10003");
//        user3.setPhone("119");
//        User user4 = new User();
//        user4.setUsername("王五1");
//        user4.setAge(0);
//        user4.setGender(0);
//        user4.setIdNo("10004");
//        user4.setPhone("119");
//        User user5 = new User();
//        user5.setUsername("王五2");
//        user5.setAge(0);
//        user5.setGender(0);
//        user5.setIdNo("10005");
//        user5.setPhone("119");
//        User user6 = new User();
//        user6.setUsername("王五3");
//        user6.setAge(0);
//        user6.setGender(0);
//        user6.setIdNo("10005");
//        user6.setPhone("119");
//        List<User> users = new ArrayList<>();
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
//        users.add(user5);
//        users.add(user6);
//        List<User> list1 = new ArrayList<>();
//        List<User> list2 = new ArrayList<>();
//        list1.add(user1);
//        list1.add(user2);
//        list1.add(user3);
//        list2.add(user4);
//        list2.add(user5);
//        list2.add(user6);
//
//        List<User> list3 = Stream.of(list1, list2).flatMap(Collection::stream).distinct().collect(Collectors.toList());
//        List<User> list4 = new ArrayList<>(list1);
//        list4.addAll(list2);
//
//        Map<String,String> userMaps = users.stream().collect(Collectors.toMap(User::getIdNo,User::getUsername,(old, n) -> old+"重复"));
//
//        Map<String,Integer> userMaps01 = users.stream().collect(Collectors.toMap(User::getIdNo,value -> 1,Integer::sum));
//        Map<String,Integer> userMaps011 = list3.stream().collect(Collectors.toMap(User::getIdNo,value -> 1,Integer::sum));
//        List<String> userList = userMaps01.entrySet().stream().filter( entry -> entry.getValue() < 2).map(Map.Entry::getKey).collect(Collectors.toList());
//        //System.out.println(userMaps);
//        System.out.println(userMaps01);
//        System.out.println(userMaps011);
//        //System.out.println(userList);
//
//
//        List<String> kl = new ArrayList<>();

//        ThreadLocalRandom random = ThreadLocalRandom.current();
//        System.out.println(random.ints().sum());
        List<String> strings = new ArrayList<>();
        strings.isEmpty();
        List list =  Collections.emptyList();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(CollectionUtils.isEmpty(list));
        LongAdder longAdder = new LongAdder();
        System.out.println(longAdder.intValue());


    }

}

