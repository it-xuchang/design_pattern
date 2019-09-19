package com.xuchang.patterns.behavioral.state;

public class CheckedInState implements State {

	@Override
	public void handle() {
		System.out.println("房间已入住！请勿打扰！");
	}

}