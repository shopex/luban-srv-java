package com.shopex.hprose.getdoc;

import java.io.IOException;
import java.util.HashMap;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings({ "rawtypes", "finally" })
public class DocFormat {
	static final String  doc = "{\"apis\":[{\"summary\":\"随便搞搞\",\"title\":\"更新会员信息\",\"name\":\"testadd01\",\"parameters\":[{\"minimum\":0,\"maximum\":0,\"description\":\"id\",\"name\":\"id\",\"allowMultiple\":false,\"format\":\"\",\"required\":true,\"type\":\"int\"},{\"minimum\":0,\"maximum\":0,\"description\":\"手机\",\"name\":\"mobile\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"姓名\",\"name\":\"name\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"邮箱\",\"name\":\"email\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"省份id\",\"name\":\"state_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"城市id\",\"name\":\"city_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"地区id\",\"name\":\"district_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"积分\",\"name\":\"point\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"会员等级\",\"name\":\"level_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"成长值\",\"name\":\"growth_value\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"}]},{\"summary\":\"随便搞搞\",\"title\":\"更新会员信息\",\"name\":\"testadd02\",\"parameters\":[{\"minimum\":0,\"maximum\":0,\"description\":\"id\",\"name\":\"id\",\"allowMultiple\":false,\"format\":\"\",\"required\":true,\"type\":\"int\"},{\"minimum\":0,\"maximum\":0,\"description\":\"手机\",\"name\":\"mobile\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"姓名\",\"name\":\"name\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"邮箱\",\"name\":\"email\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"省份id\",\"name\":\"state_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"城市id\",\"name\":\"city_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"地区id\",\"name\":\"district_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"会员等级\",\"name\":\"level_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"成长值\",\"name\":\"growth_value\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"}]}]}";
	static HashMap hm = null;

	public static HashMap getdoc() {
		try {
			if (hm == null) {
				hm = new ObjectMapper().readValue(doc, HashMap.class);
			}
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			return hm;
		}
	}

	public static void main(String[] args) {
		System.out.println(getdoc());
	}
}
