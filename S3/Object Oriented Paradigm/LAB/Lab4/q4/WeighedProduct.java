package LS4.q4;

class Weighedproduct extends PurchaseProduct{
    private double weight;
    Weighedproduct(double weight){
        this.weight=weight;
    }
    double getWeight() {
        return weight;
    }
    double getCost(){
        return getWeight()*getUnitprince();
    }
    public String toString(){
        return "Name: "+getName()+"\tPrice: "+getUnitprince()+"\tWeight: "+getWeight()+"\tCost: "+getCost();
    }
}