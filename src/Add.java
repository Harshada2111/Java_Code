import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Add {
     public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num1,num2,sum;
        System.out.println("Enter num1\n");
        num1=Integer.parseInt(br.readLine());
        System.out.println("Enter num2\n");
        num2=Integer.parseInt(br.readLine());
        sum=num1+num2;
        System.out.println("Addition of "+num1+ " + "+num2+ " is :"+sum);



    }
}
