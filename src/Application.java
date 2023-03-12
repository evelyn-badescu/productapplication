public class Application {
    public static void main(String[] args) {

        Product product1=new Product("skirt",24,2,"clothes");
        System.out.println("first product name: "+product1.getName()+" and its price: "+product1.getPrice());
        System.out.println("first product price: "+product1.getQuantity()+" and its category: "+product1.getCategory());
        System.out.println(product1.hasStock());
        System.out.println(product1.isCategory("toys"));
        System.out.println();

        Product product2=new Product("doll",12,0,"toys");
        System.out.println("second product name: "+product2.getName()+" and its price: "+product2.getPrice());
        System.out.println("second product price: "+product2.getQuantity()+" and its category: "+product2.getCategory());
        System.out.println(product2.hasStock());
        System.out.println(product1.isCategory("toys"));
        System.out.println();

        Product product3=new Product("bread",10,2,"food");
        System.out.println("third product name: "+product3.getName()+" and its price: "+product3.getPrice());
        System.out.println("third product price: "+product3.getQuantity()+" and its category: "+product3.getCategory());
        System.out.println(product1.hasStock());
        System.out.println(product1.isCategory("toys"));



    }
}