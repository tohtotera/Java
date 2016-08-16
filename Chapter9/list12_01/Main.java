package list12_01;

/* java.sqlをインポートしておく */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {

        // ********** リスト12-1ここから（import文は上記） **********
        // STEP 0: 事前準備（JAR配置を含む）
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();                        /* ドライバJARが見つからない場合の処理（＊）*/
        }
        /* : */
        Connection con = null;
        try {
            // STEP 1: データベースの接続
            con = DriverManager.getConnection("jdbc:derby:C:\\eclipse\\pleiades\\workspace\\Derby;create=true");    /* JDBC URLを指定 */
            // STEP 2: 送信処理
             /* *******************************
                メインのDB操作処理（後述します）
              ****************************** */
        } catch(SQLException e) {
            e.printStackTrace();                        /* 接続やSQL処理の失敗時の処理（＊）*/
        } finally {
            // STEP 3: データベース接続の切断
            if(con != null) {
                try { con.close(); } catch(SQLException e) {
                    e.printStackTrace();                /* 切断失敗時の処理（＊）*/
                }
            }   /* ＊の箇所は必要に応じて適切なエラー処理を記述します */
        }
        // ********** リスト12-1ここまで **********

    }
}