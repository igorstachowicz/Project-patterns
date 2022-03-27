public class Sprzedawca {
    private CarShop ferrari;
    private CarShop lamborghini;
    private CarShop mclaren;
    private CarShop porsche;

    public Sprzedawca() {
        ferrari = new Ferrari();
        lamborghini = new Lamborghini();
        mclaren = new Mclaren();
        porsche = new Porsche();
    }

    public void ferrariSale() {
        ferrari.nazwa();
        ferrari.cena();
    }

    public void lamborghiniSale() {
        lamborghini.nazwa();
        lamborghini.cena();
    }

    public void mclarenSale() {
        mclaren.nazwa();
        mclaren.cena();
    }

    public void porscheSale() {
        porsche.nazwa();
        porsche.cena();
    }
}