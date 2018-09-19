package com.sample;

//import Matrix.PwMatrix;

public class Testmain
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
				
		System.out.println(System.getProperty("java.library.path"));  
		System.out.println("system property.."+System.getenv("PW_MATRIX"));

/*			
		String password = PwMatrix.getPassword("BRM", "syscldBRMBPMDEV");  
		System.out.println("Password 1 : " + password);
		
		String password1 = PwMatrix.getPassword("BRM", "syscldBRMAISDEV");  
		System.out.println("Password 1 : " + password1);
		
		*/
		
		
	}
	
	public void testMethod(){
		System.out.println("**** In TestMethod() ****");
	}
  
}