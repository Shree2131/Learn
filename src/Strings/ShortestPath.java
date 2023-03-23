package Strings;

public class ShortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        path(str);
    }
    public static void path(String str){
        int X = 0 , Y = 0 ;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'E'){
               X++;
            } else if (dir == 'W') {
                X--;
            } else if (dir == 'N') {
                Y++;
            }else if (dir == 'S'){
                Y--;
            }
        }int x = X*X , y = Y*Y;
        float ans = (float) Math.sqrt(x + y);
        System.out.println(ans);
    }
}
