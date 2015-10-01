package com.esprit.first.business;

import javax.ejb.Stateful;
import javax.ejb.Stateless;

@Stateful
public class CalculatorService implements CaluclatorServiceRemote, CaluclatorServiceLocal{

	public CalculatorService() {

	}

	public int sum(int x, int y) {	
		return (x+y);
	}
}
