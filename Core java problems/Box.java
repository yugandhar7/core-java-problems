import java.util.*;
abstract class Box{
    int l,b,h;

    Box(int a, int g,int c){
        l=a;
        b=g;
        h=c;
    }

    abstract void area();
    abstract void volume();
}
class Box3d extends Box {

    Box3d(int a, int g,int c){
        super(a,g,c);

    }




    void area(){
        int area=l*b;
        System.out.println( "area = "+area);

    }
    void volume(){
        int vol=l*b*h;
        System.out.println("volume = "+vol);

    }

}
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int l =in.nextInt();
        int b = in.nextInt();
        int h= in.nextInt();
        Box w = new Box3d(l,b,h);
        w.area();
        w.volume();


    }
}