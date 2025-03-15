import java.util.Date;
   import java.util.List;
public class UserSubscription {
       private String type;
       private int validityPeriod; // in months
       private float price;
       private Date startDate;
       private Date endDate;
       private boolean isActive;
       private List<String> features;

       public UserSubscription(String type, int validityPeriod, float price, Date startDate, Date endDate, boolean isActive, List<String> features) {
           this.type = type;
           this.validityPeriod = validityPeriod;
           this.price = price;
           this.startDate = startDate;
           this.endDate = endDate;
           this.isActive = isActive;
           this.features = features;
       }

       // Getters and Setters
       public String getType() { return type; }
       public void setType(String type) { this.type = type; }

       public int getValidityPeriod() { return validityPeriod; }
       public void setValidityPeriod(int validityPeriod) { this.validityPeriod = validityPeriod; }

       public float getPrice() { return price; }
       public void setPrice(float price) { this.price = price; }

       public Date getStartDate() { return startDate; }
       public void setStartDate(Date startDate) { this.startDate = startDate; }

       public Date getEndDate() { return endDate; }
       public void setEndDate(Date endDate) { this.endDate = endDate; }

       public boolean isActive() { return isActive; }
       public void setActive(boolean active) { isActive = active; }

       public List<String> getFeatures() { return features; }
       public void setFeatures(List<String> features) { this.features = features; }

       // Methods for subscription management
       public void activate() {
           isActive = true;
       }

       public void cancel() {
           isActive = false;
       }
   }