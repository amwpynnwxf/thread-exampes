package com.samples.design.facade;

public class ComputeFacade {
	private Cpu cpu;
	private Memory memory;
	private Disk disk;
	
	public ComputeFacade() {
		cpu = new Cpu();
		memory = new Memory();
		disk = new Disk();
	}

	public void start(){
		System.out.println("compute start ...");
		cpu.start();
		disk.start();
		memory.start();
	}
	
	public void shutdown(){
		System.out.println("compute shutdown ... ");
		memory.shutdown();
		disk.shutdown();
		cpu.shutdown();
	}
}
