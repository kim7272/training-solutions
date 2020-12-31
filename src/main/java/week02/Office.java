package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public void printNames(){
        for (int i = 0; i < meetingRooms.size(); i++){
            System.out.println(meetingRooms.get(i).getName());
        }
   }
    public void printNamesReverse(){
        for (int i = meetingRooms.size()-1; i >= 0; i--){
            System.out.println(meetingRooms.get(i).getName());
        }
    }
    public void printEventNames(){
        for (int i = 0; i < meetingRooms.size(); i++){
            if (i % 2 == 1){
                System.out.println(meetingRooms.get(i).getName());
            }
        }
    }
    public void printAreas(){
        for (int i = 0; i < meetingRooms.size(); i++){
            System.out.print(" Name: " + meetingRooms.get(i).getName());
            System.out.print(" Width:" + meetingRooms.get(i).getWidth());
            System.out.print(" Length:" + meetingRooms.get(i).getLength());
            System.out.println(" Area:" + meetingRooms.get(i).getArea());
        }
    }
    public void printMeetingRoomsWithName(String name) {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (name.equals(meetingRooms.get(i).getName())) {
                System.out.print(" Name: " + meetingRooms.get(i).getName());
                System.out.print(" Width:" + meetingRooms.get(i).getWidth());
                System.out.print(" Length:" + meetingRooms.get(i).getLength());
                System.out.println(" Area:" + meetingRooms.get(i).getArea());
            }
            System.out.println("     ");
        }
    }
    public void printMeetingRoomsContains(String part) {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (meetingRooms.get(i).getName().toLowerCase().indexOf(part) != -1) {
                System.out.print(" Name: " + meetingRooms.get(i).getName());
                System.out.print(" Width:" + meetingRooms.get(i).getWidth());
                System.out.print(" Length:" + meetingRooms.get(i).getLength());
                System.out.println(" Area:" + meetingRooms.get(i).getArea());
            }
        }
    }
    public void printAreasLargerThan(int area){
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (meetingRooms.get(i).getArea() > area){
                System.out.print(" Name: " + meetingRooms.get(i).getName());
                System.out.print(" Width: " + meetingRooms.get(i).getWidth());
                System.out.print(" Length: " + meetingRooms.get(i).getLength());
                System.out.println(" Area: " + meetingRooms.get(i).getArea());
                }
            }
        }
    }

