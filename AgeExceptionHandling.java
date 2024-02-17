class AgeException extends Exception{
    public String toString(){
        return "Not eligible to vote";
    }
}

public class UserDefinedException {
    public void checkAge(int age) throws AgeException{
        if(age<18){
            throw new AgeException();
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args){
        try{
            int age=17;
            UserDefinedException u=new UserDefinedException();
            u.checkAge(age);
        }
        catch(AgeException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
