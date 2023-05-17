import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {
    public static void main(String args[]) throws IOException {
        /* System.out.println("Enter Num\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int num=Integer.parseInt(br.readLine());
        System.out.println("Even Num are :-");
        for(int i=1;i<=num;i++)
        {
            if(i%2 ==0)
            {
                System.out.println("  \n"+i);
            }

        } */
        System.out.println("Enter Num\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int num=Integer.parseInt(br.readLine());
        System.out.println("Odd Num are :-");
        for(int i=1;i<=num;i++)
        {
            if(i%2 !=0)
            {
                System.out.println("  "+i);
            }

        }



    }
}
