package list05_05;

public class Pocket<String> {
    private String data;        /* すべてのEがStringに置き換わった */
    public void put(String d) { this.data = d; }
    public String get() { return this.data; }
}