import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/design-underground-system/
public class Design_Underground_System {
  
//  Approch
//  1 . make a passenger class and its constructor with a constructor for checkout
//  2 .Make a Route class which will take care of travek count and total traverl time



   // map for passenger and id
   Map<Integer , Passenger> passengerMap = null;

   //Route map
   Map<String , Route> routeMap = null;





class Passenger{
   int startTime;
   int endTime;
   String startStation;
   String endStation;


   public Passenger(String startStation , int startTime){
       this.startStation = startStation;
       this.startTime = startTime;
   }

   void checkout(String endStation , int endTime){
       this.endStation = endStation;
       this.endTime = endTime;
   }
}


class Route{
    int travelCount;
    int totalTravelTime;

    // constructor
    public Route(){

    }

    // avg time
    double getavgTime(){
        return (double) totalTravelTime/travelCount;
    }

    void addTrip(int travelDuration){
     totalTravelTime += travelDuration;
     travelCount +=1;
    }
}


    public UndergroundSystem() {
      routeMap = new HashMap<>();
      passengerMap = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        if(!passengerMap.containsKey(id)){
          Passenger newTraveller = new Passenger(stationName, t);
          passengerMap.put(id, newTraveller);
        }
    }
    
    public void checkOut(int id, String stationName, int t) {
        if(passengerMap.containsKey(id)){
            Passenger oldTraveller = passengerMap.get(id);
            oldTraveller.checkout(stationName, t);
            String routeKey = oldTraveller.startStation + "_" + oldTraveller.endStation;
       
            Route routeDetails = routeMap.getOrDefault(routeKey, new Route());
            int duration = oldTraveller.endTime - oldTraveller.startTime;
            routeDetails.addTrip(duration);
            routeMap.put(routeKey, routeDetails);
            passengerMap.remove(id);
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String routekey = startStation + "_" + endStation;
        Route routeDetails = routeMap.get(routekey);
        return routeDetails.getavgTime();
    }
}
