package RefrenceQuestions;

import java.util.Scanner;

public class LinearSearch {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];


        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
            int key=sc.nextInt();
            int index=0; int found= -1;
            for(int x: arr){
                if (x==key){
                    found=index;
                    break;
                }
                index++;
            }
            if(found!=-1){
                System.out.println("Found: "+found);
            }
            else{
                System.out.println("Not Found");
            }
        }
    }
