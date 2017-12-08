package com.edu.linhhn.poolObject;

import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.GenericObjectPool;

public class ParseApp {
	public static void main(String[] args) throws Exception {
		
		PooledObjectFactory parseFactory = new ParsePoolObjectFactory();
		GenericObjectPool<Parse<String, String>> pool = new ParsePool(parseFactory);
		Parse xmlParse = pool.borrowObject();
		xmlParse.parse("sourceOfData", "afterParsed");
		pool.returnObject(xmlParse);
	}
}
