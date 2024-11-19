package study.javastudy.nonnull;

public class Main {

    public static void updateApple() {
        Apple apple = new Apple("apple");
        apple.update(null);
    }

    public static void main(String[] args) {
        try {
            updateApple();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

}
