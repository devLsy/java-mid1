package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }
    //새로운 인스턴스를 생성 후 반환
    public ImmutableObj add(int addValue) {
        return new ImmutableObj(value + addValue);
    }

    public int getValue() {
        return value;
    }
}
