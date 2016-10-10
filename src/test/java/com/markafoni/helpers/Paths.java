package com.markafoni.helpers;

public enum Paths {

	// Paths for Menu..
	 Menu("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]"
	 		+ "/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]"
	 		+ "/android.widget.LinearLayout[1]/android.widget.ImageView[1]"),
	 
	LoginLink("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]"
			+ "/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.ListView[1]/"
			+ "android.widget.LinearLayout[1]"),
	
	MyBasket("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/"
			+ "android.support.v4.widget.DrawerLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]"
			+ "/android.widget.FrameLayout[1]/android.widget.TextView[1]"),
	
	Campaings("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/"
			+ "android.support.v4.widget.DrawerLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout[1]"),
	
	Categories("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]"
			+ "/android.support.v4.widget.DrawerLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget."
			+ "FrameLayout[1]/android.widget.TextView[1]"),
	
	MyProfile(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]"
			+ "/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[5]/"
			+ "android.widget.FrameLayout[1]/android.widget.TextView[1]"),
	
	MyOrders("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/"
			+ "android.widget.ListView[1]/android.widget.LinearLayout[6]/android.widget.FrameLayout[1]"),
	
	Contact(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/"
			+ "android.widget.ListView[1]/android.widget.LinearLayout[7]/android.widget.FrameLayout[1]"),
	
	EmailTextBox("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/"
			+ "android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/"
			+ "android.widget.RelativeLayout[1]/android.widget.TextView[1]"),
	
	PasswordTextBox("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/"
			+ "android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText[1]"),
	
	SignInBtn("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]"
			+ "/android.widget.Button[1]"),
	
	SignOutLink("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]"
			+ "/android.support.v4.widget.DrawerLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[9]"),
	
	
	//Paths For Register Form.
	
	OpenRegsterFormBtn("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ViewFlipper[1]"
			+ "/android.widget.LinearLayout[1]/android.widget.Button[2]"),
	NamePath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/"
			+ "android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"),
	SurnamePath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]"
			+ "/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.EditText[1]"),
	EmailPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/"
			+ "android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.EditText[1]"),
	PasswordPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/"
			+ "android.widget.LinearLayout[1]/android.widget.RelativeLayout[4]/android.widget.EditText[1]"),
	SignUpDropdownGenderPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/"
			+ "android.widget.LinearLayout[1]/android.widget.RelativeLayout[5]/android.widget.Spinner[1]"),
	GenderMenPath("//android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]"),
	GenderWomenPath("//android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]"),
	SinUpDropdownBirthDatePath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[6]/android.widget.EditText[1]"),
	DateBirthDayPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.DatePicker[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[1]/android.widget.EditText[1]"),
	DateBirthMountPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.DatePicker[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[2]/android.widget.EditText[1]"),
	DateBirthYearPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.DatePicker[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[3]/android.widget.EditText[1]"),
	DateSaveBtnPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]"),
	AgreementBtnPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageButton[1]"),
	AgreementCheckBoxPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.CheckBox[1]"),
	CallOptionPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.CheckBox[1]"),
	SmsOptionPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.CheckBox[2]"),
	EmailOptionPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.CheckBox[3]"),
	SignUpButton("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.Button[1]"),
	
	
	
	//Campaing xpaths
	CampaignXPath(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/"
			+ "android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/"
			+ "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/"
			+ "android.widget.ListView[1]/android.widget.LinearLayout");
	
	
	
	private final String path;
		
	 Paths(String path){ 
		 this.path = path; 
	 }
	 
	 public String getPath() { return path; }
		

}