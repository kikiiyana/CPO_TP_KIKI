/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FenetreQuiz;

/**
 *
 * @author iyanarekiki
 */
class Question {
    private final String intitule;
    private final String proposition1;
    private final String proposition2;
    private final String proposition3;
    private final String proposition4;
    private final int indexBonneReponse;

    public Question(String intitule, String p1, String p2, String p3, String p4, int indexBonneReponse) {
        this.intitule = intitule;
        this.proposition1 = p1;
        this.proposition2 = p2;
        this.proposition3 = p3;
        this.proposition4 = p4;
        this.indexBonneReponse = indexBonneReponse;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getProposition1() {
        return proposition1;
    }

    public String getProposition2() {
        return proposition2;
    }

    public String getProposition3() {
        return proposition3;
    }

    public String getProposition4() {
        return proposition4;
    }

    public int getIndexBonneReponse() {
        return indexBonneReponse;
    }
    
}
