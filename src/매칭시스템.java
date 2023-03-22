import java.util.List;

public class MatchingSystem {
	static MatchingSystem instance = null;
	private MatchingSystem() {}
	public static MatchingSystem getInstance() {
		if (instance != null)
			return instance;
		instance = new MatchingSystem();
		return instance;
	}
	
	
    private List<CollectInfo> Post;

    public Boolean Posting(CollectInfo LimitInfo){
    	if (CheckPostValidation(LimitInfo)) {
    		Post.add(LimitInfo);
    		return true;
    	}
    	return false;
    }

    public Boolean Join(Participant p){
        return null;
    }

    public List<CollectInfo> ShowPost(){
    	return Post;
    }

    public Boolean CheckPostValidation(CollectInfo LimitInfo) {
    	CourtBookingSystem.getInstance().CheckBooking(LimitInfo.getSubscriber());
        return null;
    }

    public void CancelMatch(){
    }

    public void AlramMatch(){
    }

    public void DeletePost(){
    }

}
