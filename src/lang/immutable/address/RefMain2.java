package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;             //참조값 대입을 막는 방법은 없음(문법 상 문제 안됨)
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //b.setValue("부산");     //컴파일 오류 발생(final 붙였으니 setter를 못만드니까 없는 메서드를 호출하는 셈
        //새로운 인스턴스를 만들어서 다른 참조값을 대입
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
