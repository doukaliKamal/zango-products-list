package ma.zango.portlet;

public class Produit {
	
	private String lib;
	private String prix;
	private String dateMiseVente;
	
	
	public Produit(String lib, String prix, String dateMiseVente) {
		super();
		this.lib = lib;
		this.prix = prix;
		this.dateMiseVente = dateMiseVente;
	}
	public String getLib() {
		return lib;
	}
	public void setLib(String lib) {
		this.lib = lib;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getDateMiseVente() {
		return dateMiseVente;
	}
	public void setDateMiseVente(String dateMiseVente) {
		this.dateMiseVente = dateMiseVente;
	}
	
	
	

}
