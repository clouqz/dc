package com.cloud.dc.ui;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.codehaus.jackson.map.SerializationConfig;

import com.cloud.dc.api.impl.AdminImpl;
import com.cloud.dc.api.impl.NormalUserImpl;

public class RestApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();  
    private Set<Class<?>> newInstances = new HashSet<Class<?>>();  
  
    public RestApplication() {
        JacksonJaxbJsonProvider jaxbProvider = new JacksonJaxbJsonProvider();
//        jaxbProvider.configure(SerializationConfig.Feature.WRAP_ROOT_VALUE, false);
//        jaxbProvider.configure(SerializationConfig.Feature.AUTO_DETECT_FIELDS, true);
    	singletons.add(new AdminImpl());  
    	singletons.add(new NormalUserImpl());  
//    	singletons.add(LogProxy.getProxy(new MemberBalancesImpl()));
//    	singletons.add(LogProxy.getProxy(new MemberCardsImpl()));
//    	singletons.add(LogProxy.getProxy(new MemberCouponsImpl()));
//    	singletons.add(LogProxy.getProxy(new MemberPointsImpl()));
//    	singletons.add(LogProxy.getProxy(new MemberGrowthPointsImpl<Object, Object>()));
//    	singletons.add(LogProxy.getProxy(new MemberRightsImpl()));
//		singletons.add(LogProxy.getProxy(new MemberRightsCollectionImpl()));
//    	singletons.add(LogProxy.getProxy(new MemberLevelImpl()));
//    	singletons.add(LogProxy.getProxy(new MemberPasswordImpl()));
//    	singletons.add(LogProxy.getProxy(new MemberGroupImpl()));
//    	singletons.add(LogProxy.getProxy(new VistaPOSService()));
//    	singletons.add(LogProxy.getProxy(new LablesImpl()));
//    	singletons.add(LogProxy.getProxy(new LevelRightsCollectionImpl()));
//    	singletons.add(jaxbProvider);  
//    	newInstances.add(MemberInfoImpl.class);  
//    	newInstances.add(MemberBalancesImpl.class);
//    	newInstances.add(MemberCardsImpl.class);
//    	newInstances.add(MemberCouponsImpl.class);
//    	newInstances.add(MemberPointsImpl.class);
//    	newInstances.add(MemberGrowthPointsImpl.class);
//    	newInstances.add(MemberRightsImpl.class);
//		newInstances.add(MemberRightsCollectionImpl.class);
//    	newInstances.add(MemberLevelImpl.class);
//    	newInstances.add(MemberPasswordImpl.class);
//    	newInstances.add(MemberGroupImpl.class);
//    	newInstances.add(VistaPOSService.class);
//    	newInstances.add(LablesImpl.class);
//    	newInstances.add(LevelRightsCollectionImpl.class);
//    	singletons.add(jaxbProvider);  
    }  
  
    @Override  
    public Set<Class<?>> getClasses() {  
        return newInstances;  
    }  
  
    @Override  
    public Set<Object> getSingletons() {  
        return singletons;  
    }  
}
