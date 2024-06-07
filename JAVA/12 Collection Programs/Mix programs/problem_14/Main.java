//### Problem 14: City Population Tracker
//**Objective:** Track the population of different cities.
//
//**Requirements:**
//- Use `TreeMap` to store city names as keys and population counts as values.
//- Allow adding, updating, deleting, and retrieving city population data.
//- Print the list of cities and their populations in alphabetical order.
package problem_14;

import problem_14.data.CityPopulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CityPopulation cp=new CityPopulation();

        while (true) {
            System.out.println("please enter choice\n1.Add City\n2.display All Cities\n3.Access City record\n4.Update City\n5.Delete City \n6.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cp.addCity(cp.inputCityName(),cp.inputPopulation());
                    break;

                case 2:
                    cp.displayCity();
                    break;

                case 3:
                    cp.retrieveCity(cp.inputCityName());
                    break;

                case 4:
                    cp.updateCity(cp.inputCityName(), cp.inputPopulation());
                    break;

                case 5:
                    cp.deleteCity(cp.inputCityName());
                    break;

                case 6:
                    System.exit(0);
                    break;
            }


        }
    }
}
