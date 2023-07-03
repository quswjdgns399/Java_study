package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class baekjoon_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            sb.append(solve(br.readLine())).append("\n");
        }
        System.out.println(sb);

    }

    public static String solve(String str){

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c=='(')
                stack.push(c);

            else if (stack.empty())
                return "NO";

            else
                stack.pop();

        }

        if(stack.empty()){
            return "YES";
        }
        else
            return "NO";

    }
}
