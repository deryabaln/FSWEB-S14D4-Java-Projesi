package com.workintech.product;

public class Bread extends ProductForSale{

    private  double weight;
    public Bread(String type, double price, String description, double weight) {
        super(type, price, description);
        this.weight = weight;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread is a " + getType() + ", "+ weight + "g, " +
                getPrice()+ "tl. AÇIKLAMA:" + getDescription() );

    }
}
