package javaclass15;

public class IndexOf {
    public static void main(String[] args) {
        String name="Mohammad";
        System.out.println(name.indexOf('m')); //4
        System.out.println(name.indexOf('d')); //7
        System.out.println(name.indexOf('M')); //0
        System.out.println(name.indexOf('z')); //-1
    }
}
