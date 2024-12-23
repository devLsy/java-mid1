package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer1 = new InnerOuter();
//        InnerOuter outer2 = new InnerOuter();
//        InnerOuter outer3 = new InnerOuter();
        // outer의 내부클래스 인스턴스에 접근
        // 내부 클래스는 바깥 클래스의 인스턴스에 소속되기에 바깥 클래스의 인스턴스 정보를 알아야 생성 가능
        InnerOuter.Inner inner = outer1.new Inner();
        inner.print();

        System.out.println("inner = " + inner);
    }
}
