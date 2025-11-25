package comp.exemple.tp;

import java.util.*;

public class Genre {
	 private String nom;
	    private List<Livre> livres = new ArrayList<>();

	    public void ajouterLivre(Livre l) {
	        if (l == null || livres.contains(l)) return;
	        livres.add(l);
	        l.ajouterGenre(this); 
	    }

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public List<Livre> getLivres() {
			return livres;
		}

		public void setLivres(List<Livre> livres) {
			this.livres = livres;
		}

		

		

}
