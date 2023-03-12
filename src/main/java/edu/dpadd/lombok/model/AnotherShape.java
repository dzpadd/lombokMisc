package edu.dpadd.lombok.model;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Setter;

@Setter
public class AnotherShape {

    @Setter(AccessLevel.PUBLIC)
    private static long count;

    @NotNull
    private String id;

    private String foo;
    private String name;
    private boolean opaque;
    private final int width;

    @Setter(AccessLevel.NONE)
    private String secret;

    public AnotherShape(int width) {
        this.width = width;
    }

    public void setName(String name) {
        // existing setter
        this.name = name;
    }
}
