package com.markafoni.helpers;

import java.util.List;

public class Helper {
	public static boolean StringValidator(List<String> strArr){
		boolean allOK = false;
		if(strArr!=null && strArr.isEmpty()==false){
			allOK = true;
			for (String str : strArr) {
				if(str==null || str.trim().isEmpty()==true){
					allOK = false;
					break;
				}
			}
		}
		return allOK;
		
	}
	
	public  static <F,S,T> GenericTuple<F, S, T> CreateTuple(F first, S second, T third) {
		
		GenericTuple<F,S,T> tuple = new GenericTuple<F,S,T>(first,second,third);
		
		return tuple;

	}
}
