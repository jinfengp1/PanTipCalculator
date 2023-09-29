import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner ask = new Scanner(System.in);
        System.out.println("PAN Tip Calculator, at your service.\n\n");
        System.out.println("ENTER BILL: ");
        double billNT = ask.nextDouble();
        System.out.println("ENTER TIP% PLEASE DO NOT INCLUDE '%': ");
        double tipPc = ask.nextDouble();
        tipPc /= 100; //gets decimal value
        System.out.println("HOW MANY PEOPLE IN PARTY: ");
        int numPpl = ask.nextInt();
//operations 
        double tipAmt = billNT * tipPc;
        double billT = billNT + tipAmt;
        double tpp = tipAmt / numPpl;
        double totalpp = billT / numPpl;
//printing the stuff out
        System.out.println("Tip Amount: $" + tipAmt);
        System.out.println("Total Bill, including tip: $" + billT);
        System.out.println("Tip per person: $" + tpp);
        System.out.println("Total per person: $" + totalpp);

    }
}