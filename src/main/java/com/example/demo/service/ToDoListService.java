package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;

import java.util.ArrayList;
import java.util.List;    

@Service    
public class ToDoListService {

@Autowired    
private TaskRepository taskRepository;    
public List<Task> getAllTask()  
{    
List<Task>tasks = new ArrayList<>();    
taskRepository.findAll().forEach(tasks::add);    
return tasks;    
}    

public void addUser(Task task)  
{    
taskRepository.save(task);    
}   
}
