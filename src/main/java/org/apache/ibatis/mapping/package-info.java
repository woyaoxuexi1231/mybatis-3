/*
 *    Copyright 2009-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/**
 * Base package for mapping.
 */
/**
 * MyBatis的`mapping`包主要用于处理SQL语句的映射¹。以下是一些主要的类及其作用：
 *
 * - `ResultMap`：这个类定义了Java对象与数据库表的映射关系，将查询结果映射到Java对象上，从而实现数据的自动转换和封装¹。
 *
 * - `ParameterMap`：这个类定义了参数映射，将Java对象的属性与SQL语句的参数一一对应¹。
 *
 * - `MappedStatement`：这个类定义了各种SQL语句，包括查询、插入、更新、删除等操作，也可以使用动态SQL语句实现条件查询和多表联合查询等复杂操作¹。
 *
 * 总体来说，MyBatis的`mapping`包提供了一套完整的工具集，用于处理与资源加载和类加载相关的任务。
 *
 * 源: 与必应的对话， 2023/10/17
 * (1) 这下够清楚了吧！详解Mybatis的Mapper映射文件 - 知乎. https://zhuanlan.zhihu.com/p/338300626.
 * (2) Mybatis框架中的mapper文件是用来做什么的？ - 知乎专栏. https://zhuanlan.zhihu.com/p/632626557.
 * (3) 关于mybatis 的mapper namespace 作用及解析 - emanlee - 博客园. https://www.cnblogs.com/emanlee/p/15869468.html.
 */
package org.apache.ibatis.mapping;
