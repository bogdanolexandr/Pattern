package com.abstractfactory;

public class CasualStyleWardrobe implements AbstractWardrobe {

	@Override
	public UpperPart takeUpperPart() {
		return new Tshirt();
	}

	@Override
	public LowerPart takeLowerPart() {
		return new Shorts();
	}

}
