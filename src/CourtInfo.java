import java.util.Date;

public class CourtInfo {
    private String area;
    private String name;
    private Date time;
    private Boolean booking;
 
    String getArea() {return area;}
    void setArea(String area) {this.area = area;}
    String getName() {return name;}
    void setName(String name) {this.name = name;}
    Date getTime() {return time;}
    void setTime(Date time) {this.time = time;}
    Boolean getBooking() {return booking;}
    void setBooking(Boolean booking) {this.booking = booking;}
}
