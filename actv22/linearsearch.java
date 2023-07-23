package actv22;

import java.util.Scanner;

public class linearsearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input array elements ( ex. > 1,5,13,5,2,66,877,85,8 ) : ");
        String[] temp = scan.nextLine().split(",");
        /// putting input into array
        int[] arr = new int[temp.length];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        System.out.print("input x ( element u want to find index )  int         : ");
        int x = scan.nextInt();
        int result = -1;
        for (int i = 0; i<arr.length; i++) {
            if(arr[i] == x){
                result = i;
                break;
            }
        }
        System.out.println("index found = " + result);
    }
}