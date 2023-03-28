package Strings;

public class anagrams {
    public static void main(String[] args) {
        String str = "care", str2 = "race";
        ana(str,str2);

    }
    public static void ana(String str,String str2){
        String newstr2 = "" , newstr1 = "";
        Integer count2 = 0 ,count1 = 0 ;
        for (int i = 0; i < str.length(); i++) {
            count1 = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt((i+1))){
                count1++;
                i++;
            }newstr1+=str.charAt(i);
            if (count1>1){
                newstr1+=count1.toString();
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            count2 = 1;
            while(i<str2.length()-1 && str2.charAt(i) == str2.charAt((i+1))){
                count2++;
                i++;
            }newstr2+=str2.charAt(i);
            if (count2>1){
                newstr2+=count2.toString();
            }
        }if (newstr1.equals(newstr2)){
            System.out.println("two strings are anagrams of each other.");
        }
    }
}
