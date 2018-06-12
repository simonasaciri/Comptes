package metier;

import java.util.Date;

public class CompteEpargne extends Compte{

    private double taux;

    public CompteEpargne(int code, double solde, double taux) {
        super(code, solde);
        this.taux = taux;
    }

    public CompteEpargne() {
    }

    @Override
    public void retirer(double montant) {
        if(montant> solde) throw new RuntimeException("solde insufisant");
        Retrait r = new Retrait(operationList.size()+1,montant,new Date());
        operationList.add(r);
        solde -= montant;
    }

    @Override
    public void updateSolde() {
        solde = solde * (1+taux/100);

    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}

