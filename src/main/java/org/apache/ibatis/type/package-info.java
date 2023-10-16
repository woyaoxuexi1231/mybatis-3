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
 * Type handlers.
 */
/**
 * MyBatis的type包包含一些用于处理数据库字段与Java对象之间转换的类型处理器（TypeHandler）。
 * TypeHandler负责在数据库查询时将结果集中的列值转换为Java对象，并在数据库插入或更新操作时将Java对象转换为对应的数据库字段值。
 *
 *
 * TypeHandler的作用是解决数据库字段与Java对象之间的类型转换问题，因为数据库中的数据类型与Java的数据类型并不完全一致。
 * TypeHandler在处理不同数据类型之间的映射时，可以处理各种转换逻辑，如日期类型、枚举类型、自定义对象等。
 * 通过TypeHandler，MyBatis能够将数据库中的数据正确地映射到Java对象，并在将Java对象保存到数据库时进行相应的转换。
 *
 *
 * MyBatis提供了一些默认的TypeHandler，
 * 如IntegerTypeHandler、StringTypeHandler等，同时也支持自定义TypeHandler以处理特定的类型映射需求。
 * 这些TypeHandler可以在SQL映射文件中配置，以指定相应的类型处理器来处理数据库字段的类型转换。
 */
package org.apache.ibatis.type;
