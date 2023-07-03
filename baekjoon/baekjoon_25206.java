package baekjoon;

import javax.lang.model.type.NullType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String arr[] = new String[20];
        double score_sum = 0;
        double total_sum = 0;

        String grade_list[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double grade_score[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};


        for (int i = 0; i < 20; i++) {
            arr[i] = br.readLine();
            st = new StringTokenizer(arr[i], " ");
            String sbj = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for (int j=0; j<10; j++){
                if(grade.equals(grade_list[j])){
                    total_sum += (score * grade_score[j]);
                    if(j!=9)
                        score_sum = score_sum + score;
                }

            }

        }
        double avg = total_sum / score_sum;
        System.out.printf("%.6f\n", avg);

        br.close();
    }
}

