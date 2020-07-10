package org.novaworld.creational.builder;

public class Website {
    private String name;
    private Csm csm;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Csm getCsm() {
        return csm;
    }

    public void setCsm(Csm csm) {
        this.csm = csm;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", csm=" + csm +
                ", price=" + price +
                '}';
    }
}