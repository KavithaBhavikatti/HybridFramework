package testScript;

import org.testng.annotations.Test;

import generic.FetchData;
import generic.GenericMethods;
import pom.Pom;

public class FBLoginScript extends GenericMethods
{

	@Test
	public void LoginMethod()
	{
		String un=FetchData.FetchDataFromExcel("Sheet1",0,0);
		String pwd=FetchData.FetchDataFromExcel("Sheet1", 0, 1);	
		Pom p=new Pom(driver);
		p.username(un);
		p.password(pwd);
		p.login_btn();
		
	}
}
