package nested.test.ex1;

public class AvengersMaiin {

    public static void main(String[] args) {
        Avengers avengers = new Avengers(2);
        avengers.addMember("스칼렛 위치", "마법사");
        avengers.addMember("닥터 스트레인지", "마법사");
        avengers.addMember("블랙 팬서", "휴먼");
        avengers.showMembers();     //모든 멤버 출력
    }
}
