package Arrays;

import java.util.Scanner;

public class percentagecalc {
    public static void main(String[] args) {
        float marks[] = new float[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("physics marks = ");
        marks[0]= sc.nextInt();
        System.out.print("chemistry marks = ");
        marks[1]= sc.nextInt();
        System.out.print("mathematics marks = ");
        marks[2]= sc.nextInt();
        System.out.print("biology marks = ");
        marks[3]= sc.nextInt();
        System.out.print("english marks = ");
        marks[4]= sc.nextInt();
        System.out.print("hindi marks = ");
        marks[5]= sc.nextInt();

        float total = marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5];
        float percent = (total/600)*100;
        if (percent<35){
            System.out.println("sorry you got failed");
        }else System.out.println("congrats you got "+percent+"%");
    }
}
