package com.thread.samples.innerClass;


/**
 * �����ڲ��ࣺsqlģ��ִ�в���
 * @author wuyouwulv
 *
 */
public class InnerClassForSqlTest {
	public static void main(String[] args){
		new InnerClassForSqlTest().testSql("update student(name,birthday,sex) values('����','1990-10-20','male')");
	}
	
	private void testSql(String sql){
		new SqlTemplate().execute(
				// ���������ڲ���
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
