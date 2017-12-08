package com.edu.linhhn.poolObject;

import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class ParsePool<E, T> extends GenericObjectPool<Parse<E, T>>{

	public ParsePool(PooledObjectFactory<Parse<E, T>> factory) {
		super(factory);
	}
	
	public ParsePool(PooledObjectFactory<Parse<E, T>> factory, GenericObjectPoolConfig config) {
		super(factory, config);
	}

}
