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
 * Base package for caching stuff.
 */
/**
 * MyBatis的`cache`包主要用于处理MyBatis的缓存机制¹。以下是一些主要的类及其作用：
 *
 * - `Cache`：这是一个接口，定义了缓存操作的基本方法，如获取缓存大小、清空缓存、获取缓存项、添加缓存项和删除缓存项¹。
 *
 * - `PerpetualCache`：这是一个实现了`Cache`接口的类，它提供了基本的哈希表缓存实现¹。
 *
 * - `FifoCache`：这是一个继承自`PerpetualCache`的类，它使用先进先出算法进行缓存管理¹。
 *
 * - `LruCache`：这是一个继承自`PerpetualCache`的类，它使用最近最少使用算法进行缓存管理¹。
 *
 * - `SoftCache`：这是一个继承自`PerpetualCache`的类，它使用软引用进行缓存管理，可以有效地处理内存不足的情况¹。
 *
 * - `WeakCache`：这是一个继承自`PerpetualCache`的类，它使用弱引用进行缓存管理，可以在内存不足时立即释放缓存¹。
 *
 * 总体来说，MyBatis的`cache`包提供了一套完整的工具集，用于处理与资源加载和类加载相关的任务。在默认情况下，MyBatis 的一级缓存是默认开启的。所谓一级缓存，也就是基于同一个sqlsession 的查询语句，即 session 级别的缓存，非全局缓存，或者非二级缓存³。而二级缓存则可以实现多个sqlSession间的缓存⁴。
 *
 * 源: 与必应的对话， 2023/10/17
 * (1) 聊聊MyBatis缓存机制 - 美团技术团队 - Meituan. https://tech.meituan.com/2018/01/19/mybatis-cache.html.
 * (2) mybatis 缓存(cache)的使用 - cuiqq - 博客园. https://www.cnblogs.com/cuiqq/p/11038514.html.
 * (3) 一文搞懂MyBatis的一级缓存和二级缓存 - 掘金. https://juejin.cn/post/7206261082453671994.
 * (4) Spring Boot（七）：你不能不知道的Mybatis缓存机制！ - 知乎. https://zhuanlan.zhihu.com/p/142794376.
 */
package org.apache.ibatis.cache;
