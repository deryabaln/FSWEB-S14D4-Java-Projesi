package com.workintech.product;

public class Chocolate extends ProductForSale{

    private boolean isMilky;

    public Chocolate(String type, double price, String description, boolean isMilky) {
        super(type, price, description);
        this.isMilky = isMilky;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate is a " + getType() + ", İs milky? - " + isMilky + ", " +
                getPrice()+ "tl. AÇIKLAMA:" + getDescription() );
    }
}
