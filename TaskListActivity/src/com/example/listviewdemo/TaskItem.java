package com.example.listviewdemo;

public class TaskItem
{
	private String taskName;
	private String taskDescription;
	
	public TaskItem(String name, String dis)
	{	
		setTaskName(name);
		setTaskDescription(dis);
		
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
}