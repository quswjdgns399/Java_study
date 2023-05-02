package beakjun;

import java.util.Scanner;

public class beakjun_2750_insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<num; i++){
            int target = arr[i];
            int j = i-1;
            while(j>=0 && target < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }


        for(int i=0; i<num; i++){
            System.out.println(arr[i]);
        }
    }
}
