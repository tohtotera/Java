package list05_03;

public class Main {
    public static void main(String[] args) {
        Pocket p = new Pocket();
        p.put("1192");                  /* 文字列を格納 */
        Object s = p.get();    /* 取り出すときにキャストが必要 */
        System.out.println(s);
    }
}