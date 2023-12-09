package decision_selection;

public class StringExamples {
    public static void main(String[] args) {
        String text = "Kur mun mun, kur smun prit kur mun";
        char shkronja = text.charAt(5);
        System.out.println(shkronja);
        int length = text.length();
        System.out.println(length);

        String formattedString =
                String.format("Per %.2f pike nota eshte %d!%n", 77.6, 8);
        System.out.println(formattedString);

        System.out.println(text.substring(6));
        System.out.println(text.substring(7, 15));
        System.out.println(text.contains("prit"));
        System.out.println(text.contains("mos prit"));
        System.out.println(!text.contains("mos prit"));

        String joinedText = String.join(",", "Naim", "Filan", "Fisteke");
        System.out.println(joinedText);

        System.out.println("".isEmpty());
        System.out.println("    ".isEmpty());
        System.out.println(text.isEmpty());
        System.out.println("".isBlank());
        System.out.println("    ".isBlank());
        System.out.println(text.isBlank());

        System.out.println("Naim".concat(" Sulejmani").concat(" professor"));

        System.out.println(text.replace('u', 'U'));
        System.out.println(text);
        System.out.println(text.replace("mun", "munesh"));
        System.out.println(text);

        String[] split = text.split(" ");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        System.out.println(text.indexOf('m'));
        System.out.println(text.indexOf("mun"));
        System.out.println(text.indexOf("mun", 10));

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println("       NAIM   SULEJMANI    ".trim());

        String vlera = String.valueOf(100);
        vlera = String.valueOf(200.4);
        vlera = String.valueOf(true);
        System.out.println(vlera);

        System.out.println("A JENI LODH \n".repeat(3));
        System.out.println(text.startsWith("Kur"));
        System.out.println(text.endsWith("mun"));

    }
}















