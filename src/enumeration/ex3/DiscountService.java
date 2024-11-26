package enumeration.ex3;
//static import
import static enumeration.ex3.Grade.*;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPrice = 0;

        if (grade == BASIC) {
            discountPrice = 10;
        } else if(grade == GOLD) {
            discountPrice = 20;
        } else if (grade == DIAMOND) {
            discountPrice = 30;
        } else {
            System.out.println("할인X");
        }
        return price * discountPrice / 100;
    }
}
