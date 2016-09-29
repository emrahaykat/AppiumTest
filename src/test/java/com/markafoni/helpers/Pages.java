package com.markafoni.helpers;

public enum Pages {
	
	Menu(Helper.CreateTuple(Paths.Menu, "", "")),
	LoginButton(Helper.CreateTuple(Paths.LoginLink, "", ""));
	
	
	
	private final GenericTuple<Paths, String,String> PagePathInfo;
	
	 Pages(GenericTuple<Paths,String,String> path){ 

		 this.PagePathInfo = path; 
	 }
	 
	 public GenericTuple<Paths, String,String> getPathInfo() { return PagePathInfo; }
}
