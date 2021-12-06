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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbcentTest {

    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> strings = Arrays.asList("artur", "gareev");
        putMap(map, strings);

        List<String> v = Arrays.asList("hhh", "mmm");
        putMap(map, v);

        System.out.println(map.get("artur"));
    }

    static void putMap(Map<String, List<String>> map, List<String> list){
        List<String> artur = map.computeIfAbsent("artur", k -> new ArrayList<>());
        artur.addAll(list);
    }
}
