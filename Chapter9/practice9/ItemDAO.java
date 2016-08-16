package practice9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemDAO{
	public static ArrayList<Item> findByMinimumPrice(int i){
		try{
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");//JDBCドライバーをロードする
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		Connection con = null;
		try{
			//コネクションを取得する
			con = DriverManager.getConnection("jdbc:derby:C:\\eclipse\\pleiades\\workspace\\Derby;create=true");
			//SQL文を指定する
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ITEMS WHERE PRICE > ?");
			//SQL文の1番目のパラメータにiの値を渡す
			pstmt.setInt(1, i);
			//SELECT文を実行する
			ResultSet rs = pstmt.executeQuery();
			//ここでItemを入れいくArrayListを準備
			ArrayList<Item> items = new ArrayList<Item>();
			//取得した結果をItemクラスのArrayListへ格納する
			while (rs.next()){
				Item item = new Item();
				item.setName(rs.getString("NAME"));
				item.setPrice(rs.getInt("PRICE"));
				item.setWeight(rs.getInt("WEIGHt"));
				items.add(item);
			}
			rs.close();
			pstmt.close();

			return items;

		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			if (con != null){
				try{
					con.close();
				}catch (SQLException e){
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
