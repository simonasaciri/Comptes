package metier;

import java.util.Date;

public class Versement extends Operation {

    public Versement() {
        super();
    }

    public Versement(int code, double montant, Date dateOperation) {
        super(code, montant, dateOperation);

    }

}