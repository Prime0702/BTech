class q11 extends Thread {
    private String name;
    public q11(String name) {
        this.name = name;}
    public void run() {
        System.out.println(name);}
    public static void main(String[] args) {
        q11 thread = new q11("Aadithyan");
        thread.start();}}