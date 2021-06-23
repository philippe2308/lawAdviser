package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Task;
import com.example.demo.service.ToDoListService;

@RestController    
public class ToDoListController {


@Autowired    
private ToDoListService toDoListService;     
@RequestMapping("/")    
public List<Task> getAllUser()  
{    
return toDoListService.getAllTask();    
}       
@RequestMapping(value="/addTask", method=RequestMethod.POST)    
public void addTask(@RequestBody Task task)  
{    
	toDoListService.addTask(task);    
}       
	
}
