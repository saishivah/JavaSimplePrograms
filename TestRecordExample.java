 record testRecord(String name, int id){

}

public class TestRecordExample {
    public static void main(String[] args) {
        // Initialize using constructor
        testRecord person = new testRecord("John", 25);
        
        System.out.println(person.name());
        System.out.println(person.id());
        
    }
}