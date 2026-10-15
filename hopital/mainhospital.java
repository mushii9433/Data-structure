package Hospitalpacakage;
public class mainhospital {
    public static void main() {
        System.out.println();
        Outpatient b1 = new Outpatient("ayan", 48, 18);
        System.out.println("NAME: " + b1.name);
        System.out.println("LAB CHARG:$" + b1.labcharg);
        System.out.println("FeeNumber:$" + b1.consulfee);
        System.out.println("TOTAL:$" + b1.calculatebill());

        System.out.println(" ");
        Outpatient b2 = new Outpatient("faraxan", 91, 77);
        System.out.println("NAME:" + b2.name);
        System.out.println("LAB CHARG:$" + b2.labcharg);
        System.out.println("FeeNumber:$" + b2.consulfee);
        System.out.println("TOTAL:$" + b2.calculatebill());

        System.out.println(" ");
        Outpatient b3 = new Outpatient("caisho", 91, 46);
        System.out.println("NAME:" + b3.name);
        System.out.println("LAB CHARG:$" + b3.labcharg);
        System.out.println("FeeNumber:$" + b3.consulfee);
        System.out.println("TOTAL:$" + b3.calculatebill());

        System.out.println(" ");
        Outpatient b4 = new Outpatient("farxiyo", 67, 770);
        System.out.println("NAME:" + b4.name);
        System.out.println("LAB CHARG:$" + b4.labcharg);
        System.out.println("feenumber:$" + b4.consulfee);
        System.out.println("TOTAL:$" + b4.calculatebill());


        System.out.println(" ");
        System.out.println(" ");
        inpatient bb1 = new inpatient("ali", 45, 31, 7);
        System.out.println("NAME:" + bb1.name);
        System.out.println("CONSFUL:$" + bb1.consulfee);
        System.out.println("Room Charge: $" + bb1.roomcharg);
        System.out.println("Number of Days: " + bb1.numberdays);
        System.out.println("Total Bill: $" + bb1.calculatebill());
        System.out.println("");

        inpatient bb2 = new inpatient("Abdi", 8, 46, 9);
        System.out.println("NAME:" + bb2.name);
        System.out.println("CONSFUL:$" + bb2.consulfee);
        System.out.println("Room Charge: $" + bb2.roomcharg);
        System.out.println("Number of Days: " + bb2.numberdays);
        System.out.println("Total Bill: $" + bb2.calculatebill());
        System.out.println("");

        inpatient bb3 = new inpatient("Halimo", 7, 68, 8);
        System.out.println("NAME:" + bb3.name);
        System.out.println("CONSFUL: $" + bb3.consulfee);
        System.out.println("Room Charge: $" + bb3.roomcharg);
        System.out.println("Number of Days: " + bb3.numberdays);
        System.out.println("Total Bill: $" + bb3.calculatebill());
        System.out.println("");


    }
}