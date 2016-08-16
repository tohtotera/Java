package list12_05;

/* java.sqlをインポートしておく */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

            // STEP 2-(2)-1 送信すべきSQLの雛形を準備
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM MONSTERS WHERE HP >= ?");

            // STEP 2-(2)-2 ひな形に値を流し込みSQLを組み立て送信する
            pstmt.setInt(1, 10);            // １番目の？に10を流し込み
            ResultSet rs = pstmt.executeQuery();

            // STEP 2-(2)-3 結果表を処理する

            // ********** リスト12-5 ここから **********
            if(rs.next()) {                 // 行が見つかればtrueが返る
                System.out.println("ゴブリンのHPは" + rs.getInt("HP"));
            } else {
                System.out.println("ゴブリンはDBに存在しません");
            }
            // ********** リスト12-5 ここまで **********

            rs.close();
            pstmt.close();                  // 後片付け

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
            }   /* ＊の箇所は必要に応じて適切なエラー処理に修正します */
        }
    }
}