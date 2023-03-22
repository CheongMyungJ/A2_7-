public class Participant extends User {	
    public void Join(CollectInfo info)
    {
    	MatchingSystem.getInstance().Join(info, this);
    }
}
