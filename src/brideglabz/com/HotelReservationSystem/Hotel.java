package brideglabz.com.HotelReservationSystem;

public class Hotel {
    private String HotelName;
    private double weekdayRegularCustomerPrice;
    private double weekendRegularCustomerPrice;
    private double weekdayRewardsCustomersPrice;
    private double weekendRewardsCustomerPrice;
    public Hotel(){

    }

    public Hotel(String hotelName, double weekdayRegularCustomerPrice, double weekendRegularCustomerPrice, double weekdayRewardsCustomersPrice, double weekendRewardsCustomerPrice) {
        HotelName = hotelName;
        this.weekdayRegularCustomerPrice = weekdayRegularCustomerPrice;
        this.weekendRegularCustomerPrice = weekendRegularCustomerPrice;
        this.weekdayRewardsCustomersPrice = weekdayRewardsCustomersPrice;
        this.weekendRewardsCustomerPrice = weekendRewardsCustomerPrice;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "HotelName='" + HotelName + '\'' +
                ", weekdayRegularCustomerPrice=" + weekdayRegularCustomerPrice +
                ", weekendRegularCustomerPrice=" + weekendRegularCustomerPrice +
                ", weekdayRewardsCustomersPrice=" + weekdayRewardsCustomersPrice +
                ", weekendRewardsCustomerPrice=" + weekendRewardsCustomerPrice +
                '}';
    }
}
