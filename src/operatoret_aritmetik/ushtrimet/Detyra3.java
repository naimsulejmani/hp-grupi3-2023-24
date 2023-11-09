package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class Detyra3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ekipi vendas: ");
        String homeTeam = reader.nextLine();
        System.out.print("Ekipi musafir: ");
        String awayTeam = reader.nextLine();
        System.out.print("Numri i tifozeve: ");
        int totalFans = reader.nextInt();
        reader.nextLine();
        System.out.print("Fusha / Stadiumi: ");
        String stadium = reader.nextLine();

        System.out.printf("Sa gola ka shenuar %s: ", homeTeam);
        byte homeTeamGoals = reader.nextByte();
        System.out.printf("Sa gola ka shenuar %s: ", awayTeam);
        byte awayTeamGoals = reader.nextByte();

        System.out.println("----------------------------------------");
        System.out.println("Rezultati perfundimtar");
        System.out.printf("%s - %s   %d - %d%n", homeTeam, awayTeam, homeTeamGoals, awayTeamGoals);
        System.out.printf("Stadiumi %s me gjithsej %d spektatore prezent.%n", stadium, totalFans);
        System.out.println("----------------------------------------");
    }
}











