package com.xuchang.patterns.behavioral.state;

/**
 * 状态模式
 * 定义：允许一个对象在其内部状态改变时，改变它的行为
 * 类型：行为型
 * 适用场景：一个对象存在多个状态（不同状态下行为不同），且状态可互相转换
 * 优点：
 * 将不同的状态隔离
 * 把各种状态的转换逻辑，分布到State的子类中，减少互相间依赖
 * 增加新的状态非常简单
 *
 * 缺点：状态多的业务场景导致类数目增加，系统变复杂
 */
public class Test {
	public static void main(String[] args) {
		HomeContext ctx = new HomeContext();
		
		ctx.setState(new FreeState());
		ctx.setState(new BookedState());
		
	}
}
