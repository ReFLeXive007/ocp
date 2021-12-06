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

/**
 * @author Artur Gareev
 */
public class SplitTest {
    public static void main(String[] args) {
        String str = "#0000027251##79250303840";
        System.out.println(str + " => " + str.split("#").length);
        str = "#4564654657";
        System.out.println(str + " => " + str.split("#").length);
        System.out.println("===================================");
        toE164("73472434619", "73472434619");
        toE164("3472434619", "93472434619");
        toE164("83472434619", "1111111111");
        toE164("", "73472434619");
        toE164("#73472434619", "22222222222");
        toE164("*73472434619", "33333333333");
        toE164("*#73472434619", "44444444444");
        toE164("", "#55555555555");
        toE164("", "#0023445##66666666666");
        System.out.println("=========================");
        System.out.printf("#0023445##66666666666 => cid: %s%n", "#0023445##66666666666".split("#")[1]);
    }

    private static void toE164(String numOut, String numIn) {
        String result = numOut;
        if (result.isBlank()) {
            result = numIn;
        }
        if (result.contains("*")) {
            result = result.replace("*","");
        }
        if (result.length() == 10) {
            result = "7" + result;
        } else if (result.length() == 11 && result.startsWith("8")) {
            result = "7" + result.substring(1);
        } else if (result.contains("#")) {
            //тут может быть несколько вариантов, в зависимости от кол-ва #
            String[] parts = result.split("#");
            if (parts.length == 2) {
                result = result.replace("#","");
            } else if (parts.length == 4) {
                result = parts[3];
            }
        }
        System.out.printf("toE164 ( out = %s, in = %s ) -> %s%n", numOut, numIn, result);
    }
}
