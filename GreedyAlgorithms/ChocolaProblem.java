package GreedyAlgorithms;

import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while (h < costHor.length && v < costVer.length) {
            if (costHor[h] >= costVer[v]) {
                cost += (costHor[h] * vp);
                h++;
                hp++;
            } else {
                cost += (costVer[v] * hp);
                v++;
                vp++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            h++;
            hp++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            v++;
            vp++;
        }
        System.out.println(cost);

    }
}
