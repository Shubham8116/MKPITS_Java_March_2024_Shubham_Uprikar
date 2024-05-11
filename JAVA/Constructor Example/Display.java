public class Display {
    static String channel;
    static String serial;
    static int a;
    public Display()
    {
        System.out.println("This is default constructor");
    }
    public Display(String channel,String serial)
    {
        this.channel=channel;
        this.serial=serial;
        System.out.println(channel);
        System.out.println(serial);
	System.out.println("This is parameterised constructor")
    }
}
