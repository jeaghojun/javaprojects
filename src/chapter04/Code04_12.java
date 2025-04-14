package chapter04;

public class Code04_12 {
    public static void main(String[] args) {
        String str1 = "한국폴리텍대학 AIsoftware Seoul jungsu";

        String s1 = str1.toUpperCase();
        System.out.println(s1);

        String s2 = str1.toLowerCase();
        System.out.println(s2);

        System.out.println(str1);

        String str2 = "     AIsoftware  Seoul   ";
        System.out.println(str2);
        String str3 = str2.trim(); //중간 공백은 제거 안됨
        System.out.println(str3);
    }
}
