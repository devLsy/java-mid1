package nested.local;

public class LocalOuterV2 {

    private int outInstanceVal = 3;

    public void process(int paramVar) {
        int localVar = 1;
        // 인터페이스 구현 가능
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("localVal= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVal= " + outInstanceVal);
            }
        }
        // 지역 클래스 인스턴스 생성 후 메서드 호출
        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
