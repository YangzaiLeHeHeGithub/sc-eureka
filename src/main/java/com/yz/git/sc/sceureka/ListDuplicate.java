package com.yz.git.sc.sceureka;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: TODO
 * @title: ListDuplicate
 * @projectName： sc-eureka
 * @author： xuyang
 * @date： 2019/12/3/16:01
 * @version： 1.0
 */
public class ListDuplicate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("world");
        System.out.println(getDuplicateElements(list.stream()));
    }

    public static <T> List<T> getDuplicateElements(Stream<T> stream) {
        return stream
                .collect(Collectors.toMap(key -> key, value -> 1, Integer::sum)) // 获得元素出现频率的 Map，键为元素，值为元素出现的次数
                .entrySet().stream() // Set<Entry>转换为Stream<Entry>
                .filter(entry -> entry.getValue() > 1) // 过滤出元素出现次数大于 1 的 entry
                .map(entry -> entry.getKey()) // 获得 entry 的键（重复元素）对应的 Stream
                .collect(Collectors.toList()); // 转化为 List
    }



}
