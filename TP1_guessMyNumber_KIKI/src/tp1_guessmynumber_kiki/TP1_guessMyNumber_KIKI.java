/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_kiki;

/**
 *
 * @author iyanarekiki
 */
import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_KIKI {

    /**
     * @param args the command line arguments
     */ 

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        Random generateurAleat = new Random();

        System.out.println("Voici 5 nombres aléatoires entre 0 et 100 :");
        for (int i = 0; i < 5; i++) {
            int n = generateurAleat.nextInt(101);
            System.out.println(n);
        }

       
        System.out.println("\nChoisissez le niveau de difficulté :");
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");
        System.out.println("4) Mode Cauchemar");

        int choix = clavier.nextInt();

        int maxValeur = 100;        
        int maxTentatives = 1000;   
        boolean modeCauchemar = false;

        if (choix == 1) {
            maxValeur = 50;
        } else if (choix == 2) {
            maxValeur = 100;
        } else if (choix == 3) {
            maxValeur = 500;
            maxTentatives = 10; 
        } else if (choix == 4) {
            modeCauchemar = true;
        }

        
        int nombreMystere = generateurAleat.nextInt(maxValeur + 1);

        int proposition;
        int compteur = 0;
        boolean trouve = false;

        System.out.println("\nDevinez le nombre entre 0 et " + maxValeur + " :");

        
        while (!trouve && compteur < maxTentatives) {
            proposition = clavier.nextInt();
            compteur++;

           
            boolean mentir = modeCauchemar && (generateurAleat.nextInt(100) < 30);

            if (proposition == nombreMystere) {
                System.out.println("Gagné !");
                trouve = true;
            } else if (proposition < nombreMystere) {
                if (mentir)
                    System.out.println("Trop grand");
                else
                    System.out.println("Trop petit");
            } else {
                if (mentir)
                    System.out.println("Trop petit");
                else
                    System.out.println("Trop grand");
            }
        }

        if (trouve) {
            System.out.println("Nombre trouvé en " + compteur + " tentatives.");
        } else {
            System.out.println("Perdu ! Le nombre mystère était : " + nombreMystere);
        }

        clavier.close();
    }
}


        
   
