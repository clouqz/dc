package com.cloud.dc.service.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.cloud.dc.service.ServiceEnum;
import com.cloud.dc.service.ServiceProvider;

public class ServiceProviderManager<T>{
	
	private static final Map<String, ServiceProvider<?>> providers = new ConcurrentHashMap<String, ServiceProvider<?>>(10);
	
	private static boolean isInit = false;
	
	private ServiceProviderManager() throws IllegalAccessException{
		throw new IllegalAccessException();
	}
	
	public static boolean initServiceProvider() throws IllegalAccessException{
		if(isInit){
			throw new IllegalAccessException("ServiceProviderManager has been initialized, please don't init it again!!!");
		}
//		ServiceProvider<MemberService> memberProvider = (ServiceProvider<MemberService>) new MemberServiceProvider();
//		registerFactoryProvider(ServiceEnum.MemberServiceProvider.getName(), memberProvider);
		isInit = true;
		return isInit;
	}
	
	public static ServiceProvider<?> getProvider(ServiceEnum service) {
		return providers.get(service.getName());
	}
	
	public static void registerFactoryProvider(String name, ServiceProvider<?> provider) {
		if(!providers.containsKey(name)){
			providers.put(name, provider);
		}
	}

}
