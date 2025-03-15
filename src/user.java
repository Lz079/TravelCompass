import java.util.List;

   public class User {
       private String username;
       private String phoneNumber;
       private String emailAddress;
       private List<UserSubscription> subscriptions;

       public User(String username, String phoneNumber, String emailAddress) {
           this.username = username;
           this.phoneNumber = phoneNumber;
           this.emailAddress = emailAddress;
       }

       // Getters and Setters
       public String getUsername() { return username; }
       public void setUsername(String username) { this.username = username; }

       public String getPhoneNumber() { return phoneNumber; }
       public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

       public String getEmailAddress() { return emailAddress; }
       public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

       public List<UserSubscription> getSubscriptions() { return subscriptions; }
       public void setSubscriptions(List<UserSubscription> subscriptions) { this.subscriptions = subscriptions; }

       // Method to manage subscriptions
       public void addSubscription(UserSubscription subscription) {
           subscriptions.add(subscription);
       }
   }