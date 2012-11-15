package com.example.listviewdemo;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class taskListAdapter extends BaseAdapter
{
	ArrayList<TaskItem> myList;
	private LayoutInflater l_Inflater;
	
	static class ViewHolder 
	{
		  TextView txt_taskName;
		  TextView txt_taskDescription;
	}
	
	public taskListAdapter(Context context, ArrayList<TaskItem> results) 
	{
		
		myList = results;
		l_Inflater = LayoutInflater.from(context);
		
	}
	
	public int getCount()
	{
		return myList.size();
	}

	public TaskItem getItem(int index)
	{
		return myList.get(index);
	}

	public long getItemId(int index)
	{
		return index;
	}

	public View getView(int position, View convertView, ViewGroup parent)
	{
		ViewHolder holder;
		  if (convertView == null) 
		  {
		   convertView = l_Inflater.inflate(R.layout.activity_task_list, null);
		   holder = new ViewHolder();
		   holder.txt_taskName = (TextView) convertView.findViewById(R.id.name);
		   holder.txt_taskDescription = (TextView) convertView.findViewById(R.id.dis);
		   convertView.setTag(holder);
		  } 
		  else 
		  {
			  holder = (ViewHolder) convertView.getTag();
		  }
	   
		  holder.txt_taskName.setText(myList.get(position).getTaskName());
		  holder.txt_taskDescription.setText(myList.get(position).getTaskDescription());
		  return convertView;
	
	}

}
