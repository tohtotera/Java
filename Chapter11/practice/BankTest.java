package practice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//正常系
	@Test public void setName(){
		Bank b = new Bank();
		b.setName("ミヤビ");
	}
	//異常系
	@Test public void setNameWithNull(){
		try{
			Bank b = new Bank();
			b.setName(null);
		}catch (IllegalArgumentException e){
			return;
		}
		fail();
	}
	//異常系
	@Test(expected = IllegalArgumentException.class)
	public void throwsExceptionWithTwoCharName(){
		Bank b = new Bank();
		b.setName("ミヤ");
	}
}
