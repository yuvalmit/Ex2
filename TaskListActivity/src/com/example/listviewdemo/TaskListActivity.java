package com.example.listviewdemo;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import android.view.Menu;
import android.widget.ListView;
import android.view.View;

public class TaskListActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ArrayList<TaskItem> task_details = GetSearchResults();
		final ListView lv1 = (ListView) findViewById(R.id.listView1);
		lv1.setAdapter(new taskListAdapter(this, task_details));
		lv1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> a, View v, int position,
					long id) {
				Object o = lv1.getItemAtPosition(position);
				TaskItem obj_taskItem = (TaskItem) o;
				Toast.makeText(
						TaskListActivity.this,
						"You have chosen : " + " " + obj_taskItem.getTaskName(),
						Toast.LENGTH_LONG).show();
			}
		});
	}

	private ArrayList<TaskItem> GetSearchResults() 
	{
		ArrayList<TaskItem> results = new ArrayList<TaskItem>();
		TaskItem item_details = new TaskItem();
		item_details.setTaskName("Clean toilet");
		item_details.setTaskDescription("Spicy Chiken Pizza case");

		results.add(item_details);
		 
		item_details = new TaskItem();
		item_details.setTaskName("Wash hands");
		item_details.setTaskDescription("After cleaning the toilet");

		results.add(item_details);
		 
		item_details = new TaskItem();
		item_details.setTaskName("Eat something");
		item_details.setTaskDescription("Not Spicy Chiken Pizza");

		results.add(item_details);
		 
		 
		 
		return results;
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_task_list, menu);
		return true;
	}
}
