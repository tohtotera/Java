package list14_04;

public class Account {
    static int balance;
    public void transfer(Account dest, int amount) {
        // …送金処理の記述…(残高不足の場合は例外を送出)
        System.out.println("正常に送金完了しました。");
        assert this.balance >= 0;
    }
}