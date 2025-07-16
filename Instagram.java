class Instagram {

public static boolean logIn(String gmail,String password){
	boolean isUserRegistered = false;
	if(gmail !=null && password !=null){
	isUserRegistered = true;
	System.out.println("LOGIN WITH GMAIL "+gmail+" "+password);
	} return isUserRegistered ;
}

public static boolean logIn(long phoneNumber,String password){
	boolean isUserRegistered = false;
	if(phoneNumber !=0 && password !=null){
	isUserRegistered = true;
	System.out.println("LOGIN WITH PHONE NUMBER "+phoneNumber+" "+password);
	} return isUserRegistered ;
}
}