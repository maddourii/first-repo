package com.esprit.first.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.esprit.first.business.CaluclatorServiceRemote;


public class Application {

	public static void main(String[] args) throws NamingException {

		
	CaluclatorServiceRemote proxy = null;
		Context ctx = new InitialContext();
		
		proxy = (CaluclatorServiceRemote) ctx.lookup("/first-ejb/CalculatorService!com.esprit.first.business.CaluclatorServiceRemote");
	int z = proxy.sum(2, 5);
	
	System.out.println(z);
	
	
	}

}
