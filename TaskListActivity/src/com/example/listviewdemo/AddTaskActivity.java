package com.example.listviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AddTaskActivity extends Activity
{
	EditText addText;
	EditText addDis;
	taskListAdapter adapter;
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_task);
		Button addBT = (Button) findViewById(R.id.buttonAdd);
		addText = (EditText)findViewById(R.id.editTextTaskName);
		addDis = (EditText)findViewById(R.id.editTextTaskDisc);
		adapter = new taskListAdapter(this, TaskArry.getInstance());
		addBT.setOnClickListener(new OnClickListener()
		{
			
			public void onClick(View v) 
			{
				TaskItem obj =new TaskItem();
				obj.setTaskName(addText.getText().toString());
				obj.setTaskDescription(addDis.getText().toString());
				adapter.addItem(obj);
				//return and recreate task list activity
				/*Intent intent = new Intent(v.getContext(),TaskListActivity.class);
				startActivity(intent);*/
				//clear data and use onresume when back button is pressed
				addText.setText("");
				addDis.setText("");
				
				
			}
		});
	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_task_list, menu);
		return true;
	}
}
