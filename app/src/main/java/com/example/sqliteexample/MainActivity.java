package com.example.sqliteexample;

import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRv_todo;
    private FloatingActionButton mBtn_write;
    private ArrayList<TodoItem> mTodoItems;
    private DBHelper mDBHelper;
    private Customadapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInit();

    }

    private void setInit() {
        mDBHelper = new DBHelper(this);
        mRv_todo = findViewById(R.id.rv_todo);
        mBtn_write = findViewById(R.id.btn_write);
        mTodoItems = new ArrayList<>();

        loadRecentDB();

        mBtn_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog = new Dialog(MainActivity.this, android.R.style.Theme_Material_Light_Dialog);
                dialog.setContentView(R.layout.dialog_edit);
                final EditText et_title = dialog.findViewById(R.id.et_title);
                final EditText et_content = dialog.findViewById(R.id.et_content);
                Button btn_ok = dialog.findViewById(R.id.btn_ok);
                btn_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                        mDBHelper.InsertTodo(et_title.getText().toString(), et_content.getText().toString(), currentTime);

                        TodoItem item = new TodoItem();
                        item.setTitle(et_title.getText().toString());
                        item.setContent(et_content.getText().toString());
                        item.setWriteDate(currentTime);

                        mAdapter.addItem(item);

                        mRv_todo.smoothScrollToPosition(0);
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "할일 목록에 추가 되었습니다 !", Toast.LENGTH_SHORT).show();

                    }
                });
                dialog.show();
            }
        });
    }

    private void loadRecentDB() {
        mTodoItems = mDBHelper.getTodoList();
        if(mAdapter == null) {
            mAdapter = new Customadapter(mTodoItems, this);
            mRv_todo.setHasFixedSize(true);
            mRv_todo.setAdapter(mAdapter);
        }
    }
}