class Matrix{
    int[][] arr;
    int m,n;
    public Matrix(int[][] arr,int m,int n){
        this.arr=arr;
        this.m=m;
        this.n=n;
    }
    public Matrix(){
        
    }
    public void display(){
        for(int i=0;i<this.m;i++){
            for(int j=0;j<this.n;j++){
                System.out.print(this.arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    Matrix multiply(Matrix A,Matrix B){
        int[][] arr=new int[A.m][B.n];
        for(int i=0;i<A.m;i++){
            for(int j=0;j<B.n;j++){
                arr[i][j]=0;
                for(int k=0;k<A.n;k++){
                    arr[i][j]+=A.arr[i][k]*B.arr[k][j];
                }
            }
        }
        return new Matrix(arr,A.m,B.n);
    }
}
public class MatrixMultiply{
    public static void main(String[] args){
        int[][] arrA={{1,2,3},{3,4,0}};
        int[][] arrB={{1,2},{3,4},{5,6}};
        Matrix A=new Matrix(arrA,arrA.length,arrA[0].length);
        Matrix B=new Matrix(arrB,arrB.length,arrB[0].length);
        Matrix m=new Matrix();
        Matrix C=m.multiply(A,B);
        C.display();
    }
}
