package com.exemple.tp;

public class Main {
    public static void main(String[] args) {
        
        Etudiant e1 = new Etudiant("Dupont", "Alice");
        Etudiant e2 = new Etudiant("Martin", "Bob");
        Etudiant e3 = new Etudiant("Chouaib",   "Youssef");
        Etudiant e4 = new Etudiant("Lahlou",    "Salma");
        Etudiant e5 = new Etudiant("Roussafi",  "Hassan");
        Etudiant e6 = new Etudiant("Amrani",    "Aïcha");
       
        e1.ajouterNote(14.5);
        e1.ajouterNote(12.0);
        e1.ajouterNote(16.0);
        e2.ajouterNote(10.0);
        e2.ajouterNote(13.5);
        e1.ajouterNote(18.0);
        e2.ajouterNote(11.0);
        e2.ajouterNote(15.5);
        e1.ajouterNote(16.0);
        e2.ajouterNote(14.0);
        e2.ajouterNote(17.5);

       
        e1.afficherNotes();
        System.out.println(e1);

        e2.afficherNotes();
        System.out.println(e2);
        
        
        Filiere info   = new Filiere("Informatique");
        Filiere genie  = new Filiere("Génie Civil");

        

        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);
        info.ajouterEtudiant(e4);
        info.ajouterEtudiant(e5);
        info.ajouterEtudiant(e6);
      
      
       

        genie.ajouterEtudiant(new Etudiant("Belkahia", "Khadija"));
        genie.ajouterEtudiant(new Etudiant("Laaroussi","Walid"));

        System.out.println(info);
        info.afficherEtudiants();
        System.out.println();

        System.out.println(genie);
        genie.afficherEtudiants();
        System.out.println();

        
        System.out.println("Détail de e3 : " + e3);
    }
    }
