package com.cloud.dc.core;

public interface Reader {
	
	<K, E> E selectOne(K k);
	
	<K, C> C selectMore(K k, int start, int size);

}
