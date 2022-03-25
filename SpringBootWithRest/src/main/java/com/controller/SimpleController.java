package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
public class SimpleController {
	
	@RequestMapping(value="/say")
	public String sayHello() {
		return "Welcome to simple spring boot REST API";
	}
	@RequestMapping(value="/sayHtml",produces=MediaType.TEXT_HTML_VALUE)
	public String sayHtml(){
		return "<h1>Welcome to Simple message</h1>";
	}
	@RequestMapping(value="/sayText",produces=MediaType.TEXT_PLAIN_VALUE)
	public String sayPlainText(){
		return "<h1>Welcome to Simple message</h1>";
	}
	@RequestMapping(value="/sayXml",produces=MediaType.TEXT_XML_VALUE)
	public String sayXml(){
		return "<h1>Welcome to Simple message</h1>";

}
	@RequestMapping(value="/empInfo", produces=MediaType.APPLICATION_PROBLEM_JSON_VALUE)
	public Employee getEmployee() {
		Employee emp=new Employee(10,"Laxmi",12000);
		return emp;
	}
}
