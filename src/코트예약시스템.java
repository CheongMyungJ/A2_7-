public class ��Ʈ����ý��� {
	static ��Ʈ����ý��� instance = null;
	private ��Ʈ����ý���() {}
	public static ��Ʈ����ý��� getInstance() {
		if (instance != null)
			return instance;
		instance = new ��Ʈ����ý���();
		return instance;
	}
	
	
    public void ���Ǽ���ȭ������(){
    }

    public List<CourtInfo> ������Ȳȭ������(){
        return null;
    }

    public Bool �����ϱ�(CourtInfo ��Ʈ){
        return null;
    }

    public CourtInfo ��������Ȯ��(������ ������){
        return null;
    }

}
