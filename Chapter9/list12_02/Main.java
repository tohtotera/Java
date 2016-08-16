package list12_02;

/* java.sqlをインポートしておく */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {
        // STEP 0: 事前準備（JAR配置を含む）
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();            /* ドライバが見つからない場合の処理（＊）*/
        }
        /* : */
        Connection con = null;
        try {
            // STEP 1: データベースの接続
            con = DriverManager.getConnection("jdbc:derby:C:\\eclipse\\pleiades\\workspace\\Derby;create=true");  /* JDBC URLを指定 */
            
            // ********** リスト12-2 ここから **********
            // STEP 2-(1)-1 送信すべきSQLのひな形を準備
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?");
            // STEP 2-(1)-2 ひな形に値を流し込みSQLを組み立て送信する
            pstmt.setInt(1, 10);            // １番目の？に10を流し込み
            pstmt.setString(2, "ゾンビ");       // ２番目の？にゾンビを流し込み
            int r = pstmt.executeUpdate();  //SQL文を送信・処理結果は変更された行数が返される
            // STEP 2-(1)-3 処理結果を判定する
            if(r != 0) {
                System.out.println(r + "件のモンスターを削除しました");
            } else {
                System.out.println("該当するモンスターはいませんでした");
            }
            pstmt.close();                  // 後片付け
            // ********** リスト12-2 ここまで **********
            
        } catch(SQLException e) {
            e.printStackTrace();            /* 接続やSQL処理の失敗時の処理（＊）*/
        } finally {
            // STEP 3: データベース接続の切断
            if(con != null) {
                try {
                    con.close();
                } catch(SQLException e) {
                    e.printStackTrace();    /* 切断失敗時の処理（＊）*/
                }
            }   /* ＊の箇所は必要に応じて適切なエラー処理を記述します */
        }
    }
}