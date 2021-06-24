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
 * @author manu
 */
public class Sujet {
    private Collection<Observateur>  collectionObservateur;
    public Sujet(){
        collectionObservateur=new ArrayList();
    }
    public  void ajouterObser(Observateur o) {
        collectionObservateur.add(o);
    }
    public  void supprimerObser(Observateur o) {
        collectionObservateur.remove(o);
    }
    public  void notifierObser() {
        for(Observateur obs : collectionObservateur){
            obs.notifier();
        }
    }
}
