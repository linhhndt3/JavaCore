package com.edu.linhhn.poolObject;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;


public class ParsePoolObjectFactory<E, T> extends BasePooledObjectFactory<Parse<E, T>>{

	@Override
	public Parse<E, T> create() throws Exception {
		return new XmlParse<E,T>();
	}

	@Override
	public PooledObject<Parse<E, T>> wrap(Parse<E, T> parse) {
		return new DefaultPooledObject<Parse<E,T>>(parse);
	}

	@Override
	public void passivateObject(PooledObject<Parse<E, T>> parser) throws Exception {
		parser.getObject().reset();
	}
	@Override
	public boolean validateObject(PooledObject<Parse<E, T>> parser) {
		return parser.getObject().isValid();
	}
}
