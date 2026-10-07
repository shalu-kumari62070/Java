/*
3.0 Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of information as instance variables—a part number (type String), a part description (type String), a quantity of the item being purchased(type int) and a price per item(double).Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities. */

class Invoice{
    String pname, pdescription;
    int pqty;
    double pperItem;
    Invoice(String pname, String pdescription, int pqty, double pperItem){
        this.pname = pname;
        this.pdescription = pdescription;
        this.pqty = pqty;
        this.pperItem = pperItem;
    }
    public void setPName(String name){
        pname = name;
    }
    public String getPName(){
        return pname;
    }
    public void setPDescription(String description){
        pdescription = description;
    }
    public String getPDescription(){
        return pdescription;
    }
    public void setQty(int qty){
        if (qty>0) {
            pqty = qty;
        }else{
            pqty = 0;
        }
    }
    public int getQty(){
        return pqty;
    }
    public void setPricePerItem(double price){
        if (price>0) {
            pperItem = price;
        }else{
            pperItem = 0.0;
        }
    }
    public double getPricePerItem(){
        return pperItem;
    }
    public double getInvoiceAmount(){
        return pqty*pperItem;
    }
}
public class q3 {
    public static void main(String[] args) {
        Invoice I = new Invoice("Hardware", "This is Hardware", 10, 23000);
        System.out.println(I.getPName());
        System.out.println(I.getPDescription());
        System.out.println(I.getPricePerItem());
        System.out.println(I.getQty());
        System.out.println(I.getInvoiceAmount());
    }
}

/*
Hardware
This is Hardware
23000.0
10
230000.0
*/
