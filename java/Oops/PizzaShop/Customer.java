package Oops.PizzaShop;

public class Customer {

    public void oderPizza(String pizzaType,boolean tomatos, boolean corn, boolean mushroom){
        if(pizzaType.equalsIgnoreCase("StandardBase")){
            Pizza pizza = new StandardBasePizza();
            System.out.println("PizzaType : "+ pizzaType + "  | Price : "+ pizza.pizzaPrice(tomatos,corn,mushroom));
        } else if (pizzaType.equalsIgnoreCase("SoftBase")) {
            Pizza pizza = new SoftBasePizza();
            System.out.println("PizzaType : "+ pizzaType + "  | Price : "+ pizza.pizzaPrice(tomatos,corn,mushroom));
        }else
            System.out.println("Invalid PizzaType");
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.oderPizza("StandardBase",true,false,true);
        customer.oderPizza("SoftBase",false,false,false);
    }



}
