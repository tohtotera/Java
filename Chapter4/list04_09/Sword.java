package list04_09;

public class Sword implements Cloneable {
    private String name;

    public Sword(String name) {
        this.name = name;
    }

    public Sword clone(){
    	Sword s1 = new Sword();
    	s1.name = this.name;
    	return s1;
    }
    
    public Sword() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
