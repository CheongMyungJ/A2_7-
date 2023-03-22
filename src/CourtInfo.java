import java.util.Date;

public class CourtInfo {
    private String Area;
    private String name;
    private Date time;
    private Boolean Booking;
        
    public Boolean getBooking() {
    	return Booking;
    }
    
    public void setBooking(Boolean value) {
    	this.Booking = value;
    }

}
