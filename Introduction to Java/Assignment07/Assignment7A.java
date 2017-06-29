package assignment7a;
import java.util.Scanner;
/**
 *
 * @author Marie Dohnalová
 * This program converts between the U.S. system of measurement and the metric system of measurement.
 */
public class Assignment7A {

    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Please, choose type of conversion. Write it in format:"
                + " physical_unit to physical_unit (for example: pound to kilogram).");
        System.out.println("You can use there physical units and conversions: pound and kilogram, ounce and gram,"
                + " foot and meter, mile and kilometer.");
        
        // Use string to store user´s convertion.
        String conversion1 = sc.next();
        String conversion2 = sc.next();
        String conversion3 = sc.next();
                
        // Use double to store user´s source value.
        System.out.println("Please, enter a value to be converted.");
        double value = sc.nextDouble();
        
        // Concatenate 3 strings to one.
        String conversion = conversion1 + conversion2 + conversion3;
        
        // Choose what method to use on user´s source value (based on type of convertion).
        if (conversion.equals("poundtokilogram")){
            PoundToKilogram(value);
        }
        else if (conversion.equals("kilogramtopound")){
            KilogramToPound(value);
        }
        else if (conversion.equals("ouncetogram")){
            OunceToGram(value);
        }
        else if (conversion.equals("gramtoounce")){
            GramToOunce(value);
        }
        else if (conversion.equals("foottometer")){
             FootToMeter(value);
        }
        else if (conversion.equals("metertofoot")){
            MeterToFoot(value);
        }
        else if (conversion.equals("miletokilometer")){
            MileToKilometer(value);
        }
        else if (conversion.equals("kilometertomile")){
            KilometerToMile(value);
        }
        else{
            System.out.println("Invalid data.");
        }
    }
    
    // Set of methods that counts and print the output.
    public static void PoundToKilogram (double value ){
        double kilogram;
        kilogram = value * 0.4536;
        System.out.println(value + " pounds = " + kilogram + " kilograms");
    }
    public static void KilogramToPound (double value){
        double pound;
        pound = value * 2.2046;
        System.out.println(value + " kilograms = " + pound + " pounds");
    }
    public static void OunceToGram (double value){
        double gram;
        gram = value * 28.5;
        System.out.println(value + " ounces = " + gram + " grams");
    }
    public static void GramToOunce (double value){
        double ounce;
        ounce = value * 0.0353;
        System.out.println(value + " grams = " + ounce + " ounces");
    }
    public static void FootToMeter (double value){
        double meter;
        meter = value * 0.3048;
        System.out.println(value + " foot = " + meter + " meters");
    }
    public static void MeterToFoot (double value){
        double foot;
        foot = value * 3.2808;
        System.out.println(value + " meters = " + foot + " feet");
    }
    public static void MileToKilometer (double value){
        double kilometer;
        kilometer = value * 1.61;
        System.out.println(value + " miles = " + kilometer + " kilometers");
    }
    public static void KilometerToMile (double value){
        double mile;
        mile = value * 0.6214;
        System.out.println(value + " kilometers = " + mile + " miles");
    }

}
