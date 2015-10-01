package com.esprit.first.business;

import javax.ejb.Remote;

@Remote
public interface CaluclatorServiceRemote {

	
	int sum(int x,int y);
	
}
