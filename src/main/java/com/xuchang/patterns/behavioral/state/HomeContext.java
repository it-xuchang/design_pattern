package com.xuchang.patterns.behavioral.state;

/**
 * 房间上下文，维护state状态 根据金额不同，切换不同的状态！
 */
public class HomeContext {

	private State state;
	
	
	public void setState(State state){
		System.out.println("修改状态！");
		state = state;
		state.handle();
	}
	
}
