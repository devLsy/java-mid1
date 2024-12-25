package nested.local;

public class LocalOuterV1 {

    private int outInstanceVal = 3;

    public void process(int paramVar) {
        int localVar = 1;
        // 메서드 안에 클래스를 만듬
        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value=" + value);
                System.out.println("localVal= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVal= " + outInstanceVal);
            }
        }
        // 지역 클래스 인스턴스 생성 후 메서드 호출
        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
