package kr.co.woobi.imyeon.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(this,3);
        MyRecyclerView myRecyclerView=new MyRecyclerView();

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myRecyclerView);
    }
}
