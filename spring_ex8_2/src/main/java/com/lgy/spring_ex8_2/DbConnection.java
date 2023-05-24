package com.lgy.spring_ex8_2;

public class DbConnection {
	
	private String mysqlId, mysqlPw;
	private String mssqlId, mssqlPw;
	
	
	public String getMysqlId() { return mysqlId; }
	public String getMysqlPw() { return mysqlPw; }
	public String getMssqlId() { return mssqlId; }
	public String getMssqlPw() { return mssqlPw; }
	
	public void setMysqlId(String mysqlId) { this.mysqlId = mysqlId; }
	public void setMysqlPw(String mysqlPw) { this.mysqlPw = mysqlPw; }
	public void setMssqlId(String mssqlId) { this.mssqlId = mssqlId; }
	public void setMssqlPw(String mssqlPw) { this.mssqlPw = mssqlPw; }
	
	@Override
	public String toString() {
		return "mysqlId : " + mysqlId + "\nmysqlPw : " + mysqlPw + "\nmssqlId : " + mssqlId + "\nmssqlPw : "
				+ mssqlPw + "]";
	}
	
	
}
