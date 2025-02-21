import java.util.Scanner;
public class testLogin
{
public static void main(String[] args) 
{
    Scanner input=new Scanner(System.in);
    int selezione=input.nextInt();
    
    
    System.out.println("Registrazione.");
    System.out.println("Inserisci Nome Utente:");
    String Nome=input.nextLine();
    System.out.println("Inserisci Password:");
    String Password=input.nextLine();
    System.out.println("Inserisci Codice Segreto per ripristino crdenziali:");
    String codSegreto=input.nextLine();
    System.out.println("Se desideri cambiare le credenziali premi il tasto 1.");
    switch(selezione)
    {
        case 1:
        System.out.println("Inserisci parola chiave:");
        String tryPass=input.toString();
        if(tryPass!=codSegreto)
        {
        System.out.println("Errore. Riprova:");
           else
           

        }
    }



}






}