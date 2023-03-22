package Arrays.TwoDArrays;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//        //adding values in array
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
        //printing values of array
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        int key = 5;
//        arr(arr,key);
        arra(arr);
    }

    public static void arr(int arr[][],int key){
        //finding number in array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key){
                    System.out.println("number found at index ("+i+","+j+")");
                }
            }
        }
    }
    public static void arra(int arr[][]){
        //find smallest in all numbers
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (small > arr[i][j]){
                    small = arr[i][j];
                }
            }
        }
        System.out.println("Smallest value in array is "+ small);
    }
}
