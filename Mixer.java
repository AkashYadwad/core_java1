class Mixer
{
	static boolean isConnected;
	static int currentSpeed;
	static int maxSpeed = 7;
	static int minSpeed = 0;
	
	public static void onOrOff()
	{
		
		if(false == false)
		{
			isConnected = true;
			System.out.println("The Mixer is Turned On");
			
		}else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("The Mixer is Turned Off");
		}
	}
	
	public static void increaseSpeed(){
	if(isConnected == false){
	System.out.println("please switch on the mixer");
	isConnected = true;
	}
	else{
		if(isConnected == true){
			if(currentSpeed < maxSpeed){
			currentSpeed = currentSpeed +1;	
			System.out.println("The Mixer Speed is increased by "+currentSpeed);
			System.out.println("current speed="+currentSpeed);
			}
			else{
			System.out.println("it is alredy in the maxSpeed");
			}
		}
		else{
		System.out.println("please make sure that your mixer is on or off" );
		}

		}
	}
			
	public static void decreaseSpeed(){
 

	if(isConnected == false){
		System.out.println("The mixer is 'off' plsease switch 'on' the speaker");
	isConnected = true;
         }
	
	else{
		if(isConnected == true){
			System.out.println("youer mixer speed is " +currentSpeed+ " if you want to decrease you can decrease");
               		  if(currentSpeed > minSpeed){
		 		currentSpeed = currentSpeed-1;
 				System.out.println("you are decreased the speed by "+currentSpeed);
               		  }
			}	
		else{
			System.out.println("please recheck the connection again if the mixer is 'on' or 'off' this id the current status of the your mixer"+isConnected);
		}
 	}
   }
	
}