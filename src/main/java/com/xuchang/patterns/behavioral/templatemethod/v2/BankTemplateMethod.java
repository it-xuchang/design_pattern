package com.xuchang.patterns.behavioral.templatemethod.v2;

public abstract class BankTemplateMethod {
	//具体方法
	public void takeNumber(){
		System.out.println("取号排队");
	}

	//办理具体的业务
	public abstract void transact();
	
	public void evaluate(){
		System.out.println("反馈评分");
	}


	//模板方法
	public final void process(){
		this.takeNumber();

		this.transact();

		this.evaluate();
	}
	
}
