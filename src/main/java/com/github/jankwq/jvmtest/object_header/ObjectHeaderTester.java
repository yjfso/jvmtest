package com.github.jankwq.jvmtest.object_header;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author yinjianfeng
 * @date 2019/9/12
 */
public class ObjectHeaderTester {

    private static Object object = new Object();

    private static Object object1 = new Object();

    private static OutOfMemoryError outOfMemoryError = new OutOfMemoryError();

    private static Object[] objects = new Object[10];

    public static void main(String[] args) {
        System.out.println(ClassLayout.parseInstance(object).toPrintable());
        System.out.println(ClassLayout.parseInstance(object1).toPrintable());
        System.out.println(ClassLayout.parseInstance(outOfMemoryError).toPrintable());
        System.out.println(ClassLayout.parseInstance(objects).toPrintable());
    }
}
