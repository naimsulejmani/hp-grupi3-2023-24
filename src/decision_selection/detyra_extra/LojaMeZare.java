package decision_selection.detyra_extra;

import java.util.Scanner;

public class LojaMeZare {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int zariIPare = (int) (Math.random() * 6) + 1;
        int zariIDyte = (int) (Math.random() * 6) + 1;
        System.out.print("Shkruaj vleren sa po luan: ");
        int vleraEPerdoruesit = reader.nextInt();
        System.out.printf("vlera e zarit te pare eshte %d %c%n", zariIPare, 9855 + zariIPare);
        System.out.printf("vlera e zarit te dyte eshte %d %c%n", zariIDyte, 9855 + zariIDyte);

        System.out.println(
                vleraEPerdoruesit == (zariIPare + zariIDyte) ? "urime keni fituar" :
                        "fat heren tjeter"
        );

    }
}









