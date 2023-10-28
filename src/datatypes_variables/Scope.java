package datatypes_variables;

// Koment
class Scope {
    public static void main(String[] args) {
        int x; // is known to all
        x = 10; // e inicializojme x me vleren 10
        if (x == 10) {
            int y = 20; // known only to this block
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        int z = 200;
//        {
//            int y = z * x;
//            {
//                int zh =2;
//            }
//            zh = 1 +2;
//        }
        //y = 100; // Error here
        System.out.println("x is: " + x);
    }
}
