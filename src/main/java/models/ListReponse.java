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
    private boolean reponse1;
    private boolean reponse2;
    private int reponse4;
    private boolean reponse5;
    private int reponse6;
    private boolean reponse7;
    private boolean reponse8;
    private boolean reponse9;
    public ListReponse() {
                
    }
    @Override
    public String toString() {
        
        return "les réponse{ " + "vous êtiez déjà assuré : " + reponse1 + ",vous vivez " + reponse2  + ", vous avez" + reponse4 +" pièce(s) vous avez "+reponse6+" étage(s) vous avez un jardin: "+reponse7+" vous avez une voiture: "+reponse8+" vous avez une télé: "+reponse9+ '}';
    }

    public boolean getReponse1() {
        return reponse1;
    }

    public void setReponse1(boolean reponse1) {
        this.reponse1 = reponse1;
        this.notifierObser();
    }

    public boolean getReponse2() {
        return reponse2;
    }

    public void setReponse2(boolean reponse2) {
        this.reponse2 = reponse2;
        this.notifierObser();
    }

    

    public int getReponse4() {
        return reponse4;
    }

    public void setReponse4(int reponse4) {
        this.reponse4 = reponse4;
        this.notifierObser();
    }

    public boolean getReponse5() {
        return reponse5;
    }

    public void setReponse5(boolean reponse5) {
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

    public boolean getReponse7() {
        return reponse7;
    }

    public void setReponse7(boolean reponse7) {
        this.reponse7 = reponse7;
        this.notifierObser();
    }

    public boolean getReponse8() {
        return reponse8;
    }

    public void setReponse8(boolean reponse8) {
        this.reponse8 = reponse8;
        this.notifierObser();
    }

    public boolean getReponse9() {
        return reponse9;
    }

    public void setReponse9(boolean reponse9) {
        this.reponse9 = reponse9;
        this.notifierObser();
    }
    
    
}
