package src;
import java.util.List;
import java.util.ArrayList;
public class Client {
	  private String CodeClient;
	    private String NomClient;
	    private String AdrClient;
	    private String TelClient;
	    private ArrayList<Commande> ListeCommandes;
	    
	    public Client(String CodeClient, String NomClient, String AdrClient) {
	        this.CodeClient = CodeClient;
	        this.NomClient = NomClient;
	        this.AdrClient = AdrClient;
	        this.ListeCommandes=new ArrayList<Commande>();
	    }
	    
	    public boolean enregistrerCommande(Commande cmd) {
	    	return ListeCommandes.add(cmd);
	    }
	    public boolean supprimerCommande(int NumCommande) {
	        for (Commande cmd : ListeCommandes) {
	            if (cmd.getNumcommande() == NumCommande) {
	                ListeCommandes.remove(cmd);
	                return true; 
	            }
	        }
	        return false; 
	    }
	    public String toString() {
	        return "Client{" +
	                "CodeClient='" + CodeClient + '\'' +
	                ", NomClient='" + NomClient + '\'' +
	                ", AdrClient='" + AdrClient + '\'' +
	                ", ListeCommandes=" + ListeCommandes +
	                '}';
	    }


	    public List<Commande> getListeCommandes() {
	        return ListeCommandes;
	    }

}
