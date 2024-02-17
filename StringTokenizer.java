import java.io.*;
import java.util.*;
public class StrTokenizer{
    public static void main(String[] args){
        int sum=0;
        try{
            System.out.println("Enter numbers");
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            StringTokenizer st=new StringTokenizer(str);
            while(st.hasMoreTokens()){
                sum=sum+Integer.parseInt(st.nextToken());
            }
            System.out.println("Sum is "+ sum);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
