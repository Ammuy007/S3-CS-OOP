class Shared{
    public static Shared obj=new Shared();
}
class One extends Thread{
    public void run(){
        synchronized(Shared.obj){
            for(int i=50;i<=74;i++){
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
    public void run(){
        synchronized(Shared.obj){
            for(int i=75;i<101;i++){
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
        One o=new One();
        Two t=new Two();
        o.start();
        t.start();
    }
}
