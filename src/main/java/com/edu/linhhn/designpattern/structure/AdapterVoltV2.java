package com.edu.linhhn.designpattern.structure;

public class AdapterVoltV2 implements GenVoltable {
	
	private Socket socket = new Socket();
	
	@Override
	public Volt gen120() {
		// TODO Auto-generated method stub
		return socket.gen120V();
	}

	@Override
	public Volt gen12() {
		// TODO Auto-generated method stub
		int v12 = socket.gen120V().getVolt() / 10;
		Volt v = new Volt();
		v.setVolt(v12);
		return v;
	}

	@Override
	public Volt gen3() {
		// TODO Auto-generated method stub
		int v3 = socket.gen120V().getVolt() / 40;
		Volt v = new Volt();
		v.setVolt(v3);
		return v;
	}

}
