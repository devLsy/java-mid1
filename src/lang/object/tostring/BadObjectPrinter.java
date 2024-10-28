package lang.object.tostring;

//Object가 없고 Object가 제공하는 toString()이 없다면/?
//BadObjectPrinter가 구체적인 Car, Dog에 의존한다.
public class BadObjectPrinter {
    public static void print(Car car) {
//        String string = "객체 정보 출력: " + car.carInfo();
//        System.out.println(string);
    }

    public static void print(Dog dog) {
//        String string = "객체 정보 출력: " + dog.dogInfo();
//        System.out.println(string);
    }
}
