import java.util.ArrayList;
   import java.util.List;

   public class TripPlanner {
       private String destination;
       private List<String> preferences;
       private List<Activity> itinerary;

       public TripPlanner(String destination) {
           this.destination = destination;
           this.preferences = new ArrayList<>();
           this.itinerary = new ArrayList<>();
       }

       // Getters and Setters
       public String getDestination() { return destination; }
       public void setDestination(String destination) { this.destination = destination; }

       public List<String> getPreferences() { return preferences; }
       public void setPreferences(List<String> preferences) { this.preferences = preferences; }

       public List<Activity> getItinerary() { return itinerary; }
       public void setItinerary(List<Activity> itinerary) { this.itinerary = itinerary; }

       // Methods to manage the itinerary
       public void createItinerary() {
           // Logic to create itinerary
       }

       public void addDestination(String destination) {
           // Logic to add destination
       }

       public void removeDestination(String destination) {
           // Logic to remove destination
       }
   }