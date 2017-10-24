package com.xx.dao.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class MyTypeHandler implements TypeHandler<String []> {

	@Override
	public String[] getResult(ResultSet arg0, String arg1) throws SQLException {
		String value=arg0.getString(arg1);
		return value.split(",");
	}

	@Override
	public String[] getResult(ResultSet arg0, int arg1) throws SQLException {
		String value=arg0.getString(arg1);
		return value.split(",");
	}

	@Override
	public String[] getResult(CallableStatement arg0, int arg1) throws SQLException {
		String value=arg0.getString(arg1);
		return value.split(",");
	}

	@Override
	public void setParameter(PreparedStatement arg0, int arg1, String[] arg2, JdbcType arg3) throws SQLException {
		String value="";
		if(arg2.length!=0){
			for(int i=0;i<arg2.length;i++){
				if(arg2.length-1==i){
					value+=arg2[i];
				}else {
					value+=arg2[i]+",";
				}
			}
		}
		arg0.setString(arg1, value);
	}

}
