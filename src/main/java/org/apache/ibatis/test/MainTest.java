package org.apache.ibatis.test;

import org.apache.ibatis.reflection.TypeParameterResolver;

import java.lang.reflect.Type;

/**
 * @projectName: mybatis-3
 * @package: org.apache.ibatis.test
 * @className: MainTest
 * @description:
 * @author: hl
 * @createDate: 2023/6/16 20:38
 */

public class MainTest {

  public static void main(String[] args) throws Exception {
    test1();
  }

  public static void test1() throws NoSuchMethodException {
    Type type = TypeParameterResolver.resolveReturnType(Student.class.getMethod("getInfo"), Student.class);
  }

}
