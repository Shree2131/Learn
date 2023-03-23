package Strings;

public class pallindrome {
    public static void main(String[] args) {
        String str= "moon";
        System.out.println(pallin(str));
    }
    public static boolean pallin(String str){
        for (int i = 0; i < str.length()/2; i++) {
           if (str.charAt(i) == str.charAt(str.length()-1-i)){
               return true;
           }
        }return false;
    }
}
