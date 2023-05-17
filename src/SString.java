import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SString{
    public static void main(String args[]) throws IOException {
        String fname,lname;
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter fname\n");
        fname=br.readLine();
        System.out.println("Enter lname\n");
        lname=br.readLine();
        for(int i=1;i<=5;i++)
        {
            System.out.println("My first name is " + fname + " and last name is "+ lname );
        }
    }
}