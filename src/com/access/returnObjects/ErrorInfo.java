package com.access.returnObjects;

public class ErrorInfo {

	
	String msgs[] = {
			"output Error",
			"input Error",
			"Disk Full",
			"Index out-of-bounds"
	};
	
	int howbad[] = { 3, 3, 2, 4 };
	
//	 getErrorInfo must be of the same type of the object it will return (Err)
	Err getErrorInfo(int i) {
		if(i >= 0 & i < msgs.length) {
//			when an object is returned by a method , it remains in existence until there are no more references to it,
//			At that point, it is subject to garbage collection. as an object won't be destroyed just because
//			the method that creates it terminates
			return new Err(msgs[i], howbad[i]);
		}else {
			return new Err("Invalid error code", 0);
		}
	}
	
}
