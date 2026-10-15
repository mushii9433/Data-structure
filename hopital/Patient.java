package Hospitalpacakage;

public class Patient {
    String name;
    double consulfee;

    public  Patient(String name, double consulfee){
        this.name = name;
        this.consulfee = consulfee;
    }

    void displayinfo() {
        System.out.println("PATIENTNAME" + name);
        System.out.println("PIILAMOUNT" + consulfee);

    }
}