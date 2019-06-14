package com.example.gallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final String images_titles[] = {

            "Image 1",
            "Image 2",
            "Image 3",
            "Image 4",
            "Image 5",
            "Image 6",
            "Image 7",
            "Image 8",
            "Image 9",
            "Image 10"
    };
    private final Integer image_ids[] = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
            R.drawable.pic9,
            R.drawable.pic10
    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.gallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 3);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Cell> cells = prepareData();
        MyAdapter adapter = new MyAdapter(getApplicationContext(), cells);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Cell> prepareData(){
        ArrayList<Cell> theimage = new ArrayList<>();
        for (int i = 0; i < images_titles.length; i++){
            Cell cell = new Cell();
            cell.setTitle(images_titles[i]);
            cell.setImg(image_ids[i]);
            theimage.add(cell);
        }
        return theimage;
    }
}
