/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_.helloworld;

import java.util.Scanner;

/**
 * Role: afficher un message de bienvenue
 * @author iyanarekiki
 * date: 20 octobre 2025
 */
public class TP0_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour !");
        String prenom;
        Scanner sc ;
        sc = new Scanner (System.in) ;
        System.out.println("Quel est votre prénom ?");
        prenom = sc.nextLine();
        System.out.println("Au revoir !");
        
        // TODO code application logic here
    }
    
}
