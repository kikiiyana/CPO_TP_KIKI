/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur.pkg_.kiki;

/**
 *
 * @author iyanarekiki
 */
import java.util.Scanner;
public class TP1_convertisseur_KIKI {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);


        System.out.println("Bonjour, saisissez une valeur :");
        double valeur = clavier.nextDouble();

        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        int choix = clavier.nextInt();

        double resultat = 0.0;
        String uniteDepart = "";
        String uniteArrivee = "";

        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(valeur);
                uniteDepart = "Celsius";
                uniteArrivee = "Kelvin";
                break;
            case 2:
                resultat = KelvinVersCelcius(valeur);
                uniteDepart = "Kelvin";
                uniteArrivee = "Celsius";
                break;
            case 3:
                resultat = FarenheitVersCelcius(valeur);
                uniteDepart = "Fahrenheit";
                uniteArrivee = "Celsius";
                break;
            case 4:
                resultat = CelciusVersFarenheit(valeur);
                uniteDepart = "Celsius";
                uniteArrivee = "Fahrenheit";
                break;
            case 5:
                resultat = KelvinVersFarenheit(valeur);
                uniteDepart = "Kelvin";
                uniteArrivee = "Fahrenheit";
                break;
            case 6:
                resultat = FarenheitVersKelvin(valeur);
                uniteDepart = "Fahrenheit";
                uniteArrivee = "Kelvin";
                break;
            default:
                System.out.println("Choix invalide !");
                clavier.close();
                return;
        }

        System.out.printf("%.2f degrés %s est égal à %.2f degrés %s%n",
                          valeur, uniteDepart, resultat, uniteArrivee);

        clavier.close();
    }

    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5.0 / 9.0;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9.0 / 5.0) + 32;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }
}
        // TODO code application logic here
    
    

