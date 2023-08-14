package LS4.q1;

class Employee extends Person{
    private int emId;
    private double hourlyPay;
    Employee() {super();emId=0;hourlyPay=0;}
    Employee(String n,int a,int i,double p){super(n,a);this.emId=i;this.hourlyPay=p;}
    public int getId(){return emId;}    
    public double getPay(){return hourlyPay;}
    public void setId(int id){this.emId=id;}
    public void setPay(double pay){this.hourlyPay=pay;}
    public double getRaise(){
        this.hourlyPay+=this.hourlyPay*(0.15);
        return hourlyPay;
    }
    double payday(int hrs){
        double pay;
        if(hrs>24){
            pay=hourlyPay*40+(hrs-40)*hourlyPay*1.5;
        }
        else{
            pay=hourlyPay*hrs;
        }
        return pay;
    }
    public String toString(){return super.toString()+"\n" + "They make $ "+getPay()+".\n"+"They have the employee ID "+getId()+".\n";}
}
