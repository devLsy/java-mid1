package enumeration.ex1;

public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 10000;
        //상수 사용
        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("basic 등급의 할인금액: " + basic);
        System.out.println("gold 등급의 할인금액: " + gold);
        System.out.println("diamond 등급의 할인금액: " + diamond);
    }
}
