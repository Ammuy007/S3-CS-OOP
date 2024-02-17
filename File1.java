//Reads a file and displays the file on screen with a line number before each line
import java.io.*;
public class ReadFile{
    public static void main(String[] args){
        int count=0;
        try{
            BufferedReader bf=new BufferedReader(new FileReader("hi.txt"));
            String str;
            while((str=bf.readLine())!=null){
                    count++;
                    System.out.println(count+"."+str);
            }
            fw.close();
            bf.close();
        }
        catch(Exception e){
          System.out.println(e);
        }
    }
}
