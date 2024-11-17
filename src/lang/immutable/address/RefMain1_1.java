package lang.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있음
        Address a = new Address("서울");
        Address b = a;  //b도 a의 참조값을 가리킴
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //여기까지 출력하면 a와 b 같은 값이 출력된다.
        //이 때 b의 값을 부산으로 변경하면?
        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //a와 b 둘 다 같은 인스턴스 주소값을 참조하기 때문에 둘 다 부산으로 출력이 된다.
        //개발자가 의도한 바는 b 인스턴스의 주소만 부산으로 변경하는건데 a까지 변경되는 사이드 이펙트가 발생했다.
        //해결방법은 간단하다. A와 B 변수를 따로 만들어서 각각 다른 참조값을 바라보게 하면 된다.
    }
}
