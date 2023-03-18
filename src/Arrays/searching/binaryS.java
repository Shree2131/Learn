package Arrays.searching;

public class binaryS {
    public static void main(String[] args) {
        int numbers[] = {0,1,2,3,4,5,6,7,8,9};
        int key = 8;
         int index = BS(numbers,key);
          if (index==-1){
              System.out.println("number not found");
          }
        System.out.println("number found at index "+index);

    }
    public static int BS(int numbers[], int key){
    int start = 0;
    int end = numbers.length-1;

     while (start<= end){
         int mid = (start+end)/2;
        if (key == numbers[mid]){
            return mid;
        }if (key > numbers[mid]){
            start = mid+1;
         }else end = mid-1;
     }
     return -1;
    }
}
