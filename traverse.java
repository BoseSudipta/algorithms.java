import java.util.Scanner;

public class traverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrSize = 0;
        System.out.println("Enter the size of the array");

        if (sc.hasNextInt()) {
            arrSize = sc.nextInt();
        }
        int[] arr = new int[arrSize];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arrSize; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();

            }
        }
        System.out.println("Traverse of an array:");
        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}