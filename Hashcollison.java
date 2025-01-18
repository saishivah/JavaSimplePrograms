
import java.util.*;



class Person{
    int id;
    String name;

     Person( String name,int id){
        this.id=id;
        this.name=name;

    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return   Objects.hash(name, id); 

        // will create hash collision and chain objects linkedinlist
        // {Person@64=classA, Person@64=classB}
        // return 100;

    }

    // if not overridding
    // {Person@c387f44=classB, Person@6b95977=classA}

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
   
        if (this == obj) return true;  // Same object reference
        if (obj == null) return false;  // Null check
        if (getClass() != obj.getClass()) return false; 

        Person other = (Person) obj;  // Safe to cast now
        return Objects.equals(name, other.name) && other.id==this.id; 
    
}
}

class HashCodeTest extends Object {
    public static void main(String[] args) {
        
     Person person1=new Person("Sai",1);
     Person person2 = new Person("Sai",1);
      

     System.out.println(person1.equals(person2));

     System.out.println("hashcode");
     System.out.println("Person1:"+person1.hashCode());
     System.out.println("Person2:"+person2.hashCode());
     System.out.println("Printing Objects");
     System.out.println(person1.toString());
     System.out.println(person2.toString());
    
     HashMap<Person,String> classroom=new HashMap<>();
     classroom.put( person1,"classA");
     classroom.put( person2,"classB");
     System.out.println(classroom);

     System.out.println("Memory addresses:");
     System.out.println("Person1"+System.identityHashCode(person1));
     System.out.println("Person2"+System.identityHashCode(person2));
    }
}