//Showcasing annonymous inner class.
//here interface product's declared methods are used.
//Here different annonymous claases are created for electronic items , book, cloth.

package online_shopping;

public class Shopping {
   public void show()
    {
        Product electronic=new Product() {
            float finalprice;
            String name;
            @Override
            public void claculatePrice(int price, float discount, String name) {

               finalprice=price*((100-discount)/100);
               this.name=name;
            }

            @Override
            public void displaydetails() {
                System.out.println("The name of the item is : "+name);
                System.out.println("The price of the item is: "+finalprice);
            }
        };
        Product cloth=new Product() {
            float finalprice;
            String name;
            @Override
            public void claculatePrice(int price, float discount, String name) {

                finalprice=price*((100-discount)/100);
                this.name=name;
            }

            @Override
            public void displaydetails() {
                System.out.println("The name of the item is : "+name);
                System.out.println("The price of the item is: "+finalprice);
            }
        };
        Product book=new Product() {
            float finalprice;
            String name;
            @Override
            public void claculatePrice(int price, float discount, String name) {

                finalprice=price*((100-discount)/100);
                this.name=name;
            }

            @Override
            public void displaydetails() {
                System.out.println("The name of the item is : "+name);
                System.out.println("The price of the item is: "+finalprice);
            }
        };
        electronic.claculatePrice(1000,10,"mobile");
        cloth.claculatePrice(500,15,"Denim");
        book.claculatePrice(400,20,"Java");
        electronic.displaydetails();
        cloth.displaydetails();
        book.displaydetails();
    }
}
