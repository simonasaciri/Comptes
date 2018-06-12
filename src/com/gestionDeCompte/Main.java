package com.gestionDeCompte;

import metier.Compte;
import metier.CompteCourant;
import metier.CompteEpargne;

public class Main {

    public static void main(String[] args) {

        Compte cp1 = new CompteCourant(1,8000,5000);
        Compte cp2 = new CompteEpargne(2,5000,5.5);

        cp1.verser(550);
        System.out.println("Solde = "+cp1.consulterSolde());
        cp1.retirer(50);
        System.out.println("Solde = "+cp1.consulterSolde());
        cp1.versement(300,cp2);
        System.out.println("Solde cp1 = "+cp1.consulterSolde());
        System.out.println("Solde cp2 = "+cp2.consulterSolde());

        cp1.totalVersement();
        cp1.totalRetrait();
        cp2.updateSolde();
        System.out.println("Solde cp2 = "+cp2.consulterSolde());




        System.out.println("Simona");
    }
}
