package edu.dpadd.lombok.model;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;

@Getter
public class Shape {

    @Getter(AccessLevel.PUBLIC)
    private static long count;

    @NotNull
    private String id;

    private String foo;
    private String name;
    private boolean opaque;
//    private boolean isOpaque;
    private final int width;

    @Getter(AccessLevel.NONE)
    private String secret;

    public Shape(int width) {
        this.width = width;
    }

    public String getName() {
        // existing getter
        return this.name;
    }
}
