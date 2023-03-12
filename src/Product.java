
public class Product {
    String name;
    double price;
    double quantity;
    String category;


    Product(String name,double price,double quantity,String category){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.category=category;

    }


    public String getName(){

        return name;
    }

    public double getPrice(){

        return price;
    }

    public double getQuantity(){

        return quantity;
    }

    public String getCategory(){

        return category;
    }

    public boolean hasStock() {
        return quantity != 0;
    }

    public boolean isCategory(String category){
        return this.category.equals(category);
    }

}
