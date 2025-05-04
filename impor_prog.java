import java.util.Arrays;

public class impor_prog {

    public static void main(String[] args) {
        String s="chennai is __unesco @ recognized site";
        String dem="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isAlphabetic(c))
            {
                dem=dem+c;
            }
            else if(c==' ')
            {
                dem=dem+" ";
            }

        }
        String []s1=dem.split("\\s+");
        System.out.println("Array="+Arrays.toString(s1));
        String res="";
        for(int i=0;i<s1.length;i++)
        {
            res=res+upper(s1[i]+" ");
        }
        System.out.println("result="+res);
        //System.out.println(dem);

    }
    public static String upper(String str)
    {
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
    
}
