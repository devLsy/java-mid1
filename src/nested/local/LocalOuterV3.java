package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVal = 3;
    
    public Printer process(int paramVar) {
        int localVar = 1;   // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거됨
        // 인터페이스 구현 가능
        class LocalPrinter implements Printer {
            int value = 0;
            /*인스턴스 생성 시점에
            지역변수에서 사용되는 변수를 캡처해서
            아래처럼 인스턴스 멤버로 가지고 있고 이를 통해 접근한다.*/
            //int localValr = 1;
            //int paramVar = 2;

            @Override
            public void print() {
                System.out.println("value=" + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVal= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVal= " + outInstanceVal);
            }
        }
        // 지역 클래스 인스턴스 생성 후 메서드 호출
        LocalPrinter printer = new LocalPrinter();
//        printer.print();  //메서드 실행하지 않고 인스턴스만 반환
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        // 캡처된 것을 확인
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
