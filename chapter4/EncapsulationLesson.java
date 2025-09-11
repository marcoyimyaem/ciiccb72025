package chapter4;

public class EncapsulationLesson{
    public static void main(String[] args) {
        Swan mother = new Swan();
        // mother.numberEggs = 31;
        mother.setNumberEggs(31);
        System.out.println(mother.getNumberEggs());
    }
}

class Swan {
    private int numberEggs;                    // private
    public int getNumberEggs() {                    // getter
      return numberEggs;
    }
    public void setNumberEggs(int numberEggs) {     // setter
        if (numberEggs >= 0)                     // guard condition
            this.numberEggs = numberEggs;
        else
            System.out.println("invalid numberEggs");
    } }

class LaundryPOS{
    private Basket basket;
    public static final float rate = 15;
    public LaundryPOS(Basket basket) {
       this.basket=basket;
    }
    public static void main(String[] args) {
        LaundryPOS tranLaundryPOS1 = new LaundryPOS(new Basket(9));
        System.out.println(tranLaundryPOS1.basket.getPrice());
    }
}

class Basket{
    private float weight;
    private float price;

    Basket(float weight){
        this.weight = weight;
        this.price = getPrice();
    }
    float getPrice(){
        return this.weight * LaundryPOS.rate;
    }
}