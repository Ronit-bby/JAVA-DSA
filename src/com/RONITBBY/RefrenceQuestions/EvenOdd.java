package RefrenceQuestions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i =0;
        for(int x:arr){
            arr[i++]=sc.nextInt();
        }
        for(int x: arr){
            if (x%2==0){
                System.out.println(x+" Is Even");
            }
            else{
                System.out.println(x+" Is Odd");
            }
        }
    }
}
