package ma.projet.bean;

public class Article {
	private int id = 0;
	private int code;
	public String designation;
	public Categorie categorie;

	private static int comp;


	public int getId() {
		return id;
	}

	public Article(int code, String designation, Categorie categorie) {
		this.id= ++ comp;
		this.code = code;
		this.designation = designation;
		this.categorie = categorie;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return  id + " " + code + " " + designation;
	}

}
