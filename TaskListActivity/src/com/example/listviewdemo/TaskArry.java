package com.example.listviewdemo;

import java.util.ArrayList;

public class TaskArry
{
	private static TaskArry instance ;
	private ArrayList<TaskItem> theList = new ArrayList<TaskItem>();

	private TaskArry()
	{

	}

	public static TaskArry getInstance()
	{
		if(instance == null)
		{
			instance = new TaskArry();
		}
		return instance;
	}
	
	public void addItem(String name, String dis)
	{
		theList.add(new TaskItem(name,dis));
	}
	
	public void addItem(TaskItem obj)
	{
		theList.add(new TaskItem(obj));
	}
	
	public TaskItem getItem(int index)
	{
		return theList.get(index);
	}
	
	public int getSize()
	{
		return theList.size();
	}
	
}