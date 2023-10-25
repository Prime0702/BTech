package LS4.q4;

class Counterproduct extends PurchaseProduct{
    private int count;
    Counterproduct(int count){
        this.count=count;
    }
    int getCount() {
        return count;
    }
    double getCost(){
        return getCount()*getUnitprince();
    }
    public String toString(){
        return "Name: "+getName()+"\tPrice: "+getUnitprince()+"\tCount: "+getCount()+"\tCost: "+getCost();
    }
}