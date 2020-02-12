package enums.jdk8;

import java.util.Arrays;

public enum StringEnum {

    ONE("1"),
    TWO("2"),
    THREE("3");

    private String string;

    StringEnum(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }

    public static StringEnum getString(String name) {
        return Arrays.stream(values())
                .filter(value -> value.equals(name))
                .findAny().orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(values()[0]);
    }
}
