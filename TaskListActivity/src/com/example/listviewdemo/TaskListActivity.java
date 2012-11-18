package com.example.listviewdemo;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.view.View;

public class TaskListActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		//GetSearchResults();
		final taskListAdapter adapter = new taskListAdapter(this, TaskArry.getInstance());
		final ListView lv1 = (ListView) findViewById(R.id.listView1);
		lv1.setAdapter(adapter);
		/*lv1.setOnLongClickListener(new OnLongClickListener() 
		{

			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				return false;
			}
		});*/
		lv1.setOnItemClickListener(new OnItemClickListener() 
		{
			public void onItemClick(AdapterView<?> a, View v, int position,long id) 
			{
				Object o = lv1.getItemAtPosition(position);
				TaskItem obj_taskItem = (TaskItem) o;
				Toast.makeText(
						TaskListActivity.this,
						"You have chosen : " + " " + obj_taskItem.getTaskName(),
						Toast.LENGTH_LONG).show();
				
			}
			
		});
		
		/*lv1.setOnTouchListener(new OnTouchListener() 
		{
			
			float historicX = Float.NaN;
			final int TRIGGER_DELTA = 150;
			Button bt = (Button) findViewById(R.id.delTask);
			public boolean onTouch(View v, MotionEvent event) 
			{
				switch (event.getAction())
				{
					case MotionEvent.ACTION_DOWN:
						historicX = event.getX();
				        break;
					case  MotionEvent.ACTION_UP:
						if ((event.getX() - historicX) < TRIGGER_DELTA) 
						{
							
							bt.setVisibility(View.INVISIBLE);
							adapter.notifyDataSetChanged();
							
						}
						else if ((event.getX() - historicX) > TRIGGER_DELTA) 
						{
							
							bt.setVisibility(View.VISIBLE);
							adapter.notifyDataSetChanged();
							
						}
						break;
				            
				}
				return false;
			}
		});*/
	
		Button addTask = (Button) findViewById(R.id.addTaskButtonMain);
		addTask.setOnClickListener(new OnClickListener()
		{
				
			public void onClick(View v) 
			{
				Intent intent = new Intent(v.getContext(),AddTaskActivity.class);
				startActivity(intent);
				
			}
			
			
		});
	}
	
	public void onResume()
	{
		super.onResume();
		final ListView lv1 = (ListView) findViewById(R.id.listView1);
		lv1.setAdapter(new taskListAdapter(this, TaskArry.getInstance()));
	}
	

	/*private void GetSearchResults() 
	{
		
		TaskItem item_details = new TaskItem();
		item_details.setTaskName("Clean toilet");
		item_details.setTaskDescription("Spicy Chiken Pizza case");
		
		TaskArry.getInstance().addItem(item_details.getTaskName(),item_details.getTaskDescription());
		
		 
		item_details = new TaskItem();
		item_details.setTaskName("Wash hands");
		item_details.setTaskDescription("After cleaning the toilet");

		TaskArry.getInstance().addItem(item_details.getTaskName(),item_details.getTaskDescription());
		 
		item_details = new TaskItem();
		item_details.setTaskName("Eat something");
		item_details.setTaskDescription("Not Spicy Chiken Pizza");

		TaskArry.getInstance().addItem(item_details.getTaskName(),item_details.getTaskDescription());
		
		
		
	
	}*/

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_task_list, menu);
		return true;
	}
}
