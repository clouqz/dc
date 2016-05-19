package com.cloud.dc.service;

public enum ServiceEnum {
	
	MemberServiceProvider("MemberServiceProvider"),
	BalancesServiceProvider("BalancesServiceProvider"),
	CardsServiceProvider("CardsServiceProvider"),
	CouponsServiceProvider("CouponsServiceProvider"),
	GroupServiceProvider("GroupServiceProvider"),
	PointsServiceProvider("PointsServiceProvider"),
	RightsServiceProvider("RightsServiceProvider"),
	RightsCollectionServiceProvider("RightsCollectionServiceProvider"),
	MemberLevelServiceProvider("MemberLevelServiceProvider"),
	OrderServiceProvider("OrderServiceProvider"),
	MemberPasswordServiceProvider("MemberPasswordServiceProvider"),
	LablesServiceProvider("LablesServiceProvider");
	
	private String name = "";
	
	private ServiceEnum(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
