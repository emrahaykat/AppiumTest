package com.markafoni.mkfApi;

public interface IUser {
	
	public String getEmail();
	public boolean logout();
	public boolean forgotPassword();
	public boolean cancelMembership();
	public boolean cancelOrder(String OrderId);
	public boolean delSavedCC(String CCId);
	public boolean delSavedAddress(String AddressId);
	public boolean updateEmail(String email);
	public boolean updatePassword(String newPassword, String newPasswordAgain);	//public boolean createOrder(AOrder order,double cardPoints);

}
