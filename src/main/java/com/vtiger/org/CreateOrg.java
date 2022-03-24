package com.vtiger.org;

import org.testng.annotations.Test;

public class CreateOrg {

	@Test
	public void createOrg() {
		
		System.out.println("Manager-Created Orgnation");
		System.out.println("Dev1-Modify Orgnization");
		System.out.println("Manager-updated organization");
		System.out.println("Dev1-update orgganization");
		System.out.println("Manager-updated org");
		

	}
	
	@Test
	public void updateOrg() {
		System.out.println("Dev1-update2 orgnization");
		System.out.println("Manager-updated organization");
		System.out.println("Shashi -Change this method");
	}
	
	@Test
	public void deletedOrg() {
		System.out.println("Dev1-update2 orgnization");
		System.out.println("Manager-updated organization");
		System.out.println("Shashi -Change this method");
	}
}
