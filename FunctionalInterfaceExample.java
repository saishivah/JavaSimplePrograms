// Define a functional interface
@FunctionalInterface

interface Square {
    int calculate(int x);
}

class Fun {
    public static void main(String args[]) {
        int a = 5;

        String test="hari";
        // lambda expression to 
        // define the calculate method
        Square s = ( x) -> x * x;

        Square s2 = new Square() {
            @Override
            public int calculate(int x) {
                return x * x;
            }
        };

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);

        int ans2 = s2.calculate(6);
        System.out.println(ans);
        System.out.println(ans2);

        System.out.println(test.length());
    }
}