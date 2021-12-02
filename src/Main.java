public class Main extends WatchC201108 implements Printable  {

    public static void main(String[] args) {

        WatchC201108 obj=new WatchC201108();

        obj.setName("Hand Ornaments");
        System.out.println("the Watch you want is "+' '+obj.getName());

        TotalPrice cost =new TotalPrice();


        System.out.println("You have to pay total : "+cost.add(obj.mainPrice(),obj.GechengDiscount(),cost.tax)+"taka where "+cost.tax+" tax added");
        System.out.println("Thanks come Again here:) ");
        Printable pr =new Main();
        pr.NEWMODELSuggetions();
    }

    @Override
    public void NEWMODELSuggetions() {
        System.out.println("Some new model will come ASAP in this store:");
        System.out.println("1.product_id(xfer)\n"+"2.product_id(sfec)" );
    }



}