package study.javastudy.thread;

/**
 * 불변 객체
 * 불변객체는 수정이 발생하지 않는다
 * 멀티스레드 환경에서 문제가 되는 상황은 변경이다.
 * 객체를 불변으로 만들면 멀티스레드 환경에서 생길 수 있는 에러를 방지할 수 있다.
 */
class Immutable {

    private final int value;

    public Immutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
