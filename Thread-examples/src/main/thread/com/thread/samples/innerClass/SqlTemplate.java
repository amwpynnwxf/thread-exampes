package com.thread.samples.innerClass;


/**
 * sql²Ù×÷Ä£°åÀà
 * @author wuyouwulv
 *
 */
public class SqlTemplate {
	public void execute(SqlExecutor sqlExe){
		try{
			sqlExe.sqlExec();
		}catch(Exception e){
			System.out.println("catch sql exception: " + e.getMessage());
		}finally{
			this.close();
			this.releaseConnection();
		}
	}
	
	private void close(){
		System.out.println("mock sql close");
	}
	
	private void releaseConnection(){
		System.out.println("mock release connection");
	}
	
}
