import java.util.Scanner;

public class Insertion {
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
        System.out.print("Array : ");
        for(int i = 0;i<arrSize;i++){
            for(int j =0 ;j<arrSize-1;j++){
            int x = arr[j];
            int y = arr[j+1];
            if(y<x){
            arr[j] = y;
            arr[j+1] = x;
            }
           
            }
        }
        System.out.println("Insertion of an array:");
        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i]+" ");
        }
         sc.close();
    }

}
