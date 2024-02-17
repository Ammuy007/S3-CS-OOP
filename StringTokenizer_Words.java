//Reads sentences in a line by line manner,extracts each word from each line and stores it in a String array
import java.io.*;;
import java.util.*;
public class StrTokenizerWords {
    public static void main(String[] args){
        String[] words=new String[100];
        int index=0;
        try{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter sentences");
        String str;
        while(!((str=bf.readLine()).equals("-1"))){
            StringTokenizer st=new StringTokenizer(str);
            while(st.hasMoreTokens()){
                words[index++]=st.nextToken();
            }
        }
        for(int i=0;i<index;i++){
            System.out.println(words[i]+" ");
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
}
