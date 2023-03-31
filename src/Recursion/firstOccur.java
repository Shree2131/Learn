package Recursion;

public class firstOccur {
    public static void main(String[] args) {
        int arr[] = {5,5,5,5,5};
        System.out.println(lastOccur(arr, 5, arr.length-1));
    }
    public static int occur(int[] arr,int number, int index){
        if (arr[index] == number){
            return index;
        }
        if (index == arr.length){
            return -1;
        }
        return occur(arr, number, index+1);
    }
    public static int lastOccur(int[] arr, int num , int index){
        if (arr[index] == num){
            return index;
        }
        if (index == 0 && arr[index] != num){
            return -1;
        }
        return lastOccur(arr,num,index-1);
    }
}
