public class WatchC201108 extends Price {


    int mainPrice() {
        int price = 1280;

        System.out.println("total price is " + price);
        return price;
    }

    int GechengDiscount() {
        int discount = 87;
        System.out.println("Congratulation You got 50% store Discount!");
        return discount;
    }

    private String Watchname;
    public String Watchsellerid;
    public String Store;



    public String getName()//getter
    {
        return Watchname;
    }

    public void setName(String name)//setter
    {
        this.Watchname = name;//here this keyword refers to BookC201087 class
    }

}