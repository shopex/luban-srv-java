package com.shopex.jdbc.util;
import java.util.Hashtable;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

public class SpringJdbc4mysql {
//	private static ConfigurableApplicationContext springcontext = new ClassPathXmlApplicationContext("springcontext.xml");
	private static ConfigurableApplicationContext springcontext = new ClassPathXmlApplicationContext("springcontext2.xml");
	private static Map<String, JdbcTemplate> cachejdbc = new Hashtable<String, JdbcTemplate>();
	private static Map<String, TransactionTemplate> cachetransaction = new Hashtable<String, TransactionTemplate>();
	
	public static synchronized JdbcTemplate getJdbc(String sharding) {
		if (sharding==null||sharding.trim().isEmpty()){
			sharding = "0";
		}
		if (cachejdbc.get(sharding)==null){
			cachejdbc.put(sharding, new JdbcTemplate((DataSource) springcontext.getBean("dataSource"+sharding)));
		}
		return cachejdbc.get(sharding);
	}

	public static synchronized TransactionTemplate getTransaction(String sharding) {
		if (sharding==null||sharding.trim().isEmpty()){
			sharding = "0";
		}
		if (cachetransaction.get(sharding)==null){
			cachetransaction.put(sharding, new TransactionTemplate((PlatformTransactionManager) springcontext.getBean("transactionManager"+sharding)));
		}
		return cachetransaction.get(sharding);
	}
	
	public static void release(){
		springcontext.close();
		springcontext = null;
		cachejdbc.clear();
		cachejdbc = null;
		cachetransaction.clear();
		cachetransaction = null;
	}
	public static void main(String[] args) {
//		SpringJdbc4mysql.getJdbc("0").update("insert into testtable(mid,k,v) values(1,'weight','68')");
//		Files
//		System.out.println(9/2);
//		System.out.println(SpringJdbc4mysql.insertTable("insert into testtable(mid,k,v) values(?,?,?)",new String[]{"mid","10","k","weight","v","19.9"} ));
		Hashids hashids = new Hashids("member.key",8);
		String mkey = hashids.encode(Long.parseLong("33"));
		System.out.println(mkey);
	}
	
	
	
	
	
	
	
	
}
