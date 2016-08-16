package list08_05;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
    public static void main(String[] args) {
        Log logger = LogFactory.getLog(Main.class);     /* ロガーの取得 */
        if(args.length != 2) {
            logger.error("起動引数の数が異常：" + args.length);
        }
    }
}