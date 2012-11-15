package com.example.listviewdemo;

import java.util.ArrayList;

public class TaskArry
{
	private static TaskArry instance = null;
	private static ArrayList<TaskItem> theList;

	private TaskArry()
	{
		theList = new ArrayList<TaskItem>();
		
	}

	public TaskArry getInstance()
	{
		if(instance != null)
		{
			instance = new TaskArry();
		}
		return instance;
	}
	
	public void addItem(String name, String dis)
	{
		theList.add(new TaskItem(name,dis));
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