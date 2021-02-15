 package exam03;

 import java.time.LocalDate;
 import java.util.List;
 import java.util.Map;

 public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers;

     public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
         this.boat = boat;
         this.sailing = sailing;
         this.basicPrice = basicPrice;
     }

     public void bookPassenger(Passenger passenger){
         if (this.boat.getMaxPassengers() == passengers.size(){
             throw new IllegalArgumentException("No more space in the ship!");
         }
         passengers.add(passenger);
     }

     public double getPriceForPassenger(Passenger passenger){

         double price = 0.0;
         passenger.getCruiseClass().values()[]
         price = passenger.getCruiseClass().values()

     }

     public Passenger findPassengerByName(String name){


     }

     public List<String> getPassengerNamesOrdered(){


     }

     public double sumAllBookingsCharged(){

     }

     public Map<CruiseClass, Integer> countPassengerByClass(){


     }
 }


