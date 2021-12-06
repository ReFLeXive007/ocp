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
import java.util.List;

public class ListDifferences {

    public static void main(String[] args) {
        List<String> one = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven"));
        List<String> two = Arrays.asList("two", "four", "six");
        List<String> three = Arrays.asList("one", "five", "eight", "nine", "ten");

        List<String> oneMinusTwo = new ArrayList<>(one);
        oneMinusTwo.removeAll(two);
        System.out.println(oneMinusTwo);

        List<String> oneSameThree = new ArrayList<>(one);
        oneSameThree.retainAll(three);
        System.out.println(oneSameThree);

    }
}
