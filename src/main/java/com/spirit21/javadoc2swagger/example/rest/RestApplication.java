package com.spirit21.javadoc2swagger.example.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Sample RestApplication declaration
 *
 * @author dsimon
 * 
 * @apiTitle Example API
 * @apiDescription Not existing API for demonstrating the
 *                 javadoc2swagger-maven-plugin
 * @apiHost localhost:8080
 * @apiBasePath /example/api/v1
 * @fileName swagger-example.json
 */
@ApplicationPath("/api/v1")
public class RestApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<>();
    }
}