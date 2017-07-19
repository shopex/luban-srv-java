package com.shopex.hprose.getdoc;
import java.io.IOException;
import java.util.HashMap;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@SuppressWarnings({ "rawtypes", "finally" })
public class Doc {
static final String doc = "{\"apis\":[{\"summary\":\"world\",\"title\":\"新增会员\",\"name\":\"base_hello\",\"parameters\":[{\"minimum\":0,\"maximum\":0,\"description\":\"姓名\",\"name\":\"name\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"}]},{\"summary\":\"\",\"title\":\"新增会员\",\"name\":\"base_new\",\"parameters\":[{\"minimum\":0,\"maximum\":0,\"description\":\"手机\",\"name\":\"mobile\",\"allowMultiple\":false,\"format\":\"\",\"required\":true,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"姓名\",\"name\":\"name\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"邮箱\",\"name\":\"email\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"省份id\",\"name\":\"state_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"城市id\",\"name\":\"city_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"地区id\",\"name\":\"district_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"积分\",\"name\":\"point\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"会员等级\",\"name\":\"level_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"成长值\",\"name\":\"growth_value\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"扩展字段:\",\"name\":\"meta\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"}]},{\"summary\":\"\",\"title\":\"更新会员信息\",\"name\":\"base_update\",\"parameters\":[{\"minimum\":0,\"maximum\":0,\"description\":\"id\",\"name\":\"id\",\"allowMultiple\":false,\"format\":\"\",\"required\":true,\"type\":\"int\"},{\"minimum\":0,\"maximum\":0,\"description\":\"手机\",\"name\":\"mobile\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"姓名\",\"name\":\"name\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"邮箱\",\"name\":\"email\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"省份id\",\"name\":\"state_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"城市id\",\"name\":\"city_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"地区id\",\"name\":\"district_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"积分\",\"name\":\"point\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"会员等级\",\"name\":\"level_id\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"成长值\",\"name\":\"growth_value\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"}]},{\"summary\":\"\",\"title\":\"标签组添加\",\"name\":\"tag_group_new\",\"parameters\":[{\"minimum\":0,\"maximum\":0,\"description\":\"标签组名称\",\"name\":\"name\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"}]},{\"summary\":\"\",\"title\":\"获取列表\",\"name\":\"tag_group_find\",\"parameters\":[{\"minimum\":0,\"maximum\":0,\"description\":\"字段列表\",\"name\":\"fields\",\"allowMultiple\":false,\"format\":\"\",\"required\":true,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"标签组名称\",\"name\":\"name\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"},{\"minimum\":0,\"maximum\":0,\"description\":\"创建时间\",\"name\":\"created\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"更新时间\",\"name\":\"updated\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"int32\"},{\"minimum\":0,\"maximum\":0,\"description\":\"结果集起始点\",\"name\":\"offset\",\"allowMultiple\":false,\"format\":\"\",\"required\":true,\"type\":\"int\"},{\"minimum\":0,\"maximum\":0,\"description\":\"结果集最大长度\",\"name\":\"limit\",\"allowMultiple\":false,\"format\":\"\",\"required\":true,\"type\":\"int\"},{\"minimum\":0,\"maximum\":0,\"description\":\"排序依据:\",\"name\":\"sort\",\"allowMultiple\":false,\"format\":\"\",\"required\":true,\"type\":\"string\"}]},{\"summary\":\"\",\"title\":\"标签组更新\",\"name\":\"tag_group_update\",\"parameters\":[{\"minimum\":0,\"maximum\":0,\"description\":\"id\",\"name\":\"id\",\"allowMultiple\":false,\"format\":\"\",\"required\":true,\"type\":\"int\"},{\"minimum\":0,\"maximum\":0,\"description\":\"标签组名称\",\"name\":\"name\",\"allowMultiple\":false,\"format\":\"\",\"required\":false,\"type\":\"string\"}]},{\"summary\":\"\",\"title\":\"获取标签组信息\",\"name\":\"tag_group_get\",\"parameters\":[{\"minimum\":0,\"maximum\":0,\"description\":\"id\",\"name\":\"id\",\"allowMultiple\":false,\"format\":\"\",\"required\":true,\"type\":\"int\"}]},{\"summary\":\"\",\"title\":\"标签组删除\",\"name\":\"tag_group_remove\",\"parameters\":[{\"minimum\":0,\"maximum\":0,\"description\":\"id\",\"name\":\"id\",\"allowMultiple\":false,\"format\":\"\",\"required\":true,\"type\":\"int\"}]}]}";
static HashMap hm = null;
public static HashMap getdoc(){
try {
if(hm==null){
hm = new ObjectMapper().readValue(doc, HashMap.class);
}
} catch (JsonParseException e) {
e.printStackTrace();
} catch (JsonMappingException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}finally{
return hm;
}
}
public static void main(String[] args) {
System.out.println(getdoc());
}
}
/*
Base base = new Base();
server.add("Hello",base,"base_hello");
server.add("New",base,"base_new");
server.add("Update",base,"base_update");
TagGroup taggroup = new TagGroup();
server.add("New",taggroup,"tag_group_new");
server.add("Find",taggroup,"tag_group_find");
server.add("Update",taggroup,"tag_group_update");
server.add("Get",taggroup,"tag_group_get");
server.add("Remove",taggroup,"tag_group_remove");
*/
