import com.sun.source.tree.WhileLoopTree;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){
        //Code that will read the principle from user
        System.out.print("How much is the principle [amount should be between 1k - 1M] ");

        Scanner princip = new Scanner(System.in);

        Testing calculations = new Testing();

        //loop statement for error handling for principle
        while(calculations.getAmount() <= 999.99d || calculations.getAmount() >= 1000000d){
            calculations.setAmount(princip.nextDouble());

            if (calculations.getAmount() <= 999d || calculations.getAmount() >= 1000000d)
                System.out.println("\"Please try again: How much is the principle [amount should be between 1k-M] " );
        };

        //Code that will read the interest rate
        System.out.print("Enter the annuel interest rate for your mortage (value should be between 0 - 30 ) ");
        Scanner intrate = new Scanner(System.in);

        //loop statement for error handling for percentage
        while(calculations.getPerc() >= 30d || calculations.getPerc() <= 0d){

            calculations.setPerc(intrate.nextFloat());

                if (calculations.getPerc()>= 30d || calculations.getPerc() <= 0d)
                    System.out.println("Please enter a value greater than 0 but less than 30 " );


            };
        calculations.setPerc(calculations.getPerc() / calculations.getAnnuel());

        calculations.setPerc(calculations.getPerc() / calculations.getAnuelperc() );


        //Code that will read the number of months on a mortage
        System.out.print("Enter number of years of the mortage (range 1 ~ 30) ");
        Scanner months = new Scanner(System.in);

        while (calculations.getCycle() <= 1d || calculations.getCycle() >= 30d){
            calculations.setCycle(months.nextFloat());

                if (calculations.getCycle() <+ 1d || calculations.getCycle() >= 30d)
                    System.out.println("Please enter a value between 1 and 30 " );

            };

        calculations.setCycle(calculations.getCycle() * calculations.getAnuelperc() );

// Math formulae for calculating the mortgage

        calculations.setFirstvalue(calculations.getPerc() * Math.pow((1 + calculations.getPerc()) , calculations.getCycle()));


        //calculations for second values

        calculations.setSecondvalue(1 - Math.pow((1 + calculations.getPerc()), calculations.getCycle()));
        //Dividing our fraction


        calculations.setValuediv(calculations.getFirstvalue() / calculations.getSecondvalue());

        calculations.setResults(calculations.getValuediv() * calculations.getAmount());

        // Converting final results into a currency
        NumberFormat fresults = NumberFormat.getCurrencyInstance();

        String results = fresults.format(calculations.getResults());

        //System.out.println(calculations.getFinal_results());


        System.out.println(results);

    }

}

