package LS4.q1;

class Person{
    private String name;
    private int age;
    String getName(){return name;}
    int getAge(){return age;}
    void setName(String n){name=n;}
    void setAge(int a){age=a;}
    public String toString(){return "Name: "+ name +"\n" + "Age: "+ age;}
    Person(String n,int a){
        name=n;age=a;
    }
    Person(){
        name="NULL";
        age=-1;
    }
}
