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
