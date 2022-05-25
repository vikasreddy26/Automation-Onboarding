package java8;

public class ConstructorReference {

    public static void main(String[] args) {
      ProductInterface productInterface =  Product::new;
      Product product=productInterface.getProduct("TubeLight",600,"Electronics","A");
        System.out.println("Name : "+product.name + " | price: " + product.price+" | Category : "+product.category);
    }
}
