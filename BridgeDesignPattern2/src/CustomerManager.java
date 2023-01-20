public class CustomerManager {
    public MessageSenderBase messageSenderBase; //bridge

    public void UpdateCustomer(){
        messageSenderBase.Send(new Body());
        System.out.println("Customer updated");
    }
}
