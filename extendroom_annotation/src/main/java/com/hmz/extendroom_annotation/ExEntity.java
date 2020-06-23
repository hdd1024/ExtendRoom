package com.hmz.extendroom_annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/***********************************************************
 * 创建时间:2020-06-21
 * 作   者: [hanmingze]
 * 功能描述: <用于正在生产Room的<code>@Database</code>标记类的时候
 * 作为<code>entities</code>的值>
 * 备注信息: {该标签必须配合Room的@Entity使用，不然Room在无法生产相关数据库信息}
 * @see
 **********************************************************/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface ExEntity {

    /**
     * 使用该标记可以指定在可以在那个{@link ExDatabase}标记类生成xxx_ExRoom.java
     * 的时候处理该标签
     *
     * @return 默认返回""，代表所有{@link ExDatabase}注解自动生成xxx_ExRoom.java类
     * 的时候都可以处理该标签
     */
    String target() default "";
}