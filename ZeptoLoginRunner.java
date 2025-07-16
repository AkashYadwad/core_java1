class ZeptoLoginRunner{

	public static void main(String zepto[]){

	String gmail = "Aku@gmail.com";
	String password = "bahu123";
	long number = 9645566258L ;
	
	String msg = ZeptoLogin.logIn(gmail,password);
	System.out.println(msg);
	
	msg = ZeptoLogin.logIn(number,password);
	System.out.println(msg);

	}

}