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

import java.util.Arrays;
import java.util.List;

/**
 * Проверяем, что будет, если бросить рантайм-исключение внутри вложенной лямбды
 *
 * @author Artur Gareev
 */
public class RuntimeExceptionInInnerLambda {
    public static void main(String[] args) {
        try {
            List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9);
            lst.forEach(n -> {
                System.out.println(n);
                List<String> strings = Arrays.asList("t","a","r","b","a","l","l");
                strings.forEach(m -> {
                    System.out.println(m);
                    throw new RuntimeException("Exception in 2nd lambda");
                });
                System.out.println("after lambda with exception");
            });
        } catch (RuntimeException e) {
            System.out.println("catched outside: " + e.getMessage());
        }
        // была мысль, что если внутри обработки вложенной лямбды бросить рантайм-исключение,
        // то вернется управление в вышестояющую лямбду, а не прервется весь поток выполнения.
        // Но в итоге это внутреннее исключение перехватилось на самом верху. что очень хорошо.
    }
}
