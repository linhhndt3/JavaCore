package com.edu.linhhn.designpattern.structure;

public class AdapterVoltV1 extends Socket implements GenVoltable {

	@Override
	public Volt gen120() {
		// TODO Auto-generated method stub
		return gen120V();
	}

	@Override
	public Volt gen12() {
		// TODO Auto-generated method stub
		int v12 = gen120V().getVolt() / 10;
		Volt v = new Volt();
		v.setVolt(v12);
		return v;
	}

	@Override
	public Volt gen3() {
		// TODO Auto-generated method stub
		int v3 = gen120V().getVolt() / 40;
		Volt v = new Volt();
		v.setVolt(v3);
		return v;
	}

}
