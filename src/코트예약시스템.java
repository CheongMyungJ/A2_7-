public class 코트예약시스템 {
	static 코트예약시스템 instance = null;
	private 코트예약시스템() {}
	public static 코트예약시스템 getInstance() {
		if (instance != null)
			return instance;
		instance = new 코트예약시스템();
		return instance;
	}
	
	
    public void 조건선택화면제공(){
    }

    public List<CourtInfo> 예약현황화면제공(){
        return null;
    }

    public Bool 예약하기(CourtInfo 코트){
        return null;
    }

    public CourtInfo 예약정보확인(모집자 예약자){
        return null;
    }

}
