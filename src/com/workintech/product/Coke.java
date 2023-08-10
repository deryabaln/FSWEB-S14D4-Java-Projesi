package com.workintech.product;

public class Coke extends ProductForSale{

    private double volume;
    public Coke(String type, double price, String description, double volume) {
        super(type, price, description);
        this.volume = volume;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke is a " + getType() + ", "+ volume + "l, " +
                getPrice()+ "tl. AÇIKLAMA:" + getDescription() );
    }
}
