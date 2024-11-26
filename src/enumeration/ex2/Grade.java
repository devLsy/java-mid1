package enumeration.ex2;

public class Grade {

    public static final Grade BASIC = new Grade();
    public static final Grade GOLD = new Grade();
    public static final Grade DIAMOND = new Grade();

    //외부에서 생성 못하도록 private으로 막음

    private Grade() {}
}
