import java.util.*;
public class Fib{
    public static int fin(int n,int a[]){
        if(n==1){
            return a[0];
        }
        else{
            Arrays.sort(a);
            int y= Math.max(a[n-1],fin(n-1,a));
            return y;
        }
    }
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int a[]=new int[n];
        for (int i =0;i<n;i++){
            a[i]=in.nextInt();}
            int x=a[n-1];
            int y=fin(n,a);
            if(n==1)System.out.println(a[0]);
            if(x<y)System.out.println(x+"is smaller then"+y);
            if(x>y)System.out.println(x+"is grater then"+y);
            
        
        
    }
}