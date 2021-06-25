/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.mycompany.assurtonkaz.AddClient;
import com.mycompany.assurtonkaz.ListeClientForm;
import static com.mycompany.assurtonkaz.ListeClientForm.jList1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author badbo
 */
public class Request implements ObservateurClient{

    /**
     * Create s new form ListeClient
     */
    public static ListeClient getListeClientForm() throws SQLException {
        List<Client> listeClient = new ArrayList<Client>();
        ListeClient modelClient = new ListeClient(listeClient);
        Connection co = m_Connexion.connexion();
        Statement st = co.createStatement();

        ResultSet resultat = st.executeQuery("Select * from public.\"Clients\";");

        while (resultat.next()) {
            Integer id = resultat.getInt("IdClient");
            String nom = resultat.getString("NomClient");
            String prenom = resultat.getString("PrenomClient");
            String tel = resultat.getString("TelClient");
            String mail = resultat.getString("MailClient");

            Client c = new Client();
            c.setIdClient(id);
            c.setNomClient(nom);
            c.setPrenomClient(prenom);
            c.setMailClient(mail);
            c.setTelClient(tel);

            modelClient.addClient(c);
        }
        return modelClient;
    }
    
    public void DeleteClient(Integer idSelected ) {
        try {
            Connection co = m_Connexion.connexion();
            Statement st = co.createStatement();
            ResultSet resultat = st.executeQuery("Select * from public.\"Clients\";");
            while (resultat.next()) {

                Integer id = resultat.getInt("IdClient");
                if (idSelected.equals(id)) {
                    PreparedStatement pst = co.prepareStatement("DELETE FROM public.\"Clients\" WHERE \"IdClient\" = ?");
                    pst.setInt(1, id);
                    pst.executeUpdate();
                    pst.close();
                    notifier();
                    break;
                } else {
                    continue;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListeClientForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void notifier() {
        try {
            ListeClientForm.jList1.setModel(Request.getListeClientForm());
        } catch (SQLException ex) {
            Logger.getLogger(Request.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
