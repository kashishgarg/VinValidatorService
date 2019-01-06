package com.demo.service;

public class VinValidatorService {
	
	public Boolean validate(String vin) {
		if(vin.length() != 17)
			return false;
		return getCheckDigit(vin) == vin.charAt(8);
		
	}
	
	private final int transIterate(char c) {
		return "0123456789.ABCDEFGH..JKLMN.P.R..STUWXYZ".indexOf(c) % 10;
	}
	
	private final char getCheckDigit(String vin) {
		int sum = 0;
		String map = "0123456789X";
		String weights = "8765432X098765432";
		for(int i = 0; i < 17; i++) {
			sum += transIterate(vin.charAt(i)) * map.indexOf(weights.charAt(i));
		}
		return map.charAt(sum % 11);
	}
	
	

}
