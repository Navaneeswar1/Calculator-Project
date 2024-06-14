package dnr.assignment1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringCalculatorTest {

	
	@Test
	public void emptyStringShouldReturnZero() {
		assertThat(StringCalculator.calculateSum("")).isEqualTo("0");
	}
	
	@Test
	public void singleNumberShouldReturnItselfAsSum(){
		assertThat(StringCalculator.calculateSum("5")).isEqualTo("5");

	}
	
	
	@Test
	public void sumOfNumbersSeparatedByCommaShouldBeReturned() {
		assertThat(StringCalculator.calculateSum("1,2,3")).isEqualTo("6");

	}
	
	@Test
	public void numbersInAnyNumberOfInputStringsShouldBeAdded() {
		assertThat(StringCalculator.calculateSum("1","1,2,3","")).isEqualTo("7");

	}
	
	@Test
	public void numbersSeparatedByNewLineCharacterShouldBeAdded() {
		assertThat(StringCalculator.calculateSum("10\n20,30")).isEqualTo("60");

	}
	
}
