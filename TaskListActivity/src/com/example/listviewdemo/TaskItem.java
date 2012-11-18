package com.example.listviewdemo;

import java.util.Date;

public class TaskItem implements Comparable<TaskItem>
{
	private String taskName;
	private String taskDescription;
	private Date taskCreateDate;
	
	public TaskItem(String name, String dis)
	{	
		setTaskName(name);
		setTaskDescription(dis);
		setTaskCreateDate();
		
	}
	public TaskItem(TaskItem obj)
	{	
		setTaskName(obj.getTaskName());
		setTaskDescription(obj.getTaskDescription());
		setTaskCreateDate();
		
	}

	public TaskItem() {}

	public String getTaskName()
	{
		return taskName;
	}

	public void setTaskName(String taskName)
	{
		this.taskName = taskName;
	}

	public String getTaskDescription()
	{
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription)
	{
		this.taskDescription = taskDescription;
	}
	public Date getTaskCreateDate() 
	{
		return taskCreateDate;
	}
	
	public void setTaskCreateDate()
	{
		this.taskCreateDate = new Date(System.currentTimeMillis());
	}
	public int compareTo(TaskItem obj) 
	{
		if (getTaskCreateDate() == null || obj.getTaskCreateDate() == null)
		      return 0;
		
		return getTaskCreateDate().compareTo(obj.getTaskCreateDate());
	}
}