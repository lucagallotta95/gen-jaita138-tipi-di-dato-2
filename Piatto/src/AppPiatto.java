import java.util.Scanner;

public class AppPiatto {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("Descrizione:");
        String descrizione = sc.nextLine();

        System.out.println("Prezzo:");
        double prezzo = sc.nextDouble();

        System.out.println("Disponibilità:");
        Boolean disponibilità = sc.nextBoolean();

        System.out.println("Tipologia:");
        byte tipologia = sc.nextByte();
        sc.nextLine();

        System.out.println("Allergeni:");
        String allergeni = sc.nextLine();

        System.out.println("Foto:");
        String foto = sc.nextLine();

        System.out.println("Calorie:");
        short calorie = sc.nextShort();
        sc.nextLine();

        System.out.println("Variazioni:");
        String variazioni = sc.nextLine();

        sc.close();

    }
}