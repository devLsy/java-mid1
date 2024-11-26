package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //타입 안정성이 보장되지 않고 데이터 일관성이 떨어진다.

        // 존재하지 않는 등급을 입력한 경우
        int vip = discountService.discount("VIP", price);
        System.out.println("vip 등급의 할인금액: " + vip);

        // 오타를 입력한 경우
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인금액: " + diamondd);

        // 소문자를 입력한 경우
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인금액: " + diamondd);
    }
}
