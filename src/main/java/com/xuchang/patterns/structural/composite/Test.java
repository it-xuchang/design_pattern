package com.xuchang.patterns.structural.composite;

/**
 * 组合模式
 * 类型：结构型
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent catalogComponent = new CatalogComponent();
        CatalogComponent pythonCourse = new Course("Python课程",1);
        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);
        pythonCourse.print();

    }


}
