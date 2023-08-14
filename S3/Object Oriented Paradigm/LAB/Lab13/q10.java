class q10 implements Runnable {
    private String name;
    public q10(String name) {
        this.name = name;}
    public void run() {
        System.out.println(name);}

    public static void main(String[] args) {
        Thread thread = new Thread(new q10("Aadithyan"));
        thread.start();
    }
}