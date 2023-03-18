package Arrays;
import java.util.*;
public class scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[20];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        System.out.println("physics marks = "+ marks[0]);
        System.out.println("chemistry marks = "+ marks[1]);
        System.out.println("mathematics marks = "+ marks[2]);
        System.out.println("biology marks = " + marks[3]);
    }
}
