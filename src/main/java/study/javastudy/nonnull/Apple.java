package study.javastudy.nonnull;

import lombok.NonNull;

public class Apple {

    private String name;

    public Apple(String name) {
        this.name = name;
    }

    public void update(@NonNull String name) {
        this.name = name;
    }
}
