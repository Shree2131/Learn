package Strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        for (char ch = 'a'; ch <='z' ; ch++) {
            str.append(ch);
        }
        for (int ch = 0; ch <str.length(); ch++) {
           str.append(Character.toUpperCase(str.charAt(ch))) ;
        }
        System.out.println(str);
    }
}
