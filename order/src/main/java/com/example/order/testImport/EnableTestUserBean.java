package com.example.order.testImport;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(TestImportSelector.class)
public @interface EnableTestUserBean {
}
