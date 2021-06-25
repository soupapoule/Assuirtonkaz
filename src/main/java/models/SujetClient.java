/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author badbo
 */
public class SujetClient {
    
      private Collection<ObservateurClient> collectionObservateur;

   
    public SujetClient(){
        collectionObservateur = new ArrayList();
    }
    
    public void ajouterOservateur(ObservateurClient o){
        collectionObservateur.add(o);
    }
    
    public void supprimerObservateur(ObservateurClient o){
        collectionObservateur.remove(o);
    }
    
    public void notifierOservateur(){
        for(ObservateurClient obs : collectionObservateur){
            obs.notifier();
        }
    }
    
    public Collection getCollectionObservateur(){
        return collectionObservateur;
    }
    
    public void setCollectionObservateur(Collection<ObservateurClient> collectionObservateur) {
        this.collectionObservateur = collectionObservateur;
    }
}
