package com.samples.design.command;

/**
 * ����ӿ�
 * @author wuyouwulv
 *
 */
public interface Command {
	public void execute(int num);
	
	public void undo(int num);
}
