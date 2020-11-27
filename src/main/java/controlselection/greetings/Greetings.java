package controlselection.greetings;


import packages.greetings.Greeter;

import java.time.LocalTime;
import java.util.Scanner;

public class Greetings {

    public String dailyGreetings(int hourTime, int minuteTime){

        LocalTime earlymorningTime = LocalTime.of(5,0);
        LocalTime morningTime = LocalTime.of(9,0);
        LocalTime afternoonTime = LocalTime.of(18,30);
        LocalTime eveningTime = LocalTime.of(20, 0);
        LocalTime time = LocalTime.of(hourTime, minuteTime);
        String kindOfGreeting;

        if ((time.isAfter(earlymorningTime) && (time.isBefore(morningTime)))){
            kindOfGreeting = "Jó reggelt";
            System.out.println(kindOfGreeting);
            return kindOfGreeting;}
        else if ((time.isAfter(morningTime) && (time.isBefore(afternoonTime)))) {
            kindOfGreeting = "Jó napot";
            System.out.println(kindOfGreeting);
            return kindOfGreeting;}
        else if ((time.isAfter(afternoonTime) && (time.isBefore(eveningTime)))) {
            kindOfGreeting = "Jó estét";
            System.out.println(kindOfGreeting);
            return kindOfGreeting;}
        else {
            kindOfGreeting = "Jó éjszakát";
            System.out.println(kindOfGreeting);
            return kindOfGreeting;}
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give hours:");
        int hour = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please give minutes:");
        int minute = scanner.nextInt();
        scanner.nextLine();

        Greetings greetings = new Greetings();

        greetings.dailyGreetings(hour, minute);

        }
    }


