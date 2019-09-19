package com.xuchang.patterns.behavioral.templatemethod.v2;

class DrawMoney extends BankTemplateMethod {

	@Override
	public void transact() {
		System.out.println("我要取款！！！");
	}
	
}