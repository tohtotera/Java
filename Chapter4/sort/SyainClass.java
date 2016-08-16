package sort;

public class SyainClass {
	private int syainNo;      //社員番号
	private String syainName;  //社員名

	//コンストラクタ
	public SyainClass(int syainNo, String syainName) {
		this.syainNo = syainNo;
	    this.syainName = syainName;
	}

	//社員番号取得
	public int getSyainNo(){
	    return this.syainNo;
	}

	//社員名取得
	public String getSyainName(){
	    return this.syainName;
	}
}
