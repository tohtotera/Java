package list14_03;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
    // 実際にAccountをnewして使ってみるテスト
    @Test public void intstantiate() {
        Account a = new Account("ミナト", 30000);
        assertEquals("ミナト", a.owner);
        assertEquals(30000, a.balance);
    }
    @Test public void transfer() {
        /* : */
    }
}