package metier;

import java.util.Date;

public class Operation {
    private int code;
    private double montant;
    private Date dateOperation;

    public Operation() {
    }

    public Operation(int code, double montant, Date dateOperation) {
        this.code = code;
        this.montant = montant;
        this.dateOperation = dateOperation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }
}
