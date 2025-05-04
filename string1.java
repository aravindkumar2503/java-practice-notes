class string1
{
    public static void main(String[] args) {
        String s="OP";
        //isPalindrome(s);
        if(isPalindrome(s))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
    public static boolean isPalindrome(String s) {

        String lo=s.toLowerCase();
        String rev="";
        for(int i=0;i<lo.length();i++)
        {
            char letter=lo.charAt(i);
            if(letter>='a' && letter<='z')
            {
                rev=rev+letter;
            }
        }
        String fin="";
        for(int j=rev.length()-1;j>=0;j--)
        {
            fin=fin+rev.charAt(j);
        }
        System.out.println("fin="+fin);
        return rev.equals(fin);
        //System.out.println("st="+rev);
    }
}