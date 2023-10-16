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
 * Utilities for JDBC.
 */
/**
 * MyBatis的`jdbc`包主要用于处理JDBC操作¹。以下是一些主要的类及其作用：
 *
 * - `JdbcTransaction`：这个类实现了`Transaction`接口，提供了对JDBC事务的基本操作，如开始事务、提交事务、回滚事务和关闭事务¹。
 *
 * - `SqlRunner`：这个类提供了一种直接执行SQL语句的方式，它可以执行查询语句并返回结果，也可以执行插入、更新和删除语句¹。
 *
 * - `SimpleExecutor`：这个类是MyBatis的基本执行器，它用于处理普通的SQL语句¹。
 *
 * 总体来说，MyBatis的`jdbc`包提供了一套完整的工具集，用于处理与资源加载和类加载相关的任务。
 *
 * 源: 与必应的对话， 2023/10/17
 * (1) 深入浅出MyBatis：JDBC和MyBatis介绍 - 知乎 - 知乎专栏. https://zhuanlan.zhihu.com/p/35227543.
 * (2) 实际开发中，是使用JDBCTemplate和Mybatis?感觉JDBCTemplate会简单好用点？ - 知乎. https://www.zhihu.com/question/439284292.
 * (3) 木木的Java知识整理——JDBC与MyBatis的区别 - CSDN博客. https://blog.csdn.net/weixin_42287169/article/details/105781951.
 * (4) MyBatis框架的作用_mybatis框架的主要作用-CSDN博客. https://blog.csdn.net/qq_37740841/article/details/95211518.
 * (5) 什么是Mybatis？最全Mybatis学习笔记 - 知乎 - 知乎专栏. https://zhuanlan.zhihu.com/p/351830443.
 * (6) undefined. http://mybatis.org/dtd/mybatis-3-config.dtd.
 */
package org.apache.ibatis.jdbc;
