package list05_10;
// 口座クラスです（列挙型活用ver）
public class Account {
    private String accountNo;
    private int balance;
    private AccountType accountType;    /* 口座種別を列挙型で受け取り格納 */
    public Account(String aNo, AccountType aType) { /* … */ }
    /* : */
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
}
// 【利用例】new Account("1732050", AccountType.FUTSU);