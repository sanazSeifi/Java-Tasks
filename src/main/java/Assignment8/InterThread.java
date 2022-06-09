package Assignment8;

class Customer{
    int amount= 10000;
    synchronized void withdraw(int amount){
        System.out.println("going to withdraw ... ");
        if (this.amount<amount){
            System.out.println("Less Balance; waiting for deposite ... ");
            try{
                wait();
            }
            catch (Exception e){}
        }
        this.amount = amount;
        System.out.println("Withdraw completed ... ");
    }
    synchronized void deposit(int amount) {
        System.out.println("going to deposite ... ");
        this.amount += amount;
        System.out.println("deposite completed ... ");
        notify();
    }
    }
    class Test {
    public static void main(String args[]){
        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15000);}
            }.start();
        new Thread(){
            public void run(){c.deposit(10000);}
        }.start();
        }
}
