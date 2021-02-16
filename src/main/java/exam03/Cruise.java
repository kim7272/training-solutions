 package exam03;

 import java.time.LocalDate;
 import java.util.*;

 public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers  = new ArrayList<>();

     public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
         this.boat = boat;
         this.sailing = sailing;
         this.basicPrice = basicPrice;
     }

     public Boat getBoat() {
         return boat;
     }

     public LocalDate getSailing() {
         return sailing;
     }

     public double getBasicPrice() {
         return basicPrice;
     }

     public List<Passenger> getPassengers() {
         return passengers;
     }

     public void bookPassenger(Passenger passenger){
         if (this.boat.getMaxPassengers() == passengers.size()){
             throw new IllegalArgumentException("No more space in the ship!");
         }
         passengers.add(passenger);
     }

     public double getPriceForPassenger(Passenger passenger) {

         double price = 0.0;
         if (passenger.getCruiseClass().equals(CruiseClass.LUXURY)) {
             return price = this.basicPrice * 3.0;
         } else if (passenger.getCruiseClass().equals(CruiseClass.FIRST)) {
             return price = this.basicPrice * 1.8;
         } else {
            return price = this.basicPrice;
         }
     }

     public Passenger findPassengerByName(String name){

         int result = 0;
         for (int i = 0; i < passengers.size(); i++){
             if (passengers.get(i).getName().equals(name)){
                result = i;
             }
         }
         return passengers.get(result);
     }


     public List<String> getPassengerNamesOrdered(){

         List<String> nameList = new ArrayList<>();
         for (Passenger passenger : passengers) {
             nameList.add(passenger.getName());
         }
         Collections.sort(nameList);

         return nameList;
     }

     public double sumAllBookingsCharged(){

         double totalAmount = 0.0;
         for (Passenger passenger : passengers){
             totalAmount = totalAmount + getPriceForPassenger(passenger);
         }
         return totalAmount;
     }

     public Map<CruiseClass, Integer> countPassengerByClass(){

         Map<CruiseClass, Integer> passengerByClass = new HashMap<>();
         Integer i = 0;

         for (Passenger passenger : passengers){
             if (passengerByClass.containsKey(passenger.getCruiseClass())){
                 passengerByClass.put(passenger.getCruiseClass(), passengerByClass.get(passenger.getCruiseClass())+1);
             }
             else {
                 passengerByClass.put(passenger.getCruiseClass(), 1);

             }
         }
         return passengerByClass;
     }
 }


