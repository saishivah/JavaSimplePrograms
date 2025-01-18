import java.lang.reflect.Array;
import java.util.*;
abstract class  Animal{

    void sound(){}
}

class Dog extends Animal{
  
    void sound(){
        System.out.println("bow bow");
    }
}


class Cat extends Animal{
  
    void sound(){
        System.out.println("meow meow");
    }
}


class AnimalList{
    private Animal[]  animals= new Animal[5];
    private int nextIndex=0;
    public void add(Animal a){
        if(nextIndex<animals.length){
            animals[nextIndex]=a;
            nextIndex++;
        }
    }
    public void print(){
        for(Animal a: animals){
            System.out.println(a);
        }
    }

}
public class abstractExample {

    
   public static void main(String[] args) {
    Animal a = new Dog();
    a.sound();
   Dog d= new Dog();
   d.sound();

   AnimalList al = new AnimalList();
   Cat c = new Cat();
   al.add(c);
   al.add(d);
   al.add(c);
   al.add(d);
   al.add(c);

   ArrayList<Animal> animals=new ArrayList<>();
   animals.add(c);
   animals.add(d);
   animals.forEach(an->an.sound());

    
   }


}
