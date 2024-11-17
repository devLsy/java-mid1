package lang.immutable.change;

public class ImmutableMain {
    //불변객체에서 기존값을 변경해야 하는 예시
    //기존값은 유지하고 변경된 결과를 새로운 객체에 담아서 반환
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        //계산 이후에도 기존값과 신규값 모두 확인 가능(기존값은 변경되지 않음)
        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj2 = " + obj2.getValue());
    }
}
