/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author badbo
 */
public class Client {
    private Integer IdClient;
    private String NomClient;
    private String PrenomClient;
    private String TelClient;
    private String MailClient;

    public Integer getIdClient() {
        return IdClient;
    }

    public void setIdClient(Integer IdClient) {
        this.IdClient = IdClient;
    }

    public String getNomClient() {
        return NomClient;
    }

    public void setNomClient(String NomClient) {
        this.NomClient = NomClient;
    }

    public String getPrenomClient() {
        return PrenomClient;
    }

    @Override
    public String toString() {
        return "Client : " + IdClient + "Nom  " + NomClient + ", Prenom " + PrenomClient + ", Tel " + TelClient + ", Mail " + MailClient + '}';
    }

    public void setPrenomClient(String PrenomClient) {
        this.PrenomClient = PrenomClient;
    }

    public String getTelClient() {
        return TelClient;
    }

    public void setTelClient(String TelClient) {
        this.TelClient = TelClient;
    }

    public String getMailClient() {
        return MailClient;
    }

    public void setMailClient(String MailClient) {
        this.MailClient = MailClient;
    }

    public Client(Integer IdClient, String NomClient, String PrenomClient, String TelClient, String MailClient) {
        this.IdClient = IdClient;
        this.NomClient = NomClient;
        this.PrenomClient = PrenomClient;
        this.TelClient = TelClient;
        this.MailClient = MailClient;
    }
    
    public Client(){
        
    }
    
}
