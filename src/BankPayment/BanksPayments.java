package BankPayment;

class payment{
    public void pay(double amount){
        System.out.println("Processing payment of $ "+ amount);

    }
}
class CreditCardPayment extends payment{
    public void pay(double amount){

        System.out.println("Recived $" + amount + "  From Credit Card");
    }
}
class DebitCardPayment extends payment{
    public void pay(double amount){
        System.out.println("Recived $" +amount+ " From  Debit Card");
    }
}
class UPIPayment extends payment{
    public void pay(double amount){
        System.out.println("Recived $" +amount+"  From UPI Payment");
    }
}

public class BanksPayments {
    public static void main(String[] args) {
       
       
       payment pay=new payment();
       pay.pay(100.00);

        //  payment pay1=new CreditCardPayment();
        //  pay1.pay(500.00);


      payment pay2=new DebitCardPayment();
      pay2.pay(100.00);

        // payment pay3=new UPIPayment();
        // pay3.pay(500.00);
        
      
    }

}
