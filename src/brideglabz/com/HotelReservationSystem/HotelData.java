package brideglabz.com.HotelReservationSystem;

public class HotelData {
    String hotelName;
    int weekdayRates;
    int weekendRates;
    int totalPrice;
    int hotelRating;

    public HotelData(String hotelName, int weekdayRates, int weekendRates, int totalPrice, int hotelRating) {
        this.hotelName = hotelName;
        this.weekdayRates = weekdayRates;
        this.weekendRates = weekendRates;
        this.totalPrice = totalPrice;
        this.hotelRating = hotelRating;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekdayRates() {
        return weekdayRates;
    }

    public void setWeekdayRates(int weekdayRates) {
        this.weekdayRates = weekdayRates;
    }

    public int getWeekendRates() {
        return weekendRates;
    }

    public void setWeekendRates(int weekendRates) {
        this.weekendRates = weekendRates;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(int hotelRating) {
        this.hotelRating = hotelRating;
    }
}
