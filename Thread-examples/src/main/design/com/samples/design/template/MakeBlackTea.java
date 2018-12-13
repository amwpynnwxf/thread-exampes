package com.samples.design.template;

public class MakeBlackTea extends AbstractMakeTea {

	@Override
	protected void brew() {
		System.out.println("ÓÃ100¡ãCµÄË®Åİºì²è");
	}

	@Override
	protected boolean isWashTea() {
		return true;
	}

}
