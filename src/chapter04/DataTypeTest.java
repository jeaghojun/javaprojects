package chapter04;

public class DataTypeTest {
    public static void main(String[] args) {
        //숫자가 아닌 자료형: boolean, char
        boolean boo1 = false;
        boolean boo2 = 100 > 200; // false 값이 대입됨.
        boolean boo3 = !boo1; // false의 반대, true 값이 저장된다.

        char ch1 = 'A'; // A = 65
        char ch2 = 97; //유니코드에 따라 대응되는 문자 출력. 97 = a

        System.out.println("ch1: " + ch1);
        System.out.println("ch2: " + ch2);
        System.out.println("ch1+3: " +(char)(ch1 + 3)); //대입은 안되지만 연산은 가능함.

        //숫자 자료형: 정수형과 실수형으로 나뉘어짐
        // 정수형: byte, short, int, long
        // 실수형: flaot, double, long double
       // byte byte1 = 128; //overflow로 인한 에러
         byte byte2 = 127;
       //  byte byte3 = -129; //underflorw로 인한 에러
        byte byte4 = byte2;

        System.out.println("byte2: " + byte2);
        System.out.println("byte4: " + byte4);

        short short1 = 128;
        short short2 = byte2; //{short} )) {byte} 부분집합
      //  byte4 = short-1; // 에러 집합을 벗어남.

        int int1 = byte2;
        int int2 = short1; // {int} )) {short,byte} 부분집합
        int int3 = 1000000000; // 99억까지 가능, 100억부터 오류

        long long1 = byte2;
        long long2 = short1;
        long long3 = int1;
        long long4 = (long)Math.pow(10,18); // 10^18승 까지 가능함 이후 오류 발생.

        System.out.println("long4: " + long4);

        //  실수형 : float, double {실수} )) {정수} 부분집합
        float float1 = 123.456f; //숫자 뒤에 f붙여서 flaot 인식.
        float float2 = (float) 200.123;

        double double1 = 555.456;
        double double2 = float1;
        double double3 = byte2;
        double double4 = long3;
        double double5 = 333;

        //참조형 : 클래스, 인터페이스
        String str1 = new String("hello");
        str1= "hello";
        String str2 = new String("hello");
        str2= "hello";

        boolean bool4 = str1 == str2;
        System.out.println("str1 == str2 :" + bool4);
        System.out.println("str1.eqauls(str2) :" + str1.equals(str2)); //.equals() string 객체 내에 있는 문자열 값을 비교함.

    }
}
