package enumeration.test.ex1;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;
    private final String discription;

    AuthGrade(int level, String discription) {
        this.level = level;
        this.discription = discription;
    }

    public int getLevel() {
        return level;
    }

    public String getDiscription() {
        return discription;
    }
}
