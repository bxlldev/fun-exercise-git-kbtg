public class Main {
    public static void main(String[] args) {
        // Feature toggle configuration
        FeatureToggle featureToggle = new FeatureToggle();
        featureToggle.setEmailNotificationEnabled(true);

        // Initialize the NotificationService with feature toggle
        NotificationService notificationService = new NotificationService(featureToggle);

        Contact contact = new Contact("thanachart.devs@gmail.com", "0643959165");

        // Send a notification
        notificationService.sendNotification("Hello, Java!", contact);
    }
}