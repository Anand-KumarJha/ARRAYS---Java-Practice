class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){

            if(digits[i] + carry > 9){
                carry = (digits[i] + carry) / 10;
                digits[i] = (digits[i] + carry) % 10;
            }else{
                digits[i] = digits[i] + 1;
                return digits;
            }

            if(i == 0){
                int[] arr = new int[digits.length+1];
                arr[0] = carry;
                System.arraycopy(digits,0,arr,1,digits.length - 1);
                return arr;
            }
        }return digits;
    }
}