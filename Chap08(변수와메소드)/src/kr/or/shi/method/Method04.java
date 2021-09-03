package kr.or.shi.method;
public class Method04 {

    public static String CapitalMethod(String str)
    {
        String result = str.toUpperCase();
        return result;
    }
    public static void main(String[] args) {
        String result = CapitalMethod("korea");
        System.out.println(result);
    }
}
