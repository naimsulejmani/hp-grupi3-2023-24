package decision_selection.detyra_extra;

import java.util.Scanner;

public class Teksti {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje text: ");
        String texti = reader.nextLine();
        System.out.printf("Texti permban %d karaktere %n", texti.length());
        System.out.printf("Shkruaj nje indeks nga 0 deri ne %d per te shfaqur nenteksitn: ",
                texti.length() - 1);
        int startIndex = reader.nextInt();
        System.out.println(texti.substring(startIndex));
        System.out.printf("Shkruaj nje index nga %d deri ne %d per te shfaqur nentekstin: ",
                startIndex, texti.length() - 1);
        int endIndex = reader.nextInt();
        System.out.println(texti.substring(startIndex, endIndex));
        System.out.print("Shkruaj fjalen qe po kerkoni: ");
        reader.nextLine();
        String searchText = reader.nextLine();
        if (texti.contains(searchText)) {
            System.out.printf(
                    "Fjala e dhene \"%s\" gjendet ne text dhe fillon nga indexi %d %n"
                    , searchText, texti.indexOf(searchText));
        } else {
            System.out.printf("Fjala e dhene \"%s\" nuk gjendet ne text %n", searchText);
        }

        System.out.print("Shkruaj tekstin qe po kerkoni ta zevendesoni: ");
        searchText = reader.nextLine();
        System.out.print("Shkruaj tekstin zevendesues: ");
        String replacedText = reader.nextLine();
        System.out.println(texti.replace(searchText, replacedText));


    }

}














