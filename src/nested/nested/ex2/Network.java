package nested.nested.ex2;

public class Network {
    public void sendMessage(String text) {
        // 이 클래스 안의 중첩 클래스에 접근할 때는 아래처럼 .내부클래스를 안해도 됨
        // Network.NetworkMessage networkMessage = new Network.NetworkMessage(text);
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();

        // 중첩 클래스의 접근
        // 하지만 내 클래스에 포함된 중첩 클래스가 아니라 다른 곳에 있는 중첩 클래스에 접근할 때는
        // 바깥클래스.중첩클래스로 접근해야 한다.(하지만 권장하지 않음)
        // NestedOuter.Nested nested = new NestedOuter.Nested()
        // 중첩 클래스는 그 용도가 자신이 소속된 바깥 클래스안에서 사용되는 것인데
        // 만일 자신이 소속된 바깥 클래스가 아닌 외부에서 생성하고 사용한다면 이는 이미 용도에 맞지 않을 수 있다.
    }
    // 밭에 있던 클래스를 안으로 넣고 외부 접근 불가하도록 변경(여기안에서만 쓸거라는 의도)
    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }

}
