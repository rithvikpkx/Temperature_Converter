import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the Temperature: ");
        double temp = in.nextDouble();
        System.out.print("Would you like to convert this to Celcius or Fahrenheit(C / F): ");
        char conversion = Character.toUpperCase(in.next().charAt(0));


        while(!(conversion == 'C' || conversion == 'F')){
            System.out.println("Error. Please type either (C) for Celcius or (F) for Fahrenheit: ");
            conversion = Character.toUpperCase(in.next().charAt(0));
        }


        if(conversion == 'C'){
            System.out.printf("%.2f", toCelcius(temp));
        }else{
            System.out.printf("%.2f", toFahrenheit(temp));
        }
    }

    public static double toCelcius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    public static double toFahrenheit(double Celcius){
        return (Celcius * 9/5) + 32;
    }
}