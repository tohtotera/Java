package list08_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Bank bankA = new Bank();
		Bank bankB = new Bank();

		bankA.setName("足利銀行");
		bankA.setAdress("古河市");
		bankB.setName("栃木銀行");
		bankB.setAdress("古河市");

		if (equal(bankA, bankB)){
			System.out.println("同じ銀行です。");
		}else{
			System.out.println("異なった銀行です。");
		}
	}

	public static boolean equal(Bank a, Bank b){
		return (a.equals(b));
	}
}
