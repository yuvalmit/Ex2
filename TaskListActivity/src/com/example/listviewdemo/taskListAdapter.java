package com.example.listviewdemo;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class taskListAdapter extends BaseAdapter
{
	TaskArry myList;
	private LayoutInflater l_Inflater;
	
	static class ViewHolder 
	{
		  TextView txt_taskName;
		  TextView txt_taskDescription;
	}
	
	public taskListAdapter(Context context, TaskArry task_details) 
	{
		
		myList = task_details;
		l_Inflater = LayoutInflater.from(context);
		
	}
	
	public void addItem(TaskItem obj)
	{
		myList.addItem(obj);
	}
	
	public int getCount()
	{
		return myList.getSize();
	}

	public TaskItem getItem(int index)
	{
		return myList.getItem(index);
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
	   
		  holder.txt_taskName.setText(myList.getItem(position).getTaskName());
		  holder.txt_taskDescription.setText(myList.getItem(position).getTaskDescription());
		  return convertView;
	
	}

}
