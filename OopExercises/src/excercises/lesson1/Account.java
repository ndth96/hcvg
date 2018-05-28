package excercises.lesson1;

/**
 * Account
 * 1.6
 */
public class Account {

    private String id;
    private String name;
    private int balance=0;

    public Account(String Id, String Name){
        id = Id;
        name = Name;
    }

    public Account(String Id, String Name, int Balance){
        id = Id;
        name = Name;
        balance = Balance;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // add amount to balance, return balance
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if(amount <= balance)
            balance -= amount;
        else 
            System.out.println("Amount exceeded balance");
        return balance;     
    }

    public int transferTo(Account another, int amount){
        int tmpBalance = balance;
        if(this.debit(amount) < tmpBalance){
            another.credit(amount); 
            System.out.println("Transfer Succed !");
        }
                   
        return balance;
    }

    public String toString(){
        return "Account[id="+id+",name="+name+",balance="+balance+"]";
    }
}