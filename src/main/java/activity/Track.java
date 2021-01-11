 package activity;

import week06d02.Category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint){
        trackPoints.add(trackPoint);
    }

     public Coordinate findMaximumCoordinate(){
        Coordinate coordinate;
        List<Double> latitudes = new ArrayList<>();
        List<Double> longitudes = new ArrayList<>();
        for (TrackPoint trackPoint : trackPoints){
           latitudes.add(trackPoint.getCoordinate().getLatitude());
           longitudes.add(trackPoint.getCoordinate().getLongitude());
        }
         Collections.sort(latitudes);
         Collections.sort(longitudes);
         coordinate = new Coordinate(latitudes.get(latitudes.size()-1),longitudes.get(longitudes.size()-1));
         return  coordinate;
    }

    public Coordinate findMinimumCoordinate(){
        Coordinate coordinate;
        List<Double> latitudes = new ArrayList<>();
        List<Double> longitudes = new ArrayList<>();
        for (TrackPoint trackPoint : trackPoints){
            latitudes.add(trackPoint.getCoordinate().getLatitude());
            longitudes.add(trackPoint.getCoordinate().getLongitude());
        }
        Collections.sort(latitudes);
        Collections.sort(longitudes);
        coordinate = new Coordinate(latitudes.get(0),longitudes.get(0));
        return  coordinate;
    }


    public double getDistance(){
        double result = 0.0;
        for (int i = 0; i < trackPoints.size()-1; i++){
            double oneDistanz = trackPoints.get(i).getDistanceFrom(trackPoints.get(i+1));
            result = result + oneDistanz;
        }
        return result;
    }

    public double getFullDecrease(){
        double result = 0.0;
        for (int i = 0; i < trackPoints.size()-1; i++){
            if (trackPoints.get(i+1).getElevation()  < trackPoints.get(i).getElevation()){
                result = result +  trackPoints.get(i).getElevation() - trackPoints.get(i+1).getElevation();
            }
        }
        return result;

    }

    public double getFullElevation(){
        double result = 0.0;
        for (int i = 0; i < trackPoints.size()-1; i++){
            if (trackPoints.get(i+1).getElevation() > trackPoints.get(i).getElevation()){
                result = result +  trackPoints.get(i+1).getElevation() - trackPoints.get(i).getElevation();
            }
        }
        return result;
    }

   public double getRectangleArea(){
        double a = this.findMaximumCoordinate().getLatitude() - this.findMinimumCoordinate().getLatitude();
        double b = this.findMaximumCoordinate().getLongitude() - this.findMinimumCoordinate().getLongitude();
        return a*b;
    }



    public List<TrackPoint> getTrackPoints(){
        return trackPoints;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7,2,6,9,1,3);
        Collections.sort(numbers);

        System.out.println(numbers);
    }
}



