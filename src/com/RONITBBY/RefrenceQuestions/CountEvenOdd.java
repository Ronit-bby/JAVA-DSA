package RefrenceQuestions;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[]arr=new int [n];
        int i=0;
        for(int x:arr){
            arr[i++]=sc.nextInt();
        }
        int odd =0;
        int even =0;
        for(int x: arr){
            if(x%2==0){
                even++;
            }
            else if(x%2!=0)
                odd++;

        }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);

        sc.close();

    }
}
