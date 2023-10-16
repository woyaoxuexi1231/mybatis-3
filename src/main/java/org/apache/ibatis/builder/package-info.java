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
 * Base package for the Configuration building code.
 */
/**
 * MyBatis的`builder`模块位于`org.apache.ibatis.builder`包下，这个模块是负责在MyBatis启动时加载配置文件和映射文件的解析¹。以下是一些主要的类及其作用：
 *
 * 1. `BaseBuilder`：这是一个抽象类，是解析配置文件相关builder的顶层父类¹。
 *
 * 2. `XMLConfigBuilder`：这个类用于解析MyBatis的主配置文件，生成Configuration对象¹。
 *
 * 3. `XMLMapperBuilder`：这个类用于解析映射文件，将映射文件中定义的SQL语句添加到Configuration对象中¹。
 *
 * 4. `XMLStatementBuilder`：这个类用于解析映射文件中定义的SQL语句¹。
 *
 * 5. `MapperBuilderAssistant`：这个类用于辅助构建映射器，它提供了一些方法来添加映射器的各种元素到Configuration对象中¹。
 *
 * 总的来说，MyBatis的`builder`模块提供了一套完整的工具集，用于处理与资源加载和类加载相关的任务。
 *
 * 源: 与必应的对话， 2023/10/17
 * (1) Mybatis(七): builder模块详解 - 知乎 - 知乎专栏. https://zhuanlan.zhihu.com/p/412913678.
 * (2) 一文带你掌握Mybatis设计模式之Builder - 掘金. https://juejin.cn/post/7035435792998596645.
 * (3) Mybatis配置解析 --构建者模式 - 掘金. https://bing.com/search?q=mybatis+builder%e5%8c%85+%e4%bd%9c%e7%94%a8.
 * (4) mybatis之builder包处理mybatis初始化 - CSDN博客. https://blog.csdn.net/u013565163/article/details/119827297.
 */
package org.apache.ibatis.builder;
