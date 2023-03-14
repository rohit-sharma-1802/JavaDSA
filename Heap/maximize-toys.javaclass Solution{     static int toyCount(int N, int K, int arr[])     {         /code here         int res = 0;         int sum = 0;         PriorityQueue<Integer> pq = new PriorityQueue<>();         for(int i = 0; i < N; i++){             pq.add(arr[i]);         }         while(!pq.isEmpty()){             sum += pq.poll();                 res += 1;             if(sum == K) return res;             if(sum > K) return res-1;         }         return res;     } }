//Input: 
//N = 7 
//K = 50
//arr[] = {1, 12, 5, 111, 200, 1000, 10}
//Output: 4
//Explaination: The costs of the toys 
// you can buy are 1, 12, 5 and 10.


class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        // code here
        int res = 0;
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < N; i++){
            pq.add(arr[i]);
        }
        while(!pq.isEmpty()){
            sum += pq.poll();
                res += 1;
            if(sum == K) return res;
            if(sum > K) return res-1;
        }
        return res;
    }
}
