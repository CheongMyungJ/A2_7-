import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourtBookingSystem {
	static CourtBookingSystem instance = null;
	private CourtBookingSystem() {}
	public static CourtBookingSystem getInstance() {
		if (instance != null)
			return instance;
		instance = new CourtBookingSystem();
		return instance;
	}
	
	
    public void ShowSelectInfo(){
    	System.out.println("���� ���� ȭ���� �����ش�. (������ �ؽ�Ʈ �Է�â�� ���ùڽ���, �ð��� Ķ������)");
    }

    public List<CourtInfo> ShowBookingInfo(String selectedArea, Date selectedTime){
    	List<CourtInfo> originCourtInfo = CourtManageSystem.getInstance().getCourtList();
    	List<CourtInfo> filteredCourtInfo = new ArrayList<CourtInfo>();
    	for (CourtInfo info : originCourtInfo) {
    		if (info.getArea() == selectedArea && info.getTime() == selectedTime){
    			filteredCourtInfo.add(info);
    		}
    	}
        return filteredCourtInfo;
    }

    public Boolean Booking(CourtInfo c){
        return CourtManageSystem.getInstance().booking(c);
    }
}
public class CourtBookingSystem {
	static CourtBookingSystem instance = null;
	private CourtBookingSystem() {}
	public static CourtBookingSystem getInstance() {
		if (instance != null)
			return instance;
		instance = new CourtBookingSystem();
		return instance;
	}
	
	
    public void ShowSelectInfo(){
    }

    public List<CourtInfo> ShowBookingInfo(){
        return null;
    }

    public Bool Booking(CourtInfo c){
        return null;
    }

    public CourtInfo CheckBooking(Participant p){
        return null;
    }

}
