public class Doctor
{
	public static void treatment(String patientName,int age, String sickness)
	{
		System.out.println("The PatientName is:"+patientName);
		System.out.println("The Age is:"+age);
		System.out.println("The Sickness is:"+sickness);
		Nurse.assist();
		
	}
}