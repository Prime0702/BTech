package LS4.q4;

class PurchaseProduct{
    private String name;
    private double unitprince;
    
    PurchaseProduct(){
        name="no product";
        unitprince=0.0;
    }
    double getUnitprince() {
        return unitprince;
    }
    String getName() {
        return name;
    }
    void setUnitprince(double unitprince) {
        this.unitprince = unitprince;
    }
    void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Name: "+getName()+"\tPrice: "+getUnitprince();
    }

}
