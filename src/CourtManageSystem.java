import java.util.ArrayList;
import java.util.List;

public class CourtManageSystem {
    private List<CourtInfo> courtList = new ArrayList<CourtInfo>();
    static CourtManageSystem instance = null;
	private CourtManageSystem() {}
	public static CourtManageSystem getInstance() {
		if (instance != null)
			return instance;
		instance = new CourtManageSystem();
		return instance;
	}

	public void addCourtList(CourtInfo info) {
		courtList.add(info);
	}
    public List<CourtInfo> getCourtList(){
        return courtList;
    }
    
    public boolean booking(CourtInfo info) {
    	if (info.getBooking() == false) {
    		info.setBooking(true);
    		return true;
    	}
    	
    	return false;
    }

    public CourtInfo getCourtInfo(User p){
    	for (CourtInfo rInfo : courtList) {
    		if (rInfo.getUser() == p) {
    			if (rInfo.getBooking() == true) {
    				return rInfo;
    			}
    			else {
    				System.out.println("�����ڿ� ������Ȳ ����ġ Error");
    				return null;
    			}
    		}
    	}
    	System.out.println("����� ��Ʈ�� ���ϴ�. Error");
        return null;
    }
}
