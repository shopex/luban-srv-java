package com.shopex.hprose.server;

import java.util.HashMap;

public class TagGroup {
	// @Title 标签组添加
	// @Doc
	// @Param  name     string  false  标签组名称
	public String New(HashMap<String,String> args){
		return null;
	}
	
	
	
	
	// @Title  获取列表
	// @Doc
	// @Param  fields        string  true   字段列表
	// @Param  name          string  false  标签组名称
	// @Param  created       int32   false  创建时间
	// @Param  updated       int32   false  更新时间
	// @Param  offset        int     true   结果集起始点
	// @Param  limit         int     true   结果集最大长度
	// @Param  sort          string  true   排序依据: changed, changed-desc, price, price-desc, meta-xx, meta-xx-desc
	public String Find(HashMap<String,String> args){
		return null;
	}
	
	
	// @Title 标签组更新
	// @Doc
	// @Param  id            int     true   id
	// @Param  name     string  false  标签组名称
	public String Update(HashMap<String,String> args){
		return null;
	}
	
	// @Title 获取标签组信息
	// @Doc
	// @Param  id 	   int    true    id
	public String Get(HashMap<String,String> args){
		return null;
	}
	
	
	// @Title 标签组删除
	// @Doc
	// @Param id 	int true  id
	public String Remove(HashMap<String,String> args){
		return null;
	}
}
