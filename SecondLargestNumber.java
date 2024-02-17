class Find{
    int[] a;
    public Find(int[] a){
        this.a=a;
    }
    public  void findSec(){
        int l=a.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(a[i]<a[j]){//if second smallest a[i]>a[j] 
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The number is "+a[1]);
    }
}
public class Sec_largest_num {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        Find f=new Find(arr);
        f.findSec();
    }
}
