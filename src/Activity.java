public class Activity {
       private String name;
       private String description;
       private String location;
       private int duration; // in minutes
       private String type;

       public Activity(String name, String description, String location, int duration, String type) {
           this.name = name;
           this.description = description;
           this.location = location;
           this.duration = duration;
           this.type = type;
       }

       // Getters and Setters
       public String getName() { return name; }
       public void setName(String name) { this.name = name; }

       public String getDescription() { return description; }
       public void setDescription(String description) { this.description = description; }

       public String getLocation() { return location; }
       public void setLocation(String location) { this.location = location; }

       public int getDuration() { return duration; }
       public void setDuration(int duration) { this.duration = duration; }

       public String getType() { return type; }
       public void setType(String type) { this.type = type; }

       // Method to get activity details
       public String getDetails() {
           return String.format("Activity: %s, Description: %s, Location: %s, Duration: %d minutes", name, description, location, duration);
       }
   }