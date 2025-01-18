
import java.util.*;
import java.util.stream.Collectors;
import java.lang.System;

class StreamApiExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");
        ArrayList<String> tt=new ArrayList<>();
        tt.forEach(m->System.out.println(m));
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        filteredNames.forEach(System.out::println);

        List<String> filteredNames2 = names.stream()
        .filter(name -> name.startsWith("J"))
        .map(name->name.toUpperCase()).toList();
        // .collect(Collectors.toList());

        

        filteredNames2.forEach(name->System.out.println(name));



    }

}