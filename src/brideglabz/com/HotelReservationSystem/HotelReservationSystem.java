package brideglabz.com.HotelReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    public static void main(String[] args) {
        System.out.println("----------Welcome to the Hotel reservation System program---------");
        List<Hotel> hotelDataList = new ArrayList<>();
        Hotel hotel1 = new Hotel("LakeWood",110,90,80,80);
        Hotel hotel2 = new Hotel("Bridgewood",160,110,60,50);
        Hotel hotel3 = new Hotel("Ridgewood",220, 100,150, 40);
        hotelDataList.add(hotel1);
        hotelDataList.add(hotel2);
        hotelDataList.add(hotel3);
        System.out.println(hotelDataList);

    }
}
/*Ability to add Hotel in a Hotel
Reservation System with Name and
rates for Regular Customer...
- Program is written using IDE like IntelliJ/Eclipse/VS Code
- Every UC is in a separate Git Branch and then merged with main
- Every UC should have a corresponding Test Case. Here Employees should
be added to payroll system using a Test Case
- Naming Convention, Indentation, etc Code Hygiene will be checked during
Review
- Git Check In Comments and Version History will be monitored*/