public class TrappingRainWater {
    public static int trappedRainWater(int heights[]) {
        if (heights.length < 3)
            return 0;

        int trappedWater = 0;
        int n = heights.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        // first find left max boundary of each elements
        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }
        // find the right max boundary of each elements
        rightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
        }
        // find the total trapped rain water
        for (int i = 0; i < n; i++) {
            int water = Math.max(Math.min(leftMax[i], rightMax[i]) - heights[i], 0);
            trappedWater += water;
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainWater(heights));
    }
}
