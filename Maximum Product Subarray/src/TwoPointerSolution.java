class TwoPointerSolution {
    public int maxProduct(int[] nums) {
        int product = 1, maxProduct = Integer.MIN_VALUE;
        for(int i = 0,j = 0; i < nums.length ; j++){
            if(j > nums.length-1){
                i++;
                j = i;
                product = 1;
            }
            if(j > nums.length-1){
                break;
            }
            product = product * nums[j];
            if(maxProduct < product){
                maxProduct = product;
            }

        }return maxProduct;
    }
}