class Solution {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            // Skip special characters from left
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            // Skip special characters from right
            else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            // Compare characters
            else if (Character.toLowerCase(s.charAt(i)) !=
                     Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            else {
                i++;
                j--;
            }
        }

        return true;
    }
}