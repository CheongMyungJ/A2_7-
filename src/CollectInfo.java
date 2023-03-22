import java.util.List;

public class CollectInfo {
	private String title;
    private CourtInfo CourtInfo;
    private int LimitAge;
    private int LimitExpriment;
    private int NumOfPerson;
    private int CurNumOfPerson;
    private Boolean valid;
    private Subscriber S;
    private List<User> P;
    List<User> getParticipant() {return P;} 

    public CollectInfo() {
    	this.NumOfPerson = 0;
    	this.CurNumOfPerson = 0;
    }
    
    public void show()
    {
    	System.out.printf("%s", title);
    	System.out.println();
    }
    
    public void SetValid(Boolean bool) {
    	this.valid = bool;
    }
    
    public Boolean CheckValid()
    {
    	return this.valid;
    }
    
    public void Add(Participant p)
    {
    	P.add(p);
    	this.CurNumOfPerson++;
    	
    	if(this.NumOfPerson == this.CurNumOfPerson)
    	{
    		MatchingSystem.getInstance().DoneMatching(this);
    	}
    }
}
