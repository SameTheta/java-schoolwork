import java.util.Scanner;

public class CheckSort {
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i+1]) {
                return false; // if index is greater than next index, list isnt sorted
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many elements will this list have?");
        int itemsInSortList = input.nextInt(); // determines how many items the list has
        int[] userSortList = new int[itemsInSortList];
        
        // puts elements in the list
        System.out.println("Please input your numbers.");
        for (int i = 0; i < userSortList.length; i++) {
            userSortList[i] = input.nextInt();
        }

        input.close();

        // call the sort check
        if (isSorted(userSortList)){
            System.out.println("The given list is sorted.");
        } else {
            System.out.println("The given list is not sorted.");
        }
    }
}