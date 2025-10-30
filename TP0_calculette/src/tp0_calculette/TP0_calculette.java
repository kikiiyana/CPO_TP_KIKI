/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

/**
 *
 * @author iyanarekiki
 */
import java.util.Scanner;
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Création d'un objet Scanner pour lire les saisies de l'utilisateur
        Scanner input = new Scanner(System.in);

        // Affichage du menu des opérateurs
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        // Lecture de la saisie de l'utilisateur
        System.out.print("Your choice: ");
        int operateur = input.nextInt();   // on lit un entier et on le stocke dans "operateur"
        
        // Vérification du choix AVANT de demander les opérandes
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error: invalid operator! Please choose a number between 1 and 5.");
            input.close();  // on ferme le scanner
            return;         // on quitte le programme
        }
         // Demande de la première valeur
        System.out.print("Enter the first number: ");
        int operande1 = input.nextInt();   // on lit le premier nombre


        // Demande de la deuxième valeur
        System.out.print("Enter the second number: ");
        int operande2 = input.nextInt();

         // Variable pour stocker le résultat
        double resultat = 0;

        // Embranchements selon le choix de l'utilisateur
        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                if (operande2 != 0) {
                    resultat = (double) operande1 / operande2;
                } else {
                    System.out.println("Error: division by zero!");
                    input.close();
                    return;
                }
                break;
            case 5:
                if (operande2 != 0) {
                    resultat = operande1 % operande2;
                } else {
                    System.out.println("Error: modulo by zero!");
                    input.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                input.close();
                return;
        }

        // Affichage du résultat
        System.out.println("The result is : " + resultat);
        // Fermeture du scanner
        input.close();
        // TODO code application logic here
    }
    
}
