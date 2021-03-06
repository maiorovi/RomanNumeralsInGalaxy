package application.core.domain.enumeration;

import java.util.Arrays;

public enum RomanNumeral {
	I("I", 1),
	V("V", 5),
	X("X", 10),
	L("L", 50),
	C("C", 100),
	D("D", 500),
	M("M", 1000);


	private String romanNumeral;
	private Integer decimalDigit;

	RomanNumeral(String romanNumeral, Integer decimalDigit) {
		this.romanNumeral = romanNumeral;
		this.decimalDigit = decimalDigit;
	}

	public String getRomanNumeral() {
		return romanNumeral;
	}

	public Integer getDecimalDigit() {
		return decimalDigit;
	}

	public static double convertToDecimal(String romanNumber) {
		return Arrays.stream(values()).filter(numeral -> numeral.getRomanNumeral().equals(romanNumber)).findFirst()
				.map(p -> p.getDecimalDigit()).get();
	}

	public static double convertToDecimal(Character ch) {
		return convertToDecimal(ch.toString());
	}

	public static boolean isGreater(RomanNumeral fst, RomanNumeral snd) {
		return fst.getDecimalDigit() > snd.getDecimalDigit();
	}

	public double minus(RomanNumeral roman1) {
		return this.getDecimalDigit() - roman1.getDecimalDigit();
	}

	public static String convertToNumeral(String numberal) {
		return "";
	}

}
