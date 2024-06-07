package problem_14.data;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CityPopulation {
    private  String city_name;
    private int population;

    Scanner scanner=new Scanner(System.in);

    TreeMap<String,Integer> city =new TreeMap<>();

    public void addCity(String name,int population)
    {
        city.put(name, population);
        System.out.println("Record of City stored sucessfully");
    }

    public void deleteCity(String name)
    {
        city.remove(name);

    }
    public void displayCity()
    {
        for(Map.Entry c : city.entrySet())
        {
            System.out.println(c);
        }
    }

    public void retrieveCity(String name)
    {
        if (city.containsKey(name))
            System.out.println(name+" = "+city.get(name));
        else
            System.out.println("City not found");
    }

    public void updateCity(String name,int population)
    {
        city.replace(name,population);
        System.out.println("City Updated successfully");
    }

    public String inputCityName()
    {
        System.out.println("please enter the  City name");
        city_name =scanner.next();
        return city_name;
    }

    public int inputPopulation()
    {
        System.out.println("please enter the Population of city");
        population =scanner.nextInt();
        return population;
    }
}