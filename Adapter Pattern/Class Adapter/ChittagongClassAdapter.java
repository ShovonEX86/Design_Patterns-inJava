

public class ChittagongClassAdapter extends ChittagongPizza implements Pizza {
    @Override
    public void toppings() {
        this.sausage();
    }
    
    @Override
    public void bun() {
        this.bread();
    }
}
