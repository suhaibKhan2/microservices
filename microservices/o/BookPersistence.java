package com.wipro.microservices.o;
//this interface will increase modularity 
public interface BookPersistence {
//This method will save the information to the database
		public void save(Invoice invoice);
	}

