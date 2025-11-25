package comp.exemple.tp;

import java.util.ArrayList;
import java.util.List;

public class Livre {
	 private static int compteur = 0;
	    private final int id;
	    private String titre;
	    private Auteur auteur;
	    private List<Genre> genres = new ArrayList<>();

	    public Livre(String titre, Auteur auteur) {
	        this.id = ++compteur;
	        this.titre = titre;
	        this.auteur = auteur;
	        auteur.ajouterLivre(this);      
	    }

	    public int getId() { return id; }
	    public String getTitre() { return titre; }
	    public Auteur getAuteur() { return auteur; }

	    @Override
	    public String toString() {
	        return "Livre[id=" + id +
	               ", titre=" + titre +
	               ", auteur=" + auteur.getNom() +
	               "]"
	               ;
	    }

			public void ajouterGenre(Genre genre) {
				 if (genre == null || genres.contains(genre)) return;
			        genres.add(genre);
			        if (!genre.getLivres().contains(this)) genre.ajouterLivre(this);
			    }
			
		}


