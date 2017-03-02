package com.spirit21.javadoc2swagger.example.entity;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import lombok.Data;

/**
 * Type entity for database
 *
 * @author dsimon
 */
@Data
public class Type {
    private Long id;
    private String name;
    private LocalDateTime createdAt;
    private List<String> something;
    private byte[] byteString;
    private Boolean bool;
    private Collection<Long> codes;
}