package com.mt.utility;

import org.testng.annotations.Test;

import com.mt.config.Config;

public class CloseBrowser {
@Test
public void closeBrowser()
{
	Config.driver.quit();
}
}
