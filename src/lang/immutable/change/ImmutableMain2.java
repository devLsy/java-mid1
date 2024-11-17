package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        //add만 호출하고 반환값을 사용하지 않으면 기존에 가지고 있는 value의 값만 출력됨
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        System.out.println("obj1 = " + obj1.getValue());
    }
}
