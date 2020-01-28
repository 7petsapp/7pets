package com.noon.a7pets.Productscategory;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.noon.a7pets.ProductsAdapter;
import com.noon.a7pets.R;
import com.noon.a7pets.models.GenericProductModel;
import com.noon.a7pets.networksync.CheckInternetConnection;

import java.util.ArrayList;

public class DogsFoodActivity extends AppCompatActivity {

    private RecyclerView dogs_food_recycler_view;
    private StaggeredGridLayoutManager mLayoutManager;
    private ProductsAdapter productsAdapter;
    private DatabaseReference dogsFoodReference;
    private ArrayList<GenericProductModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs_food);

        new CheckInternetConnection(this).checkConnection();

        dogs_food_recycler_view = findViewById(R.id.dogs_food_recycler_view);

        if (dogs_food_recycler_view != null) {
            //to enable optimization of recyclerview
            dogs_food_recycler_view.setHasFixedSize(true);
        }

        list = new ArrayList<GenericProductModel>();

        //using staggered grid pattern in recyclerview
        mLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        dogs_food_recycler_view.setLayoutManager(mLayoutManager);
        dogs_food_recycler_view.setHasFixedSize(true);
        fetch();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Dogs Food");
    }

    private void fetch() {
        dogsFoodReference = FirebaseDatabase.getInstance().getReference().child("dogs").child("dogs food");

        dogsFoodReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//                for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){
                if (dataSnapshot.exists()){
                    GenericProductModel g = dataSnapshot.getValue(GenericProductModel.class);
                    list.add(g);
                }
                productsAdapter = new ProductsAdapter(DogsFoodActivity.this, list);
                dogs_food_recycler_view.setAdapter(productsAdapter);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //To support reverse transition when user clicks the action bar's Up/Home button
            case android.R.id.home:
                supportFinishAfterTransition();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
