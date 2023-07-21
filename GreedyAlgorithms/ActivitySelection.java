package GreedyAlgorithms;

import java.util.ArrayList;

public class ActivitySelection {
    public static void activitySelection() {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // sort on end time base
        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(0);
                lastEnd = end[i];

            }
        }

        System.out.println("max activities : " + maxAct);
    }

    public static void main(String[] args) {
        activitySelection();
    }

}
