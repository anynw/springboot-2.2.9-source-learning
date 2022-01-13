package com.wuhp.annotation;

import com.wuhp.config.ConfigMarker;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(ConfigMarker.class)
public @interface EnableRegisterServer {

}
