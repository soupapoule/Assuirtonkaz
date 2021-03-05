/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author badbo
 */
public class ListeClient extends AbstractListModel{
    
    private List<Personne> liste;
    
    public ListeClient(List<Personne> liste) {
        this.liste = liste; 
    }

    public ListeClient() { 
    }
    
    @Override
    public int getSize() {
        return liste.size();
    }

    @Override
    public Object getElementAt(int index) {
       return liste.get(index);
    }
    
    public void addClient(Personne p){
        this.liste.add(p);
        this.fireContentsChanged(liste, 0, 0);
        
    }
    
}
