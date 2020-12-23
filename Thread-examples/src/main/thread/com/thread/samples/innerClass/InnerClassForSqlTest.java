package com.thread.samples.innerClass;


/**
 * 匿名内部类：sql模板执行测试
 * @author wuyouwulv
 *
 */
public class InnerClassForSqlTest {
	public static void main(String[] args){
		new InnerClassForSqlTest().testSql("update student(name,birthday,sex) values('张三','1990-10-20','male')");
	}
	
	private void testSql(String sql){
		new SqlTemplate().execute(
				// 以下匿名内部类
				new SqlExecutor(){
					@Override
					public void sqlExec() {
						System.out.println("mock get connection");
						System.out.println("mock execute sql: " + sql);
						System.out.println("sql execute complete!");
						throw new RuntimeException("sql error");
					}
				}
		);
	}
}
