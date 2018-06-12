package metier;

import java.util.Date;

public class CompteCourant extends Compte {

    private double decouvert;

    public CompteCourant() {
    }

    public CompteCourant(int code, double solde, double decouvert) {
        super(code, solde);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(double montant) {
        if(montant> solde+decouvert) throw new RuntimeException("solde insufisant");
        Retrait r = new Retrait(operationList.size()+1,montant,new Date());
        operationList.add(r);
        solde -= montant;
    }

    @Override
    public void updateSolde() {

    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}

