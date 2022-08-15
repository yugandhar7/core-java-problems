import java .util.*;
public class Main{
    public static void main(String args[]){
        TreeSet<String> sr = new TreeSet();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of students");
        int n =in.nextInt();
        while(n-->=0){
            String s=in.nextLine();
            sr.add(s);
        }
        System.out.println(sr);
        
    }
}