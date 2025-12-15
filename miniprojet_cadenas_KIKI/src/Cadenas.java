/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author iyanarekiki
 */


import java.util.Random;

public class Cadenas {

    private int nombreChiffresTropHauts = 0;
    private int nombreChiffresTropBas = 0;

    private final int[] codeSecret = new int[4];
    private final int MAX_TENTATIVES = 5;
    private int tentativesUtilisees = 0;
    private int nombreChiffresExacts = 0;

    public Cadenas() {
        genererCodeSecret();
    }

    private void genererCodeSecret() {
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            this.codeSecret[i] = rand.nextInt(10); // chiffres de 0 à 9
        }
    }

    public void verifierEssai(int[] essai) {
        // Réinitialiser les compteurs pour cet essai
        this.nombreChiffresExacts = 0;
        this.nombreChiffresTropHauts = 0;
        this.nombreChiffresTropBas = 0;

        for (int i = 0; i < 4; i++) {
            if (essai[i] == codeSecret[i]) {
                this.nombreChiffresExacts++;
            } else if (essai[i] > codeSecret[i]) {
                this.nombreChiffresTropHauts++;
            } else {
                this.nombreChiffresTropBas++;
            }
        }

        // Incrémenter le nombre de tentatives
        this.tentativesUtilisees++;
    }

    // ----- GETTERS -----
    public int getNombreChiffresExacts() {
        return nombreChiffresExacts;
    }

    public int getNombreChiffresTropHauts() {
        return nombreChiffresTropHauts;
    }

    public int getNombreChiffresTropBas() {
        return nombreChiffresTropBas;
    }

    public int getMAX_TENTATIVES() {
        return MAX_TENTATIVES;
    }

    public int getTentativesUtilisees() {
        // ➜ on renvoie simplement le compteur
        return tentativesUtilisees;
    }

    // ----- ÉTAT DE LA PARTIE -----
    public boolean estGagne() {
        return nombreChiffresExacts == 4;
    }

    public boolean estPerdu() {
        return tentativesUtilisees >= MAX_TENTATIVES && !estGagne();
    }

    public boolean estFini() {
        return estGagne() || estPerdu();
    }

    public int getTentativesRestantes() {
        return MAX_TENTATIVES - tentativesUtilisees;
    }

    public void recommencer() {
        tentativesUtilisees = 0;
        nombreChiffresExacts = 0;
        nombreChiffresTropHauts = 0;
        nombreChiffresTropBas = 0;
        genererCodeSecret();
    }

    }
