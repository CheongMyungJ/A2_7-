import java.util.List;

public class MatchingSystem {
	static MatchingSystem instance = null;
	private MatchingSystem() {
	}
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

    public void Join(CollectInfo info, Participant u){
    	info.Add(u);
    }
      

    public List<CollectInfo> ShowPost(){
    	for(int i = 0; i < Post.size(); i++)
    	{
    		CollectInfo temp = Post.get(i);
    		if(temp.CheckValid())
    		{
    			temp.show();
    		}
    	}
    	return Post;
    }

    public Boolean CheckPostValidation(CollectInfo LimitInfo) {
    	CourtBookingSystem.getInstance().CheckBooking(LimitInfo.getSubscriber());
        return null;
    }

    public void CancelMatch(User u){
    	CollectInfo temp = null;
    	for(int i = 0; i < Post.size(); i++)
    	{
    		temp = Post.get(i);
    		for(int j = 0; j < temp.getParticipant().size(); j++)
    		{
    		if(temp.getParticipant().get(0) == u)
    		{
    			Post.remove(i);
    		    break;	
    		}
    	}
    }

    public void AlramMatch(List<User> user){
    	for(int i = 0; i < user.size(); i++)
    	{
    		user.get(i).sendMessage();
    	}
    }

    public void DeletePost(User u){
    	CollectInfo temp = null;
    	for(int i = 0; i < Post.size(); i++)
    	{
    		temp = Post.get(i);
    		if(temp.getParticipant().get(0) == u)
    		{
    			Post.remove(i);
    		    break;	
    		}
    	}
    }
    
    public void DoneMatching(CollectInfo info) {
    	AlramMatch(info.getParticipant());    	
    }   

}
