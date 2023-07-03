package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baekjoon_2108 {

    public static int num;
    public static int[] array;

    public static int getAverage() {
        // 배열을 다 합해주는 stream
        double sum = Arrays.stream(array).sum();

        double avg = (double) sum / num;
        if (avg < 0) {
            // 반올림하는 Math.round함수
            return (int) Math.round(Math.abs(avg) * -1);
        } else {
            return (int) Math.round(avg);
        }
    }

    public static int countFreq() {
        Map<Integer, Integer> mp = new HashMap<>();

        if (num == 1) {
            return array[0];
        }
        for (int i = 0; i < num; i++) {
            if (mp.containsKey(array[i])) {
                mp.put(array[i], mp.get(array[i]) + 1);
            } else {
                mp.put(array[i], 1);
            }
        }
        int maxValue = Collections.max(mp.values());
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 가장 많이 나온 값
        for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
            if (m.getValue() == maxValue) {
                arrayList.add(m.getKey());
            }
        }
        Collections.sort(arrayList);
        // 가장 많이 나온 값이 여러개일 경우 두번째로 작은 값
        if (arrayList.size() > 1)
            return arrayList.get(1);
        else // 가장 많이 나온 값이 하나면
            return arrayList.get(0);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scan.nextInt();
        }
        // 산술평균
        System.out.println(getAverage());
        Arrays.sort(array);
        // 중앙값
        System.out.println(array[num / 2]);
        // 최빈값
        System.out.println(countFreq());
        // 범위
        System.out.println(array[num - 1] - array[0]);
        scan.close();
    }
}