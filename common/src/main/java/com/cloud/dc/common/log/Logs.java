package com.cloud.dc.common.log;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public interface Logs {
	
	public void info(String msg);
	
	public void info(String msg, Throwable t);
	
	public void warn(String msg);
	
	public void warn(String msg, Throwable t);
	
	public void error(String msg);
	
	public void error(String msg, Throwable e);
	
	public void debug(String msg);
	
	public void debug(String msg, Throwable e);
	
	public void trace(String msg);
	
	public void trace(String msg, Throwable e);
	
	static class Builder<T>{
		
		@SuppressWarnings("rawtypes")
		private static Map<Class, Logger> logs = new ConcurrentHashMap<Class, Logger>(); 
		
		public static Logs getLog(Class<?> clazz){
			if(null == logs.get(clazz)){
				logs.put(clazz, new Logger(clazz));
			}
			return logs.get(clazz);
		} 
		
		private static class Logger implements Logs{
			
			private Log log = null;
			
			public Logger(Class<?> clazz) {
				log = LogFactory.getLog(clazz);
			}

			@Override
			public void info(String msg) {
				if(log.isInfoEnabled()){
					log.info(msg);
				}
			}
			
			public void info(String msg, Throwable t) {
				if(log.isInfoEnabled()){
					log.info(msg, t);
				}
			}
			
			@Override
			public void warn(String msg) {
				if(log.isWarnEnabled()){
					log.warn(msg);
				}
			}
			
			public void warn(String msg, Throwable t) {
				if(log.isWarnEnabled()){
					log.warn(msg, t);
				}
			}

			@Override
			public void error(String msg) {
				if(log.isErrorEnabled()){
					log.error(msg);
				}
			}

			@Override
			public void error(String msg, Throwable e) {
				if(log.isErrorEnabled()){
					log.error(msg, e);
				}
			}
			
			@Override
			public void debug(String msg) {
				if(log.isDebugEnabled()){
					log.debug(msg);
				}
			}

			@Override
			public void debug(String msg, Throwable e) {
				if(log.isDebugEnabled()){
					log.debug(msg, e);
				}
			}

			@Override
			public void trace(String msg) {
				if(log.isTraceEnabled()){
					log.trace(msg);
				}
			}

			@Override
			public void trace(String msg, Throwable e) {
				if(log.isTraceEnabled()){
					log.trace(msg, e);
				}
			}
			
		}
		
	}

}
