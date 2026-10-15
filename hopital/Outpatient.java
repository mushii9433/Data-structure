package Hospitalpacakage;

public class Outpatient extends  Patient {
    double labcharg;

    public Outpatient(String name, double consfulfree, double labcharg) {
        super(name, consfulfree);
        this.labcharg = labcharg;
    }

    public double calculatebill() {
        return labcharg + consulfee;
    }
}
