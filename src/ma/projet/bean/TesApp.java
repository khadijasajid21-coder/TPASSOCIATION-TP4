package ma.projet.bean;

public class TesApp {

	public static void main(String[] args) {

		Categorie[] categories = new Categorie[2];

		categories[0] = new Categorie("1", "Ordinateur Portable (O PR)");
		categories[1] = new Categorie("2", "Ordinateur Poste (O PO)");

		Article[] articles = new Article[4];
		articles[0] = new Article(14, " DELL ISPIRON ", categories[0]);
		articles[1] = new Article(4, " SONY VAIO ", categories[0]);
		articles[2] = new Article(74, " TERRA ", categories[1]);
		articles[3] = new Article(785, " HP Compaq ", categories[1]);

		for (int i = 0; i < categories.length; i++) {
			System.out.println(categories[i].getLibelle());
			for (int j = 0; j < articles.length; j++) {
				if (articles[j].getCategorie().getId() == categories[i].getId()) {
					System.out.println(" - " + articles[j]);
				}
			}

			System.out.println();

		}
	}
}
