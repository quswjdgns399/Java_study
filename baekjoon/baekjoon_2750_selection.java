package baekjoon;

import java.util.Scanner;

public class baekjoon_2750_selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<num-1;i++){
            int min = i;
            for(int j=i+1; j<num; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<num; i++){
            System.out.println(arr[i]);
        }
    }
}
