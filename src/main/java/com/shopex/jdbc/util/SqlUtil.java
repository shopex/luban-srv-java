package com.shopex.jdbc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class SqlUtil {
	
	  /**
	   * @param sql
	   * @param kv 
	   * 			字段名,字段值.......
	   * @return int 自增字段的值
	   * 
	   */
	public  int insertreAuto(final String sql,  String ...kv)
	{
		final String[] keys = new String[kv.length/2];
		final String[] values = new String[kv.length/2];
		for(int i=0;i<kv.length;i++){
			if(i%2==0){
				keys[i/2]=kv[i];
			}else{
				values[i/2]=kv[i];
			}
		}
	    KeyHolder keyHolder = new GeneratedKeyHolder();
	    SpringJdbc4mysql.getJdbc("0").update(
	            new PreparedStatementCreator() {
	                public PreparedStatement createPreparedStatement(Connection con) throws SQLException
	                {
	                    PreparedStatement ps = SpringJdbc4mysql.getJdbc("0").getDataSource()
	                            .getConnection().prepareStatement(sql,keys);
	                    for(int i=0;i<values.length;i++){
	                    	ps.setString(i+1, values[i]);
	                    }
	                    return ps;
	                }
	            }, keyHolder);
//	    System.out.println("自动插入id============================" + keyHolder.getKey().intValue());
	    return keyHolder.getKey().intValue();
	}
}
