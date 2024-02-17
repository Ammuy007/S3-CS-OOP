public class Singletonclass {
    private static Singletonclass instance=null;
    private Singletonclass(){
        System.out.println("Singleton class");
    }
    public static Singletonclass get(){
        if(instance==null){
            instance=new Singletonclass();
        }
        return instance;
    }
    public static void main(String[] args){
        Singletonclass inst1=Singletonclass.get();
        Singletonclass inst2=Singletonclass.get();
        if(inst1==inst2){
            System.out.println("Same");
            System.out.println()
        }
        else{
            System.out.println("Not same");
        }
    }
}
