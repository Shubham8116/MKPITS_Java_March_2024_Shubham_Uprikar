// program to sort String array .
import java.util.Arrays;  
public class SortStringArray
{  
public static void main(String args[])   
{  
//array of type String
String[] countries = {"Shubham", "Sai", "Alia", "Sonali", "Katrina", "Don", "Panipat",  "Akash", "Komal",  "Suresh", "Rohan",  "Pooja"};  
//sorts string array in ascending order  
Arrays.sort(countries);  
System.out.println(Arrays.toString(countries));  
}  
}  