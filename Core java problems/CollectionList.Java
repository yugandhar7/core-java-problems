
import java .util.*;
public class Main{
    public static void main(String args[]){
        List a = new ArrayList();
      //Appending 2 collectons using for loop  
        a.add("one" );
        a.add("two");
        a.add("three");
        a.add("four");
        a.add("five");
        
        
        
        
    
    List b = new ArrayList(); 
    b.addAll(a);
    b.add("six");
    b.add("Seven");
    b.add("eight"); 
    b.add("nine ");
    b.add("ten");
  
     for(int i=0;i<b.size();i++){
         System.out.println(b.get(i));
     }

    
     
        
    }
    
}
// Appending  2 collections using iterator

import java .util.*;
public class Main{
    public static void main(String args[]){
        List a = new ArrayList();
        
        a.add("one" );
        a.add("two");
        a.add("three");
        a.add("four");
        a.add("five");
        
        
        
        
    
    List b = new ArrayList();
    b.addAll(a);
    b.add("six");
    b.add("Seven");
    b.add("eight"); 
    b.add("nine ");
    b.add("ten");
    
    
    Iterator itr= b.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
}    
  

    
     
        
    }
    


import java .util.*;
public class Main{
    public static void main(String args[]){
        List a = new ArrayList();
      //Appending 2 collectons (first name and last name) using for loop  
        a.add("one" );
        a.add("two");
        a.add("three");  
        a.add("four");
        a.add("five");
        
        
        
        
    
    List b = new ArrayList();
    
    b.add("six");
    b.add("Seven");
    b.add("eight"); 
    b.add("nine ");
    b.add("ten");
  
     for(int i=0;i<b.size();i++){
         System.out.println(a.get(i)+"="+b.get(i));
     }

    
     
        
    }
    
}
// Appending  2 collections (first name and last name) using iterator

import java .util.*;
public class Main{
    public static void main(String args[]){
        List a = new ArrayList();
        
        a.add("one" );
        a.add("two");
        a.add("three");
        a.add("four");
        a.add("five");
        
        
        
        
    
    List b = new ArrayList();
    
    b.add("six");
    b.add("Seven");
    b.add("eight"); 
    b.add("nine ");
    b.add("ten");
    
    
    Iterator ab= a.iterator();
    Iterator ba= b.iterator();

    
    while(ab.hasNext() && ba.hasNext()){
        System.out.println(ab.next()+"="+ba.next());
    }
}    
  

    
     
        
    }
    


