import java.util.List;

public class ��Ī�ý��� {
	static ��Ī�ý��� instance = null;
	private ��Ī�ý���() {}
	public static ��Ī�ý��� getInstance() {
		if (instance != null)
			return instance;
		instance = new ��Ī�ý���();
		return instance;
	}
	
	
    private List<CollectInfo> ���������;

    public Boolean �����ϱ�(CollectInfo ��������){
    	if (����������ȿ��üũ(��������)) {
    		���������.add(��������);
    		return true;
    	}
    	return false;
    }

    public Boolean �����ϱ�(������ ������){
        return null;
    }

    public List<CollectInfo> ������ȭ������(){
    	return ���������;
    }

    public Boolean ����������ȿ��üũ(CollectInfo ��������) {
    	��Ʈ����ý���.getInstance().��������Ȯ��(��������.�����ڰ�������());
        return null;
    }

    public void ��������ϱ�(){
    }

    public void ��Ī����˶�(){
    }

    public void ����ۻ���(){
    }

}
