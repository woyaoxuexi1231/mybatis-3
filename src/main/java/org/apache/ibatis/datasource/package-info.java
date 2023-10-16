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
 * Base package for Datasources.
 */
/**
 * MyBatis的`datasource`包主要用于处理数据库连接¹。以下是一些主要的类及其作用：
 *
 * - `DataSource`：这是一个接口，它定义了获取数据库连接的方法¹。MyBatis的数据源实现也是基于实现`javax.sql.DataSource`来设计的¹。
 *
 * - `PooledDataSource`：这是一个实现了`DataSource`接口的类，它提供了连接池功能¹。
 *
 * - `UnpooledDataSource`：这也是一个实现了`DataSource`接口的类，但它不提供连接池功能¹。
 *
 * - `TransactionFactory`：这个类定义了事务管理器，用于决定事务作用域和控制方式²。
 *
 * 总体来说，MyBatis的`datasource`包提供了一套完整的工具集，用于处理与资源加载和类加载相关的任务。
 *
 * 源: 与必应的对话， 2023/10/17
 * (1) MyBatis源码解析之基础模块—DataSource - 知乎 - 知乎专栏. https://zhuanlan.zhihu.com/p/165310842.
 * (2) mybatis – MyBatis 3 | 入门. https://mybatis.org/mybatis-3/zh/getting-started.html.
 * (3) 浅析动态切换数据源的原理（接上篇）-腾讯云开发者社区-腾讯云. https://cloud.tencent.com/developer/article/1710599.
 * (4) mybatis配置中的数据源datasource是什么？ - CSDN博客. https://blog.csdn.net/daijiguo/article/details/84926805.
 * (5) Java DataSource 学习笔记 - 知乎. https://zhuanlan.zhihu.com/p/578016889.
 * (6) undefined. https://mybatis.org/dtd/mybatis-3-config.dtd.
 */
package org.apache.ibatis.datasource;
