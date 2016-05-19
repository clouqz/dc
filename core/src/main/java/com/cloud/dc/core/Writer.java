package com.cloud.dc.core;

public interface Writer {
	
	<K> int update(K k);

}
