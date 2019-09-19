package com.xuchang.patterns.behavioral.state;

public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("房间已预订！别人不能定！");
	}

}