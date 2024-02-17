import java.util.*;
class Shared{
    public static Shared obj=new Shared();
}
class One extends Thread{
    int num;
     One(int n){
     num=n;   
    }
    public void run(){
        synchronized(Shared.obj){
            for(int i=0;i<num+1;i=i+2){
                System.out.println(i);
                Shared.obj.notify();
                try{
                    Shared.obj.wait();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
class Two extends Thread{
    int num;
    public Two(int n){
     num=n;   
    }
    public void run(){
        synchronized(Shared.obj){
            for(int i=1;i<num+1;i+=2){
                System.out.println(i);
                Shared.obj.notify();
                try{
                    Shared.obj.wait();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        One o=new One(num);
        Two t=new Two(num);
        o.start();
        t.start();
    }
}
