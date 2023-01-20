public class EmailSender extends MessageSenderBase {
    @Override
    public void Send(Body body) {
        System.out.println("{0} was sent via EmailSender "+body.Title);
    }
}
