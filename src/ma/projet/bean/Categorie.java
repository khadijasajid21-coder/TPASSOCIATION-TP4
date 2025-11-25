package ma.projet.bean;

public class Categorie {
	private static int comp;
    private int id = 0;
    private String libelle;
    private String code;
    public Article article;
    
   
   public Categorie(String code, String libelle) {
		
		this.id= ++ comp;
		this.libelle = libelle;
		this.code = code;
		}

   public int getId() {
	return id;
   }

   public String getLibelle() {
	return libelle;
   }

   public void setLibelle(String libelle) {
	this.libelle = libelle;
   }

   public String getCode() {
	return code;
   }

   public void setCode(String code) {
	this.code = code;
   }

   @Override
   public String toString() {
	return "Categorie [id=" + id + ", libelle=" + libelle + ", code=" + code + "]";
   }
    
   

}
