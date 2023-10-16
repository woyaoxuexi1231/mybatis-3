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
 * Base package for languages.
 */
/**
 * MyBatis的`scripting`包主要用于处理SQL脚本¹。以下是一些主要的类及其作用：
 *
 * - `LanguageDriver`：这是一个接口，通过接口的实现类，就可以生成执行SQL所需要的`SqlSource`和`ParameterHandler`¹。
 *
 * - `LanguageDriverRegistry`：这是用来存储所有语言驱动的注册表¹。
 *
 * - `XMLLanguageDriver`：这是MyBatis语言驱动的默认实现类，可以将动态节点解析为可以直接交给数据库执行的SQL语句¹。
 *
 * - `RawLanguageDriver`：这是另一个语言驱动的实现类¹。
 *
 * 此外，`scripting`包还包含了一些辅助类，如`XMLScriptBuilder`，用于解析脚本节点生成`SqlSource`¹。总的来说，MyBatis的`scripting`包提供了一套完整的工具集，用于处理与资源加载和类加载相关的任务。
 *
 * 源: 与必应的对话， 2023/10/17
 * (1) Mybatis 源码学习(十五) —— scripting 包_三岁丫的博客-CSDN博客. https://blog.csdn.net/qq_37083863/article/details/117927823.
 * (2) 【mybatis】——script标签作用_mybatis script标签-CSDN博客. https://blog.csdn.net/hy_coming/article/details/96487574.
 * (3) MyBatis源码解读：概要_mybatis各个包的意思_爱写书的程序员的博客-CSDN博客. https://blog.csdn.net/qq_41063182/article/details/104079576.
 * (4) Mybatis源码阅读步骤，也就这几条 - 知乎 - 知乎专栏. https://zhuanlan.zhihu.com/p/336584572.
 * (5) undefined. https://segmentfault.com/q/1010000006875476.
 * (6) undefined. https://stackoverflow.com/questions/6685655/how-to-use-dynamic-sql-query-in-mybatis-with-annotationhow-to-use-selectprovide.
 * (7) undefined. http://www.blogjava.net/dbstar/archive/2011/08/08/355825.html.
 * (8) undefined. http://www.jianshu.com/p/03642b807688.
 * (9) undefined. https://stackoverflow.com/questions/33129344/is-there-a-way-to-reuse-sql-fragments-in-annotation-based-mybatis-ibatis.
 */
package org.apache.ibatis.scripting;
