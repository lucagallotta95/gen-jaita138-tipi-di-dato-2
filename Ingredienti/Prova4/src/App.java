import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Definisci gli ingredienti del piatto!");
        
        System.out.println("Nome dell'ingrediente:");
        String nomeIngrediente =  sc.nextLine(); 
        
        System.out.println("Descerizione dell'ingrediente");
        String descrizioneIngrediente = sc.nextLine();
        
        System.out.println("Tipo di ingrediente:")
        byte tipologiaIngrediente = sc.nextByte();
        sc.nextLine();
        
        System.out.println("Disponibile:");
        Boolean disponibilità = sc.nextBoolean();

        System.out.println("Prezzo:");
        Double prezzo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Allergeni:");
        String allergeni = sc.nextLine();

        System.out.println("Metodo di conservazione: ");
        String conservazione = sc.nextLine();

        System.out.println("Immagine:");
        String immagine = sc.nextLine();


        ----------------------------------------------------------------------------------


        
        System.out.println("Nome dell'ingrediente: " + nomeIngrediente);
        System.out.println("Descrizione dell'ingrediente: " + descrizioneIngrediente);
        System.out.println("Tipo di ingrediente: " + tipologiaIngrediente);
        System.out.println("Disponibile: " + disponibilità);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Allergeni: " + allergeni);
        System.out.println("Metodo di conservazione: " + conservazione);
        System.out.println("Immagine: " + immagine);
        
        
        
        
    sc.close();

}
}
