package src;

import java.util.Date;

public class Commande implements Comparable<Commande>{
	private int numcommande;
	private Date datecommande;
	private String nomfournisseur;
	
	public Commande (int numcommande,Date datecommande,String nomfournisseur) {
		this.numcommande=numcommande;
		this.datecommande=datecommande;
		this.nomfournisseur=nomfournisseur;		
	}
	public int getNumcommande() {
		return numcommande;
	}
	public Date getDatecommande() {
		return datecommande;
	}
	public String getNomfournisseur() {
		return nomfournisseur;
	}
	public void setNumcommande(int numcommande) {
		this.numcommande=numcommande;
	}
	public void setDatecommande (Date datecommande) {
		this.datecommande=datecommande;
		
	}
	public void setNomfournisseur (String nomfournisseur) {
		this.nomfournisseur=nomfournisseur;	
		
	}
	public String toString() {
		return 
				 "Commande{" +"NumCommande=" + numcommande +
                ", DateCommande=" + datecommande +
                ", NomFournisseur='" + nomfournisseur+ '\'' +
                '}';
		
		
	}
	public boolean equals (Object obj) {
		if (this==obj)
			return true;
		if (obj==null || getClass()!= obj.getClass())
			return false;
		Commande commande =(Commande)obj;
		return numcommande == commande.numcommande;
				
					
	}
	@Override
	public int compareTo(Commande cmd) {
	

		return this.datecommande.compareTo(cmd.datecommande);
	}

	
	

}
