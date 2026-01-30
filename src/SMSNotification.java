public class SMSNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println(message + " Sent by SMS");

        // Old: Twilio API
        // New: AWS SNS API
    }
}
