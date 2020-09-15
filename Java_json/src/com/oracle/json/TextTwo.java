package com.oracle.json;

import java.util.List;

import com.alibaba.fastjson.JSON;

// json --  java
public class TextTwo {
	public static void main(String[] args) {
		jsonToObject();
		jsonToList();
		jsonToObjects();
	}
	
	// json 转简单Java
	public static void jsonToObject(){
		String str ="{'name':'dmego','password':'123456'}";
		User  user  = JSON.parseObject(str, User.class);
		System.out.println(user);
		
		
	}
	
	// json 转list<user>
	
	public static void jsonToList(){
		String str ="[{'name':'zhangsan','password':'123123'},{'name':'lisi','password':'321321'}]";
		List<User> list =  JSON.parseArray(str,User.class);
		System.out.println(list);
		
		
	}
	
	// json转复杂java对象
	public static void jsonToObjects(){
	String str ="{'name':'aa','users':[{'name':'zhangsan','password':'123123'},{'name':'lisi','password':'321321'}]}";
	UserGroup user = JSON.parseObject(str, UserGroup.class);
	System.out.println(user);
	
	}
	

}
