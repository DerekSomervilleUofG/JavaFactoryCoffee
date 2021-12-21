public class Main {
    public static void main(String[] args){
        OrderCoffee orderCoffee = new OrderCoffee();
        Coffee coffee = orderCoffee.orderCoffee(CoffeeType.mocha);
        System.out.println("Your " + coffee.getName() + " is ready");
    }
}
