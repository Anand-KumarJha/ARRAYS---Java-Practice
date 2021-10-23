import java.util.ArrayDeque;
import java.util.Deque;

class FastSolution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxArr = new int[nums.length-(k-1)];
        Deque<Integer> deque = new ArrayDeque<>();


        for(int i = 0; i < nums.length; i++){
            while(!deque.isEmpty() && deque.peekFirst() < i - k + 1){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }deque.offerLast(i);

            if(i - k + 1 >= 0){
                maxArr[i-k+1] = nums[deque.peekFirst()];
            }

        }return maxArr;
    }
}