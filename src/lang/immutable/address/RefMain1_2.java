package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        //a와 b 각각 다른 주소값을 참조하도록 변경
        Address a = new Address("서울");
        Address b = new Address("서울");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //여기까지는 a,b 둘 다 서로 서울이지만
        b.setValue("부산");
        //b인스턴스의 값만 부산으로 변경했다.
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //출력하면 b인스턴스의 값만 부산으로 변경되었다.
    }
}
