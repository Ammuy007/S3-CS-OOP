class Even_Exception extends Exception{
    public String toString(){
        return "Even number";
    }
}
class Odd_Exception extends Exception{
    public String toString(){
        return "Odd number";
    }
}
class Ex{
public void check_num(int n) throws Even_Exception,Odd_Exception{
        if(n%2==0){
            throw new Even_Exception();
        }
        else{
            throw new Odd_Exception();
        }
    }
}
public class Main{
    
    public static void main(String[] args){
        int num=5;
        Ex ex=new Ex();
        try{
        ex.check_num(num);
        }
        catch(Even_Exception e){
            System.out.println(" "+e);
        }
        catch(Odd_Exception e){
            System.out.println(" "+e);
        }
    }
}
