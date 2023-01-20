public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.messageSenderBase = new EmailSender();
        customerManager.UpdateCustomer();

    }
}