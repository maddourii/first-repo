package com.esprit.first.business;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class AccumulatorService
 */
@Stateless
public class AccumulatorService implements AccumulatorServiceRemote {
 
	
	private int x;
   
    public  AccumulatorService() {
    	
    }
    	
    	
    	


		@Override
		public int accumulate(int dx) {
			x = x+dx;
	    	return (x);			
		}

}
