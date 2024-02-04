package Exe_2_Score_To_Char.vers_2.Exe_2_Score_To_Char.vers_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void exe_2_Partition_D_min_minus1() {

		String result = App.NumberToChar(59);
		String expected_result = "E";
		org.junit.Assert.assertEquals(expected_result, result);
	}

	@Test
	public void exe_2_Partition_D_min() {

		String result = App.NumberToChar(60);
		String expected_result = "D";
		org.junit.Assert.assertEquals(expected_result, result);
	}

	@Test
	public void exe_2_Partition_D_min_plus1() {

		String result = App.NumberToChar(61);
		String expected_result = "D";
		org.junit.Assert.assertEquals(expected_result, result);
	}

	@Test
	public void exe_2_Partition_D_nominal() {

		String result = App.NumberToChar(65);
		String expected_result = "D";
		org.junit.Assert.assertEquals(expected_result, result);
	}

	@Test
	public void exe_2_Partition_D_max_minus1() {

		String result = App.NumberToChar(68);
		String expected_result = "D";
		org.junit.Assert.assertEquals(expected_result, result);
	}

	@Test
	public void exe_2_Partition_D_max() {

		String result = App.NumberToChar(69);
		String expected_result = "D";
		org.junit.Assert.assertEquals(expected_result, result);
	}

	@Test
	public void exe_2_Partition_D_max_plus1() {

		String result = App.NumberToChar(70);
		String expected_result = "C";
		org.junit.Assert.assertEquals(expected_result, result);
	}
	
	@Test
	public void exe_2_Error1() {

		String result = App.NumberToChar(101);
		String expected_result = "error";
		org.junit.Assert.assertEquals(expected_result, result);
	}
	
	@Test
	public void exe_2_Error2() {

		String result = App.NumberToChar(-1);
		String expected_result = "error";
		org.junit.Assert.assertEquals(expected_result, result);
	}

}
