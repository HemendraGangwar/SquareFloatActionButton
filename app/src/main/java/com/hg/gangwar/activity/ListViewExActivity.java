package com.hg.gangwar.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hg.gangwar.R;
import com.hg.gangwar.viewMoreList.DataAdapter;

public class ListViewExActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DataAdapter mDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_ex);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mDataAdapter = new DataAdapter();
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
         recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mDataAdapter);


    }

}
