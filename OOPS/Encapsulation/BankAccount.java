class Main {
    public static void main(String[] args) {
        BankAccount sc= new BankAccount();
        sc.setBalance(9000);
        System.out.println(sc.getBalance());
    }
}

class BankAccount{
    int balance;

    void setBalance(int balance){
        if(balance>=0){
            this.balance=balance;
        }
    }

    int getBalance(){
        return balance;
    }
}