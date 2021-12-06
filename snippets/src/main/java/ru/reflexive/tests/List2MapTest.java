/*
 * Copyright 2021 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right holder only.
 */

package ru.reflexive.tests;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class List2MapTest {
    public static void main(String[] args) {
        List<Value> list = List.of(new Value("key1", 12, 33L, true),
                                    new Value("key2", 213, 343L, true),
                                    new Value("key2", 213, 343L, false),
                                    new Value("key3", 332, 88L, true));
        Map<String, Value> valueMap = list.stream().filter(Value::isMain).collect(Collectors.toMap(Value::getKey, Function.identity()));
        valueMap.entrySet().forEach(System.out::println);
        System.out.println(list);
    }

    @Data
    @AllArgsConstructor
    private static class Value {
        String key;
        int val;
        long subValue;
        boolean isMain;
    }
}
