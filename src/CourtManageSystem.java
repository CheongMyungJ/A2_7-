import java.util.List;

public class CourtManageSystem {
    private List<CourtInfo> CourtList;
    static CourtManageSystem instance = null;
	private CourtManageSystem() {}
	public static CourtManageSystem getInstance() {
		if (instance != null)
			return instance;
		instance = new CourtManageSystem();
		return instance;
	}

    public List<CourtInfo> getCourtList(){
        return null;
    }

    public CourtInfo getCourtList(Participant p){
        return null;
    }

}
