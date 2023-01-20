public abstract class MessageSenderBase {
    
    public void Save(){
        System.out.println("message saved");
    }
    public abstract void Send(Body body);
}
