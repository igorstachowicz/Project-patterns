public class Cheese extends PizzaDecorator{
    public Cheese(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double Cost(){
        return super.Cost() + 4.50;
    }

    @Override
    public String Name() {
        return super.Name()+ " Cheese ";
    }
}
