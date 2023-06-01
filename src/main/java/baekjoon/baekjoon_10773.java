package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_10773 {
    public static int[] stack;
    public static int size = 0;

    public static void push(int num){
        stack[size] = num;
        size++;
    }

    public static int pop(){
        if(size==0)
            return -1;
        else
        {
            int res = stack[size-1];
            stack[size-1] = 0;
            size--;
            return res;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());

        stack = new int[num];

        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            if(Integer.parseInt(st.nextToken())==0){

            }
        }




    }


}
