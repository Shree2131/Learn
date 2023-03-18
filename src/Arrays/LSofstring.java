package Arrays;

public class LSofstring {
    public static void main(String[] args) {
        String menu[] = {"idli","dosa","voda pav","samosa","noodles","chicken manchurian","veg manchurian"};
        String key = "noodles";
        int index = LinearSearch(menu,key);
        if (index == -1){
            System.out.println("item not found");
        }else  System.out.println("item fount at index "+ index);
    }

    private static int LinearSearch(String[] menu, String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i]== key){
                return i;
            }
        }

        return -1;
    }
}
