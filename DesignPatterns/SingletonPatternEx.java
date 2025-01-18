package DesignPatterns;

class ApplicationProfile{

// we directly read from memory
    private static volatile ApplicationProfile instance;

    private String uid;
    private String name;

    private ApplicationProfile(String uid,String name){
        this.uid=uid;
        this.name=name;

    }


    public String getName() {
        return name;
    }
    public String getUid() {
        return uid;
    }
    public static ApplicationProfile getInstance(String uid, String name) {
        ApplicationProfile result = instance;
        if(result==null){
            synchronized(ApplicationProfile.class){
                    // instance not present instantiate
                    if(result==null){
                        instance=new ApplicationProfile(uid,name);
                    }
            }
        }
        return instance;
    }

}



public class SingletonPatternEx {

    public static void main(String[] args) {
        
        // ApplicationProfile ap = new ApplicationProfile("ramapp", null);
    //    A private constructor prevents the class from being instantiated from outside the class itself.

       ApplicationProfile ap = ApplicationProfile.getInstance("01", "hari");


       System.out.println(ap.getName());
       System.out.println(ap.getUid());
       System.out.println(ap.hashCode());

       System.out.println("some change");
       ApplicationProfile ap2 = ApplicationProfile.getInstance("02", "ram");
       System.out.println(ap.getUid());
       System.out.println(ap2.getName());
       System.out.println(ap.hashCode());
        System.out.println(ApplicationProfile.class.getDeclaredMethods());
       
    }
}

    








