
import java.util.*;
class Main extends Object {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        
        HashMap<String,Integer> NamesOcc= new HashMap<>();
        HashSet<String> NamesOccT= new HashSet<>();
        names.add("sai");
        names.add("shiva");
        names.add("tanmay");
        names.add("shiva");
        names.add("sai");
        names.add("shiva");
        
        System.out.println(names);
        names.sort((a,b)->a.toLowerCase().compareTo(b.toLowerCase()));
        
        // Collections.sort(names,(s1,s2)->s1.toLowerCase().compareTo(s2.toLowerCase()));

      
     
        
        for(String name:names){
        
           if(NamesOcc.containsKey(name)){
                       int counter= NamesOcc.get(name);
                       counter=counter+1;
                       NamesOcc.put(name,counter);
            } 
            else{
                NamesOcc.put(name,1);
                // NamesOccT.add(name);
            } 


        }

        System.out.println(names);

        for(String name:names){
            System.out.println(name+":"+NamesOcc.get(name));
        }
        // System.out.println(NamesOcc);

      
    }
}