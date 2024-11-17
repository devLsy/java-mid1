package lang.immutable.address;

public class RefMain1_3 {
    //실제 사이드 이펙트 발생 가능한 예시(물론 실제는 더 복잡하지만 코드가 복잡하다고 상상하고 볼 것)
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
