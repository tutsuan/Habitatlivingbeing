package HabitatV3;
//Matheus Nascimento 23484
//Camila Mayara Lenke Vieira 21872
import java.util.Scanner;

public class InputValidation2 {
    public static double validationDouble(Scanner sc, String message) {
        while (true) {
            try {
                System.out.println(message);
                return sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Probabilidade invalida");
                sc.nextLine();
            }
        }
    }

    public static int validateInt(Scanner sc, String message) {
        int i;
        while (true) {
            try {
                System.out.println(message);
                i = sc.nextInt();
                sc.nextLine();
                return i;
            } catch (Exception e) {
                System.out.println("introduza um inteiro:");
                sc.nextLine();
            }
        }
    }

    public static String validationLine(Scanner sc, String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = sc.nextLine();

                if (input.equalsIgnoreCase("S") || input.equalsIgnoreCase("N")) {
                    return input;
                } else {
                    System.out.println("Valor inválido. Digite 'S' para Sim ou 'N' para Não. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Formato incorreto. Tente novamente.");
                sc.nextLine();
            }
        }
    }
}



