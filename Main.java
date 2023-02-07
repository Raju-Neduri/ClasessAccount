public class Main {
    public static void main(String[] args) {

Account myAccount = new Account();
myAccount.setNumber("12345");
myAccount.setBalance(10000);
myAccount.setCustomerName("Raju Neduri");
myAccount.setCustomerEmail("raj****@gmail.com");
myAccount.setCustomerPhone("99897*****");


myAccount.withdrawFunds(100);
myAccount.depositFunds(250);
myAccount.withdrawFunds(50);
myAccount.withdrawFunds(200);
myAccount.withdrawFunds(210);

    }
}