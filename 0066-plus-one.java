class Solution {
    public int[] plusOne(int[] digits) {
        
        int size = digits.length;
        int[] xresult = new int[size+1];
        //initial number to add
        int carry = 1;
        
        //for normal cases handled in same digits:
        // start adding from last element
        for(int i = size-1; i > 0; i--) {
            // when not carried
            if(digits[i] + carry < 10) {
                digits[i] += carry;
                carry = 0;
            }
            //when carried
            if(digits[i] + carry >= 10) {
                digits[i] = (digits[i]+carry)%10;
                carry = 1;
            }
                        
        }
        
        //dealing with first element
        
        //with carry
        if(digits[0] + carry >= 10) {
            digits[0] = (digits[0]+carry)%10;
            // need longer array
            xresult[0] = 1;
            System.arraycopy(digits, 0, xresult, 1, size);
            
            return xresult;
            
        }
        //without carry
        else {
            digits[0] += carry;
            
            return digits;
        }
        
    }
}