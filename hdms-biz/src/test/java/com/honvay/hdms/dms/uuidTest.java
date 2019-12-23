package com.honvay.hdms.dms;

import java.util.UUID;

public class uuidTest {
	
	public static void main(String[] args) {
		String uuid = createUUID();
		System.out.println("uuid============" + uuid);
	}
	
	public static String createUUID() {
		int hashCodeV = UUID.randomUUID().toString().hashCode();
	    if(hashCodeV < 0) {//有可能是负数  

	        hashCodeV = - hashCodeV;  

	    }  
	    
	    return String.format("%015d", hashCodeV);
	}

}
