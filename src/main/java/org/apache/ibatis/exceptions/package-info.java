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
 * Base package for exceptions.
 */
/**
 * MyBatis的exception包包含了一些异常类，用于处理在MyBatis执行过程中可能发生的异常情况。这些异常类可以提供更具体的异常信息，帮助开发人员定位并解决可能的问题。
 *
 *
 * 以下是一些MyBatis异常类的作用：
 *
 *
 * PersistenceException：是MyBatis中的顶级异常类，表示在持久化过程中可能发生的异常情况。其他具体的异常类通常是该异常类的子类。
 *
 * TooManyResultsException：表示在查询过程中返回了多条记录，但期望只返回一条记录的异常。例如，当使用selectOne方法执行查询时，如果查询结果返回了多条记录，则会抛出该异常。
 *
 * BindingException：表示在映射过程中可能发生的异常情况。例如，当映射配置文件中的某个属性名与Java对象的属性名不匹配时，会抛出该异常。
 *
 * TypeException：表示在类型转换过程中可能发生的异常情况。例如，当MyBatis无法找到合适的TypeHandler来处理数据库字段类型与Java对象类型之间的转换时，会抛出该异常。
 *
 * NestedSQLException：表示在处理底层SQL语句时发生的异常情况。该异常是由MyBatis封装的，可以包含底层数据库操作引发的具体数据库异常信息。
 *
 *
 * 这些异常类的存在可以帮助开发人员捕获并处理在MyBatis执行过程中可能出现的异常情况，提供了更好的错误信息和异常处理能力。
 */
package org.apache.ibatis.exceptions;
