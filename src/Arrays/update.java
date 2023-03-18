package Arrays;

public class update {
    public static void main(String[] args) {
    int marks[] = {97,98,99};
    up(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
    public static void up(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i]=marks[i]+1;
        }
    }
}
