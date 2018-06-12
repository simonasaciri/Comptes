package metier;

import java.util.Date;

public class Retrait extends Operation {


    public Retrait() {
        super();
    }

    public Retrait(int code, double montant, Date dateOperation) {
        super(code, montant, dateOperation);
    }

}
