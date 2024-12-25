package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVal = 3;
    
    public Printer process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {

            int value = 0;

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
        // 만약 localVar의 값을 변경한다면?
        // localVar = 10; 컴파일 오류 발생
        // paramVar = 20; 컴파일 오류 발생
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
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
