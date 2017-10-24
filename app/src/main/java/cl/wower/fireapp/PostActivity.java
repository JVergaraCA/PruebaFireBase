package cl.wower.fireapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PostActivity extends AppCompatActivity {

    private EditText postTitle;
    private EditText postDescription;
    private ProgressDialog progressDialog;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        load();
    }

    private void load() {
        progressDialog =new ProgressDialog(this);

        postTitle = (EditText) findViewById(R.id.titleField);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("Post");

    }

    public void post(View view) {


        progressDialog.setMessage("Compartiendo...");
        progressDialog.show();

        final String title_val = postTitle.getText().toString().trim();




        if (!TextUtils.isEmpty(title_val) && !TextUtils.isEmpty(title_val)) {


                    DatabaseReference newPost = databaseReference.push();


                    newPost.child("title").setValue(title_val);



                    progressDialog.dismiss();
                    startActivity(new Intent(PostActivity.this,MainActivity.class));


        }


    }
}
