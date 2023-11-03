package operatoret_aritmetik;

public class SystemOutExample {
    public static void main(String[] args) {
        //cdo sen qe shkruajme e shtyp dhe e shton nje rresht te ri pasti te printohet
        System.out.println("Naim");
        System.out.println("Sulejmani");
        System.out.println(); // e shtojme vetem nje rresht te ri te zbrazet

        // cdo sen e shtyp ne konsole dhe nuk shton rresht te ri,
        // shkrimi i rradhes vazhdon aty ku ka mbet
        System.out.print("Hello");
        System.out.print("World");
        System.out.println("!!!!!!");
        System.out.println(); // rresht i ri


        System.out.printf("Hello %s!%n", "World");
        System.out.printf("Hello %S!%n", "World");


    }
}
