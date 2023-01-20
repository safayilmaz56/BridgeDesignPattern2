public class SmsSender extends MessageSenderBase {
    @Override
    public void Send(Body body) {
        System.out.println("{0} was sent via SmsSender "+body.Title);
    }
}
