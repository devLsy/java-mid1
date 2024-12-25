package nested.test.ex1;

public class Avengers {

    private Member[] members;
    private int memberCount;

    public Avengers(int memberCount) {
        members = new Member[memberCount];
        System.out.println("members.size= " + members.length);
        memberCount = 0;
    }

    public void addMember(String name, String position) {
        if(memberCount >= members.length) {
            System.out.println("더 이상 들어갈 자리가 없습니다.");
            return;
        }
        members[memberCount++] = new Member(name, position);
    }

    public void showMembers() {
        for (int i = 0; i < memberCount; i++) {
            System.out.println("멤버명: " + members[i].name + ", 포지션: " + members[i].position);
        }
    }
    // Avenger안에서만 사용
    private static class Member {
        private String name;
        private String position;

        public Member(String name, String position) {
            this.name = name;
            this.position = position;
        }
    }
}
