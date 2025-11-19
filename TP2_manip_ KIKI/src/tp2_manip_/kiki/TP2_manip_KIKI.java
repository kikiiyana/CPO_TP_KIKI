/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_.kiki;

/**
 *
 * @author iyanarekiki
 */
public class TP2_manip_KIKI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
        //tartiflettes avec des calories différentes
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        
        //référence le même objet que assiette2
        Tartiflette assiette3 = assiette2;
        
        // calories avant modif
       
           System.out.println("Assiette 1 : " + assiette1.nbCalories + " calories");
        System.out.println("Assiette 2 : " + assiette2.nbCalories + " calories");
         System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        
//// Incrémenter les calories de assiette2
        assiette2.nbCalories += 100;
        
//après incrémentation
        System.out.println("\nAprès modification de assiette2 :");
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // Échange des références entre assiette1 et assiette2
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        //après échange
        System.out.println("\nAprès inversion :");
        System.out.println("Assiette 1 calories : " + assiette1.nbCalories);
        System.out.println("Assiette 2 calories : " + assiette2.nbCalories);

        Moussaka[] tabMoussaka = new Moussaka[10];

        for(int i = 0; i < tabMoussaka.length; i++) {
    tabMoussaka[i] = new Moussaka(200); 
    }



        System.out.println("\nAffichage des calories des Moussakas :");
        for (int i = 0; i < tabMoussaka.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " : " + tabMoussaka[i].nbCalories + " calories");
        }

        
    }
}

 
