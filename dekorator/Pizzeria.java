public class Pizzeria {
    public static void main(String[] args){
    
        
    Pizza smallPizza = new Small();
    smallPizza = new Ananas(smallPizza);
    smallPizza = new Ham(smallPizza);
    smallPizza = new Cheese(smallPizza);
    System.out.println(smallPizza.Name());
    System.out.println(smallPizza.Cost());
    
    }

}
