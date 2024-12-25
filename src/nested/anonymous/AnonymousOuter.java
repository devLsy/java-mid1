package nested.anonymous;


import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVal = 3;

    public void process(int paramVar) {
        int localVar = 1;
        /*익명 클래스(선언과 동시에 생성)
        Printer 인터페이스를 구현한 익명 클래스를 생성*/
        Printer printer = new Printer()
        //이 부분이 익명 클래스의 본문
        {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("localVal= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVal= " + outInstanceVal);
            }
        };

        printer.print();
        System.out.println("printer.class= " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
