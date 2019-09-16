package com.mt.modules;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mt.utility.LaunchApp;

public class Launch {

	@Parameters({"browser","url","seconds"})
	@Test
	public void executeLaunch(String browsername,String urlnm,int seconds) throws IOException
	{
		LaunchApp la=new LaunchApp();
		la.openBrowser(browsername);
		la.EnterApplicationURL(urlnm);
		la.maximizeBrowser();
		la.waittillLoginpageLoaded(seconds);
	}
}
