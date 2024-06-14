package dnr.assignment1;

import java.util.Arrays;

public class StringCalculator {
	
	private static final String LINE_SEPARATOR="\n";
	private static final String OR="|";
	private static final String COMMA=",";
	private static final String EMPTY_STRING="";
	
	public static String calculateSum(String... inputs) {
		int sum=0;
		for(String input:inputs) {
			
			sum=sum+calculateSum(input);
		}	
		return String.valueOf(sum);
		}	

	private static int calculateSum(String input) 
	{
		
		if(input.equals(EMPTY_STRING)) {
		return 0;
	}
		return addAllNumbers(getSeparatedNumbers(input));
	}
	
private static String[] getSeparatedNumbers(String input) {
	
		return input.split(COMMA+OR+LINE_SEPARATOR);
	}

private static int addAllNumbers(String[] numbers) {
		
		return Arrays.stream(numbers)
				.map(str -> Integer.valueOf(str))
				.reduce(0, Integer::sum);
	}


}
