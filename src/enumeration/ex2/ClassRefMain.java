package enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + Grade.BASIC);
        System.out.println("ref GOLD = " + Grade.GOLD);
        System.out.println("ref DIAMOND = " + Grade.DIAMOND);
    }
}
