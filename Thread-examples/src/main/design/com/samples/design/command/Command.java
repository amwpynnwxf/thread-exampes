package com.samples.design.command;

/**
 * ÃüÁî½Ó¿Ú
 * @author wuyouwulv
 *
 */
public interface Command {
	public void execute(int num);
	
	public void undo(int num);
}
