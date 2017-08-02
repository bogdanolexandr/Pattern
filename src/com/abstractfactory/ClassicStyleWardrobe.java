package com.abstractfactory;

public class ClassicStyleWardrobe implements AbstractWardrobe {

	@Override
	public UpperPart takeUpperPart() {
		return new Shirt();
	}

	@Override
	public LowerPart takeLowerPart() {
		return new Pants();
	}

}
