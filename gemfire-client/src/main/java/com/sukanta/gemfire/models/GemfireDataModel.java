package com.sukanta.gemfire.models;

import com.gemstone.gemfire.pdx.PdxSerializable;

public interface GemfireDataModel  extends PdxSerializable{
	
	public String objToStr();
	

}
