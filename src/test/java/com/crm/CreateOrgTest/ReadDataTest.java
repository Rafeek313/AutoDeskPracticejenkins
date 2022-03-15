package com.crm.CreateOrgTest;

import org.testng.annotations.Test;

public class ReadDataTest {
@Test
public void read() {
	String Browser = System.getProperty("browser");
	System.out.println(Browser);
	String URL= System.getProperty("url");
	System.out.println(URL);
}
}
