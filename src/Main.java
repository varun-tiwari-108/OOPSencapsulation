//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        NotificationService notificationServiceEmail = new NotificationService(emailNotification);
        notificationServiceEmail.notify("Hello");

        SMSNotification smsNotification = new SMSNotification();
        NotificationService notificationServiceSMS = new NotificationService(smsNotification);
        notificationServiceSMS.notify("Hello");

    }
}