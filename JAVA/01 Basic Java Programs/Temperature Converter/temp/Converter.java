package temp;

public class Converter {
    private int celsius;
    private int fahrenheit;
     public Converter()
    {
        celsius=0;
        fahrenheit=0;
    }
    public void setCelsius(int celsius)
    {
        this.celsius=celsius;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public int getCelsius() {
        return celsius;
    }

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void celsiusToFahrenheit()
    {
        fahrenheit=(celsius*9/5)+32;
        System.out.println("fahrenheit ="+fahrenheit);
    }
    public void fahrenheitToCelsius()
    {
        celsius=(fahrenheit-32)*5/9;
        System.out.println("Celsius ="+celsius);
    }
}
