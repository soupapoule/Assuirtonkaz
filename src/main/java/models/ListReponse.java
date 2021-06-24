/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author manu
 */
public class ListReponse extends Sujet implements Serializable {
    private String reponse1;
    private String reponse2;
    private String reponse3;
    private int reponse4;
    private String reponse5;
    private int reponse6;
    private String reponse7;
    private String reponse8;
    private String reponse9;
    public ListReponse() {
                
    }
    @Override
    public String toString() {
        
        return "les réponse{ " + "vous êtiez déjà assuré : " + reponse1 + ",vous vivez " + reponse2 + ", vous êtes accompagné de " + reponse3 + ", vous avez" + reponse4 +" pièce(s) vous avez "+reponse6+" étage(s) vous avez un jardin: "+reponse7+" vous avez une voiture: "+reponse8+" vous avez une télé: "+reponse9+ '}';
    }

    public String getReponse1() {
        return reponse1;
    }

    public void setReponse1(String reponse1) {
        this.reponse1 = reponse1;
        this.notifierObser();
    }

    public String getReponse2() {
        return reponse2;
    }

    public void setReponse2(String reponse2) {
        this.reponse2 = reponse2;
        this.notifierObser();
    }

    public String getReponse3() {
        return reponse3;
    }

    public void setReponse3(String reponse3) {
        this.reponse3 = reponse3;
        this.notifierObser();
    }

    public int getReponse4() {
        return reponse4;
    }

    public void setReponse4(int reponse4) {
        this.reponse4 = reponse4;
        this.notifierObser();
    }

    public String getReponse5() {
        return reponse5;
    }

    public void setReponse5(String reponse5) {
        this.reponse5 = reponse5;
        this.notifierObser();
    }

    public int getReponse6() {
        return reponse6;
    }

    public void setReponse6(int reponse6) {
        this.reponse6 = reponse6;
        this.notifierObser();
    }

    public String getReponse7() {
        return reponse7;
    }

    public void setReponse7(String reponse7) {
        this.reponse7 = reponse7;
        this.notifierObser();
    }

    public String getReponse8() {
        return reponse8;
    }

    public void setReponse8(String reponse8) {
        this.reponse8 = reponse8;
        this.notifierObser();
    }

    public String getReponse9() {
        return reponse9;
    }

    public void setReponse9(String reponse9) {
        this.reponse9 = reponse9;
        this.notifierObser();
    }
    
    
}
