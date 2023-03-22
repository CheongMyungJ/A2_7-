import java.util.List;

public class 매칭시스템 {
	static 매칭시스템 instance = null;
	private 매칭시스템() {}
	public static 매칭시스템 getInstance() {
		if (instance != null)
			return instance;
		instance = new 매칭시스템();
		return instance;
	}
	
	
    private List<CollectInfo> 공고글정보;

    public Boolean 공고하기(CollectInfo 제한정보){
    	if (공고정보유효성체크(제한정보)) {
    		공고글정보.add(제한정보);
    		return true;
    	}
    	return false;
    }

    public Boolean 참여하기(참여자 참가자){
        return null;
    }

    public List<CollectInfo> 공고목록화면제공(){
    	return 공고글정보;
    }

    public Boolean 공고정보유효성체크(CollectInfo 제한정보) {
    	코트예약시스템.getInstance().예약정보확인(제한정보.예약자가져오기());
        return null;
    }

    public void 참여취소하기(){
    }

    public void 매칭성사알람(){
    }

    public void 공고글삭제(){
    }

}
