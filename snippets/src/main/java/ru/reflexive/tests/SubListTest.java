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

import java.util.List;

public class SubListTest {
    public static void main(String[] args) {
        printAndSublist(List.of("one", "two", "three"));
        printAndSublist(List.of("one", "two"));
        printAndSublist(List.of("one"));
    }

    private static void printAndSublist(List<String> list) {
        System.out.println("================================");
        System.out.println("Original list: ");
        list.forEach(System.out::println);
        System.out.println("\nLast element:" + list.get(list.size() - 1));
        System.out.println("\nSubList list: ");
        list.subList(0, list.size() - 1).forEach(System.out::println);
    }
}
