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
 * Parsing utils.
 */
/**
 * MyBatis的`parsing`包主要用于解析MyBatis的配置文件和映射文件¹。以下是一些主要的类及其作用：
 *
 * - `TokenHandler`：这是一个接口，只有一个函数，就是对字符串进行处理²。
 *
 * - `GenericTokenParser`：这个类是对常用Token进行解析的类，它会将openToken和endToken间的字符串取出来用handler处理下，然后再拼接到一块²。
 *
 * - `PropertyParser`：这个类中包含一个内部私有的静态类VariableTokenHandler。VariableTokenHandler实现了TokenHandler接口，包含了一个Properties类型的属性，在初始化这个类时需指定该属性的值。VariableTokenHandler类对handleToken函数的具体实现如下：如果variables不为空且存在key为content的property，就从variables中返回具体的值，否则在content两端添加上$ {和}²。
 *
 * - `XPathParser`：XPathParser是用来解析XML文档，并生成XNode¹。
 *
 * 总体来说，MyBatis的`parsing`包提供了一套完整的工具集，用于处理与资源加载和类加载相关的任务。
 *
 * 源: 与必应的对话， 2023/10/17
 * (1) Mybatis 源码学习(十一) —— parsing 包 - CSDN博客. https://blog.csdn.net/qq_37083863/article/details/117002298.
 * (2) Mybatis源代码分析之parsing包 - 孙振超 - 博客园. https://www.cnblogs.com/sunzhenchao/p/3161093.html.
 * (3) Mybatis源码阅读步骤，也就这几条 - 知乎 - 知乎专栏. https://zhuanlan.zhihu.com/p/336584572.
 * (4) MyBatis-Spring简介与用法_mybaits-spring的包作用-CSDN博客. https://blog.csdn.net/kingmax54212008/article/details/90926347.
 * (5) mybatis之parsing包 - 简书. https://www.jianshu.com/p/9fb00424c1e3.
 * (6) mybatis中parsing包的用法 - 大数据 - 亿速云. https://www.yisu.com/zixun/597905.html.
 */
package org.apache.ibatis.parsing;
