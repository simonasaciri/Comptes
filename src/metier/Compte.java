package metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class  Compte {
    protected int code;
    protected double solde;
    protected List<Operation> operationList = new ArrayList<>();

    public Compte() {
    }

    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    public void verser (double montant){
        Versement v = new Versement(operationList.size()+1,montant,new Date());
        operationList.add(v);
        solde = solde + montant;
    }

    public abstract void retirer(double montant);

    public double consulterSolde(){
       return solde;
    }

    public void versement(double mt, Compte compte){
       retirer(mt);
       compte.verser(mt);
    }

    public List<Operation> getOperationList(){
        return operationList;
    }

    public double totalVersement(){
        double somme = 0 ;
        for(Operation o : getOperationList()){
            if(o instanceof Versement)
            somme += o.getMontant();
        }
        return somme;
    }
    public double totalRetrait(){
        double somme = 0 ;
        for(Operation o : getOperationList()){
            if(o instanceof Retrait)
                somme += o.getMontant();
        }
        return somme;
    }

    public abstract void updateSolde();
}
