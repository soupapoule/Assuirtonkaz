/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.mycompany.assurtonkaz.Question;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author manu
 */
public class ListReponse extends Sujet implements Serializable {
    private boolean isAssure;
    private boolean isAlone;
    private int nbPiece;
    private boolean isFloor;
    private int nbFloor;
    private boolean isGarden;
    private boolean isCar;
    private boolean isTv;
    private int IdClientCont;
    public ListReponse() {
                
    }
    @Override
    public String toString() {
        
        return "les réponse{ " + "vous êtiez déjà assuré : " + isAssure + ",vous vivez " + isAlone  + ", vous avez" + nbPiece +" pièce(s) vous avez "+isFloor+" étage(s) vous avez un jardin: "+nbFloor+" vous avez une voiture: "+isGarden+" vous avez une télé: "+isCar+ '}';
    }

    public boolean getIsAssure() {
        return isAssure;
    }

    public void setIsAssure(boolean isAssure) {
        this.isAssure = isAssure;
        this.notifierObser();
    }

    public boolean getIsAlone() {
        return isAlone;
    }

    public void setIsAlone(boolean isAlone) {
        this.isAlone = isAlone;
        this.notifierObser();
    }

    public int getNbPiece() {
        return nbPiece;
    }

    public void setNbPiece(int nbPiece) {
        this.nbPiece = nbPiece;
        this.notifierObser();
    }

    public boolean getIsFloor() {
        return isFloor;
    }

    public void setIsFloor(boolean isFloor) {
        this.isFloor = isFloor;
        this.notifierObser();
    }

    public int getNbFloor() {
        return nbFloor;
    }

    public void setNbFloor(int nbFloor) {
        this.nbFloor = nbFloor;
        this.notifierObser();
    }

    public boolean getIsGarden() {
        return isGarden;
    }

    public void setIsGarden(boolean isGarden) {
        this.isGarden = isGarden;
        this.notifierObser();
    }

    public boolean getIsCar() {
        return isCar;
    }

    public void setIsCar(boolean isCar) {
        this.isCar = isCar;
        this.notifierObser();
    }

    public boolean getIsTv() {
        return isTv;
    }

    public void setIsTv(boolean isTv) {
        this.isTv = isTv;
        this.notifierObser();
    }

    public int getIdClientCont() {
        return IdClientCont;
    }

    public void setIdClientCont(int IdClientCont) {
        this.IdClientCont = IdClientCont;
        this.notifierObser();
    }
    public static void afficherQuestion(Integer idSelected) throws SQLException
    {
        Connection co = m_Connexion.connexion();
        Statement st = co.createStatement();
        ResultSet resultat = st.executeQuery("Select * from public.\"clients\";");
        
        while (resultat.next()) {

                Integer id = resultat.getInt("idclient");

                if (idSelected.equals(id)) {
                    Integer IdClient = resultat.getInt("idclient");
                    System.out.println(IdClient);
                    Client c = new Client();
                    c.setIdClient(id);
                    

                    Question q = new Question(IdClient);
//                    q.idClient = IdClient;
                    q.setVisible(true);
                    resultat.close();
                    break;
                } else {
                    continue;
                }
            }
    }
    
    
    
}
