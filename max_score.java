
import java.util.Arrays;

public class max_score {

    public static void main(String[] args) {
        int []a={2,10,3,40,25};
        int k=3;
        int sum=0;
        Arrays.sort(a);
        for(int i=a.length-k;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum="+sum);
    }
    
}
