/*
 * Copyright 2021 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right holder only.
 */

package ru.reflexive;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.Map;

/**
 * @author Artur Gareev
 */
@Data
@RequiredArgsConstructor
@ConstructorBinding
@ConfigurationProperties("catalog.structtype.tag")
public class CatalogAppConfig {

    /**
     * Соответствие между
     */
    private final Map<Integer, Integer> mapping;
}
