
class Solution {
    public int myAtoi(String s) {
        String digits = "0123456789";  
        boolean isNeg = false;
        int result = 0;
        int index = 0;
        int length = s.length();

       
        while (index < length && Character.isWhitespace(s.charAt(index))) {
            index++;
        }

        
        if (index < length && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            isNeg = s.charAt(index) == '-';
            index++;
        }

        
        while (index < length && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            
            
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            result = result * 10 + digit;
            index++;
        }

        return isNeg ? -result : result;
    }
}

