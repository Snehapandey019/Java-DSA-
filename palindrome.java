//Check for palindrome
class palindrome{
    public static void main(String args[]){
        String str1 = "madam";
        String str2 = "byee";

        checkPalindrome(str1);
        checkPalindrome(str2);  }
    public static void checkPalindrome(String str)
    {
        int length = str.length();
        boolean isPalindrome = true;
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1))
            {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println("Palindrome" + " " + str);

        else
            System.out.println("Not Palindrome" + " " + str);
    }
}