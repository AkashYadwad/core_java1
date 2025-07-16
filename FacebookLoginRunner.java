
class FacebookLoginRunner{

	public static void main(String fb[]){

	String userName = "bahupopzz";
	String password = "bahu123";
	long number = 9645566258L ;
	
	String msg = FacebookLogin.logIn(userName,password);
	System.out.println(msg);
	
	msg = FacebookLogin.logIn(number,password);
	System.out.println(msg);

	}

}
