package com.samples.design.strategy;

/**
 * 策略模式：加密示例
 * 三个角色：抽象策略、具体策略、上下文封装类(context,对策略组合及提供策略使用入口)
 * 个人观点：非常简单的模式，组合关系的运用
 * @author wuyouwulv
 *
 */
public class StrategyTest {

	public static void main(String[] args) {
		EncryptContext context = new EncryptContext(new MD5Strategy());
		context.encrypt("用户密码Abc888");

		EncryptContext context2 = new EncryptContext(new SHA1Strategy());
		context2.encrypt("账户密码123456");
	}

}
