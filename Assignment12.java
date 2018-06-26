Que:3 Create a Generic function?
Ans:3
package sumgeneric;
public class SumGeneric {
    public static <T> void printArray(T array[]){
        for(T var:array){
        System.out.println(" "+var);
    }
    }
public static void main(String[] args) {
        Character array1[]={'K','A','M','A','L'};
        Integer array2[]={1,2,3,4,5,6,7,8,9,20};
         printArray(array1);
        System.out.println();
        printArray(array2);
    }
    
}

Que:4 W.A.P a java program to sort the list on the basis of age and name?
Ans:4
package movies;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort implements Comparable<Sort>
{
  String Name;
    int Age;
    Sort(String Name,int Age)
    {
       this.Name=Name;
       this.Age=Age;
    }
    public String getName(){
        return Name;
        
    }
    public int getAge(){
    return Age;
}
    public static void main(String args[])
    {
        ArrayList<Sort>sort=new ArrayList<Sort>();
        sort.add(new Sort("Tasvir",18));
        sort.add(new Sort("Malan",19));
         sort.add(new Sort("Komal",23));
        sort.add(new Sort("Kulfi",21));
         sort.add(new Sort("Bela",30));
        sort.add(new Sort("Madhu",17)); 
    }
    Personname comparename=new Personname();
    Collections.sort(sort.comparename);
    System.out.println("Sorted According to Name:\n");
    for(Sort person:sort)
    System.out.println(person.getName()+" "+person.getAge());
    
    Collections.sort(sort);
    System.out.println("\nSorted According to Age:\n");
    for(Sort person:sort)
    System.out.println(person.getName()+" "+person.getAge());

    @Override
    public int compareTo(Sort t) {
        return this.Age-t.Age;
        
    }

  
}
   
class Personname implements Comparator<Sort>
{
    @Override
    public int compare(Sort t,Sort t1){
        return t.getName().compareTo(t1.getName());
    
    }
   
}
