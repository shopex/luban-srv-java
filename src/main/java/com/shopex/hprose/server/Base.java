package com.shopex.hprose.server;

import java.util.HashMap;
import java.util.Map;

import com.shopex.jdbc.util.Hashids;
import com.shopex.jdbc.util.SpringJdbc4mysql;
import com.shopex.jdbc.util.SqlUtil;
/***
 * 
 * @author zhongjiqiang
 *
 */
public class Base {
	
	
	// @Title 新增会员
	// @Doc hello world
	// @Param  name          string  false  姓名
	public String Hello(Map<String,String> args){
		if(args.get("name")!=null){
			
			return "hello "+args.get("name")+"!";
		}else{
			return "hello cannot get your name arg!";
		}
	}
	
	// @Title 新增会员
	// @Doc
	// @Param  mobile        string  true  手机
	// @Param  name          string  false  姓名
	// @Param  email         string  false  邮箱
	// @Param  state_id      int32   false  省份id
	// @Param  city_id       int32   false  城市id
	// @Param  district_id   int32   false  地区id
	// @Param  point         int32   false  积分
	// @Param  level_id      int32   false  会员等级
	// @Param  growth_value  int32   false  成长值
	// @Param  meta      string  false  扩展字段: key:value;key:value
	public HashMap<String,String> New(HashMap<String,String> args){
		
		HashMap<String,String> remap = new HashMap<String,String>();
		String errorcode="0";
		String mobile = args.get("mobile");
		if(mobile==null || !mobile.matches("\\d{11}")){
			errorcode="1001";
			remap.put("code", errorcode);
			remap.put("status", "fail");
			remap.put("error_msg", "手机号格式不正确");
			remap.put("data", "");
			return remap;
		}
		String name = args.get("name");
		String email = args.get("email");
		String state_id = args.get("state_id");
		String city_id = args.get("city_id");
		String district_id =  args.get("district_id");
		String point = args.get("point");
		String level_id = args.get("level_id");
		String growth_value = args.get("growth_value");
		String updated =System.currentTimeMillis()/1000+"";
		String created =updated;

		String meta = args.get("meta");
//		System.out.println(mobile);
		int number = -1;
		try{
			
			Object obj  = SpringJdbc4mysql.getJdbc("0").queryForObject("select id from member_base where mobile=?", new Object[]{mobile},String.class);
			number = Integer.parseInt(obj.toString());
		}catch(org.springframework.dao.EmptyResultDataAccessException e){
			number=-1;
		}
		String sql;
		Hashids hashids = new Hashids("member.key",8);
		if(number == -1){
			sql = "insert into member_base(mobile,name,email,state_id,city_id,district_id,"
					+ "point,level_id,growth_value,created,updated) values(?,?,?,?,?,?,?,?,?,?,?)";
			SqlUtil sqt = new SqlUtil();
			int id = sqt.insertreAuto(sql, "mobile",mobile,"name",name,"email",email,"state_id",state_id,"city_id",city_id,"district_id",district_id,"point",point,"level_id",level_id,"growth_value",growth_value,"created",created,"updated",updated);
			String mkey = hashids.encode(id);
			remap.put("data", mkey);
		}else{
			String mkey = hashids.encode(number);
			remap.put("data", mkey);
			sql = "update member_base set name=? , email=? , state_id=?,city_id=?,district_id=?,point=?,level_id=?,growth_value=?,updated=? where mobile=?";
			SpringJdbc4mysql.getJdbc("0").update(sql, new Object[]{name,email,state_id,city_id,district_id,point,level_id,growth_value,updated,mobile});
		}
		
		remap.put("code", errorcode);
		remap.put("error_msg", "");
		remap.put("status", "succ");
		
		
		return remap;
		
	}
	

	
	// @Title 更新会员信息
	// @Doc
	// @Param  id            int     true   id
	// @Param  mobile        string  false  手机
	// @Param  name          string  false  姓名
	// @Param  email         string  false  邮箱
	// @Param  state_id      int32   false  省份id
	// @Param  city_id       int32   false  城市id
	// @Param  district_id   int32   false  地区id
	// @Param  point         int32   false  积分
	// @Param  level_id      int32   false  会员等级
	// @Param  growth_value  int32   false  成长值
	public HashMap<String,String> Update(HashMap<String,String> args){
		
		HashMap<String,String> remap = new HashMap<String,String>();
		String errorcode="0";
		String mobile = args.get("mobile");
		String id = args.get("id");
		if(mobile==null || !mobile.matches("\\d{11}")){
			errorcode="1001";
			remap.put("code", errorcode);
			remap.put("status", "fail");
			remap.put("error_msg", "手机号格式不正确");
			remap.put("data", "");
			return remap;
		}
		if(id==null){
			errorcode="102";
			remap.put("code", errorcode);
			remap.put("status", "fail");
			remap.put("error_msg", "操作信息不存在");
			remap.put("data", "");
			return remap;
		}
		/***
		 *     "status": "succ",
			    "error_code": "0",
			    "error_msg": "",
			    "data": 33
		 */
		
		String name = args.get("name");
		String email = args.get("email");
		String state_id = args.get("state_id");
		String city_id = args.get("city_id");
		String district_id =  args.get("district_id");
		String point = args.get("point");
		String level_id = args.get("level_id");
		String growth_value = args.get("growth_value");
		String updated =System.currentTimeMillis()/1000+"";
//		String mkey = hashids.encode(number);
//		remap.put("data", mkey);
		String sql = "update member_base set name=? , email=? , state_id=?,city_id=?,district_id=?,point=?,level_id=?,growth_value=?,updated=? where id =?";
		SpringJdbc4mysql.getJdbc("0").update(sql, new Object[]{name,email,state_id,city_id,district_id,point,level_id,growth_value,updated,id});
//		String created =updated;
		
//		String meta = args.get("meta");
		
		
		return remap;
	}
	
	
	

}
