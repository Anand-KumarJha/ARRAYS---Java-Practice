import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack <>();
        int[] arr;

        if(asteroids.length < 2){
            return asteroids;
        }

        for(int i = 0; i < asteroids.length; i++){
            if(asteroids[i] > 0){
                stack.push(asteroids[i]);
            }else{
                  while (!stack.isEmpty() && stack.peek() > 0 && Math.abs(stack.peek()) < Math.abs(asteroids[i])){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0){

                    stack.push(asteroids[i]);
                }
                if(stack.peek() == Math.abs(asteroids[i])){
                    stack.pop();
                }
            }
        }


        arr = new int[stack.size()];

        for(int i = stack.size() - 1; i >= 0; i--){
            arr[i] = stack.pop();
        }
        return arr;
    }
}