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
 * Binds mapper interfaces with mapped statements.
 */
/**
 * MyBatis的`binding`模块是用来将Mapper接口与其映射文件进行绑定的¹。这个模块位于`org.apache.ibatis.binding`包下，核心的类有如下四个¹：
 *
 * 1. `MapperRegistry`：映射器注册器，这个类用来记录Mapper类与`MapperProxyFactory`的映射关系¹。
 *
 * 2. `MapperProxyFactory`：映射器代理类工厂，用于生成mapper接口动态代理的实例对象¹。
 *
 * 3. `MapperProxy`：映射器代理类¹。
 *
 * 4. `MapperMethod`：映射器方法类¹。
 *
 * 这个模块主要起到连接 Mapper.java 和 Mapper.xml的作用⁴。总的来说，MyBatis的`binding`模块提供了一套完整的工具集，用于处理与资源加载和类加载相关的任务。
 *
 * 源: 与必应的对话， 2023/10/17
 * (1) Mybatis(五): binding模块详解 - 知乎. https://zhuanlan.zhihu.com/p/409524596.
 * (2) mybatis-binding 绑定包解析_mybatis如何对bind绑定的集合做处理-CSDN博客. https://blog.csdn.net/qq_28695733/article/details/107051420.
 * (3) MyBatis中binding 模块的作用是什么 - 大数据 - 亿速云. https://www.yisu.com/zixun/599413.html.
 * (4) mybatis源码学习------binding模块 - CSDN博客. https://blog.csdn.net/qq_35835624/article/details/108873989.
 * (5) MyBatis bind 标签 - Spring中文网. http://www.mybatis.cn/mybatis/52.html.
 */
package org.apache.ibatis.binding;
