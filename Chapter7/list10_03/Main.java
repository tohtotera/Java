package list10_03;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String s = "ミナト,アサカ,スガワラ";    
        StringTokenizer st = new StringTokenizer(s,",");    /* カンマをデリミタ指定 */
        while(st.hasMoreTokens()) {                         /* 次のトークンがあるか検査 */
            String t = st.nextToken();                      /* 次のトークンを取得 */
            System.out.println(t);
        }
    }
}