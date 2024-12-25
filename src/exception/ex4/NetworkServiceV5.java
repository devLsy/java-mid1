package exception.ex4;


public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        /*
        try with resources 사용해서 try문안에 사용할 자원을 정의하고 try 종료 시 자동으로 AutoCloseable.close() 호출 후 자원 해제
        try 끝나면 catch구문보다 자원 해제 먼저 함
        finnaly 구문 없이도 자원 해제 가능*/
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch(Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
