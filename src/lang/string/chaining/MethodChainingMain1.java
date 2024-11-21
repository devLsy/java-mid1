package lang.string.chaining;

public class MethodChainingMain1 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);
        //메서드 체이닝 기법
//        adder.add(1).add(2).add(3);

        int result = adder.getValue();
        System.out.println("result = " + result);
    }
}
