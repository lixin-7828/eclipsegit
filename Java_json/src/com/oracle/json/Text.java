package com.oracle.json;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class Text {
	public static void main(String[] args) {
		objectTOJson();
		listTOJson();
		complex();
	}
	
	public static void objectTOJson(){
		User user = new User("dmego", "123456");
		String UserJson = JSON.toJSONString(user);
		System.out.println("¼òµ¥javaÀà×ªjson×Ö·û´®:"+UserJson);
		//{"password":"123456","username":"dmego"}
		
	}
	//List<Object>×ªjson×Ö·û´®
	
		public static void listTOJson(){
			User user1 = new User("zhangsan", "123123");
			User user2 = new User("lisi", "321321");
			List<User> list = new ArrayList<User>();
			list.add(user1);
			list.add(user2);
			String ListUserJson = JSON.toJSONString(list);
			System.out.println("List<Object>×ªjson×Ö·û´®:"+ListUserJson);	
			
		}

		public static void complex(){
			User user1 = new User("zhangsan", "123123");
			User user2 = new User("lisi", "321321");
			List<User> list = new ArrayList<User>();
			list.add(user1);
			list.add(user2);
			
			UserGroup userGroup = new UserGroup("aa", list);
			String userGroupJson = JSON.toJSONString(userGroup);
			System.out.println("¸´ÔÓjavaÀà×ªjson×Ö·û´®:"+userGroupJson);
		}

}
