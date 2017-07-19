package com.shopex.member.forjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.net.URISyntaxException;
import java.util.Properties;

import com.shopex.hprose.server.Base;
import com.shopex.hprose.server.Services;
import com.shopex.hprose.server.TagGroup;

import etcd.EtcdUtil;
import hprose.server.HproseTcpServer;

public class StartMain {
	
	private static HproseTcpServer server = null;
	public static void main(String[] args) throws IOException, URISyntaxException {
		Properties props = new Properties();
        InputStream in = new BufferedInputStream (new FileInputStream("src/main/java/server.properties"));
        
        props.load(in);
		try {
			EtcdUtil c = new EtcdUtil(props.getProperty ("etcdserver"));
			c.puttmp(props.getProperty ("etcdservernode"), "ok");
//			c.puttmp("/luban/nodes/javamember/192.168.199.245:8088", "ok");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		server = new HproseTcpServer(props.getProperty ("hproseserver"));
		in.close();
//		server = new HproseTcpServer("tcp://192.168.199.245:8088");
		Services ss = new Services();
		server.add("doc", ss);
		
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
        server.start();
	}
	
	
}
