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
 * Utilities to read resources.
 */
/**
 * MyBatis的`io`包主要包含了一些用于处理类加载和资源访问的工具类¹。以下是一些主要的类及其作用：
 *
 * - `ClassLoaderWrapper`：这是一个类加载器的包装类，它使用5种不同的类加载器来查找资源。只要其中一个命中，就可以找到资源¹。
 *
 * - `DefaultVFS`：这是VFS（Virtual File System，虚拟文件系统）的默认实现类¹。
 *
 * - `ResolverUtil`：这个类用于查找在类路径可用并满足任意条件的类。最常见的两种情况是一个类继承或实现了另一个类，或者此类被指定的注解标记了¹。
 *
 * - `Resources`：这个类通过封装ClassLoader读取文件，简化了资源文件的获取。对于简单的只读文本数据，加载为Reader；对于简单的只读二进制或文本数据，加载为InputStream；对于可读写的二进制或文本文件，加载为File；对于只读的配置属性文件，加载为Properties；对于只读的通用资源，加载为URL¹。
 *
 * 总体来说，MyBatis的`io`包提供了一套完整的工具集，用于处理与资源加载和类加载相关的任务。
 *
 * 源: 与必应的对话， 2023/10/17
 * (1) Mybatis IO模块分析 - 掘金. https://juejin.cn/post/6847902216536358925.
 * (2) mybatis – MyBatis 3 | 入门. https://mybatis.org/mybatis-3/zh/getting-started.html.
 * (3) id 和 result 标签 - MyBatis 教程 - hxstrive. https://www.hxstrive.com/subject/mybatis.htm?id=207.
 * (4) MyBatis(优点&缺点)&MyBatis使用详解！ - 知乎 - 知乎专栏. https://zhuanlan.zhihu.com/p/338487669.
 * (5) undefined. https://mybatis.org/dtd/mybatis-3-config.dtd.
 */
package org.apache.ibatis.io;
