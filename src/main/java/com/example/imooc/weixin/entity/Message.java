package com.example.imooc.weixin.entity;

/**
 * 
 * 消息实体
 */
public class Message {

	private String 	id; 		//主键
	private String 	command;    //指令
	private String 	description;//描述
	private String 	content;    //内容
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
