package com.mt.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mt.pages.Flightfinderpage;
import com.mt.pages.Loginpage;

public class Login {
@Parameters({"usernm","passwd"})
@Test
public void executeLogin(String username,String password)
{
	Loginpage lp=new Loginpage();
	lp.loadLoginpage();
	lp.enterUsername(username);
	lp.enterPassword(password);
	lp.clickonLogin();
	
	Flightfinderpage fg=new Flightfinderpage();
	fg.loadFlightfinderpage();
	fg.verifyFlightFinderimg();
	fg.clickonSignoff();
}


}
