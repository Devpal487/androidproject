package com.dreams.chat.activities;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.dreams.chat.R;

import java.util.ArrayList;
import java.util.HashSet;

public class PostpageActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView catCount,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
    //lateinit var categorySet:HashSet<String>
    HashSet<String> list = new HashSet<String>();
    public TextView textView;
    public TextView statename_view;
    ArrayList<String> statearrayList;
    Dialog dialog;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postpage);
        catCount=findViewById(R.id.catCount);
         t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        t7=findViewById(R.id.t7);
        t8=findViewById(R.id.t8);
        t9=findViewById(R.id.t9);
        t10=findViewById(R.id.t10);
        t11=findViewById(R.id.t11);
        t12=findViewById(R.id.t12);
        t13=findViewById(R.id.t13);
        t14=findViewById(R.id.t14);
        t15=findViewById(R.id.t15);
        t16=findViewById(R.id.t16);
        stateviewbind();
        //categorySet=HashSet();
        t1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t1.getText().toString())) {
                        System.out.println("Not Unique Item");

                        list.remove(t1.getText().toString());
                        t1.setBackgroundResource(R.drawable.rounded_corner);
                        // Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t1.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        //list.add(t1.getText().toString());

                        System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();
                    }
                    catCount.setText("+" + list.size());
                }
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t2.getText().toString())) {
                        t2.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t2.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t2.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t2.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();

                    }
                    catCount.setText("+" + list.size());
                }
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t3.getText().toString())) {
                        t3.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t3.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t3.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t3.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();

                    }
                    catCount.setText("+" + list.size());
                }
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t4.getText().toString())) {
                        t4.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t4.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t4.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t4.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();

                    }
                    catCount.setText("+" + list.size());
                }
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t5.getText().toString())) {
                        t5.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t5.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t5.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t5.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();

                    }
                    catCount.setText("+" + list.size());
                }
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t6.getText().toString())) {
                        t6.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t6.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t6.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t6.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();

                    }
                    catCount.setText("+" + list.size());
                }
            }
        });

        t7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t7.getText().toString())) {
                        t7.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t7.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t7.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t7.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();

                    }
                    catCount.setText("+" + list.size());
                }
            }
        });

        t8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t8.getText().toString())) {
                        t8.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t8.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t8.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t8.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();

                    }
                    catCount.setText("+" + list.size());
                }
            }
        });

        t9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t9.getText().toString())) {
                        t9.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t9.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t9.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t9.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();
                    }
                    catCount.setText("+" + list.size());
                }
            }
        });

        t10.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t10.getText().toString())) {
                        t10.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t10.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t10.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t10.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();
                    }
                    catCount.setText("+" + list.size());
                }
            }
        });

        t11.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t11.getText().toString())) {
                        t11.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t11.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t11.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t11.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();

                    }
                    catCount.setText("+" + list.size());
                }
            }
        });

        t12.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t12.getText().toString())) {
                        t12.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t12.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t12.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t12.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();

                    }
                    catCount.setText("+" + list.size());
                }
            }
        });

        t13.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t13.getText().toString())) {
                        t13.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t13.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t13.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t13.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();

                    }
                    catCount.setText("+" + list.size());
                }
            }
        });

        t14.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t14.getText().toString())) {
                        t14.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t14.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t14.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t14.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();
                    }
                    catCount.setText("+" + list.size());
                }
            }
        });

        t15.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t15.getText().toString())) {
                        t15.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t15.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t15.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t15.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();
                    }
                    catCount.setText("+" + list.size());
                }
            }
        });
        t16.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(list.size()>2){
                    Toast.makeText(getApplicationContext(), "Selected Limit Over!", Toast.LENGTH_LONG).show();
                }else {
                    if (!list.add(t16.getText().toString())) {
                        t16.setBackgroundResource(R.drawable.rounded_corner);
                        list.remove(t16.getText().toString());
                        //System.out.println("Not Unique Item");
                        //Toast.makeText(getApplicationContext(), "Already Saved!", Toast.LENGTH_LONG).show();
                    } else {
                        t16.setBackgroundResource(R.drawable.rounded_corner_deactive);
                        list.add(t16.getText().toString());
                        // System.out.println("Unique Entry Added");
                        //Toast.makeText(getApplicationContext(), "Saved To Items.", Toast.LENGTH_LONG).show();

                    }
                    catCount.setText("+" + list.size());
                }
            }
        });
        findViewById(R.id.submit_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PostpageActivity.this, PrivacyPolicyActivity.class));
                finish();
            }
        });
    }

    private void stateviewbind() {
        setContentView(R.layout.activity_postpage);
        textView=findViewById(R.id.statename_view);
        statearrayList =new ArrayList<>();
        statearrayList.add("Andhra Pradesh");
        statearrayList.add("Arunachal Pradesh");
        statearrayList.add("Assam");
        statearrayList.add("Bihar");
        statearrayList.add("Chhattisgarh");
        statearrayList.add("Goa");
        statearrayList.add("Gujarat");
        statearrayList.add("Haryana");
        statearrayList.add("Himachal Pradesh");
        statearrayList.add("Jammu And Kashmir");
        statearrayList.add("Jharkhand");
        statearrayList.add("Karnataka");
        statearrayList.add("Kerala");
        statearrayList.add("Madhya Pradesh");
        statearrayList.add("Maharashtra");
        statearrayList.add("Manipur");
        statearrayList.add("Meghalaya");
        statearrayList.add("Mizoram");
        statearrayList.add("Nagaland");
        statearrayList.add("Odisha");
        statearrayList.add("Punjab");
        statearrayList.add("Rajasthan");
        statearrayList.add("Sikkim");
        statearrayList.add("Tamil Nadu");
        statearrayList.add("Telangana");
        statearrayList.add("Tripura");
        statearrayList.add("Uttar Pradesh");
        statearrayList.add("Uttarakhand");
        statearrayList.add("West Bengal");

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog=new Dialog(PostpageActivity.this);
                dialog.setContentView(R.layout.dialog_state_searchable_spnner);
                dialog.getWindow().setLayout(850,1000);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

                EditText editText=dialog.findViewById(R.id.edit_text_state);
                ListView listView=dialog.findViewById(R.id.list_view_state);
                ArrayAdapter<String> adapter=new ArrayAdapter<>(PostpageActivity.this,android.R.layout.simple_list_item_1,statearrayList);
                listView.setAdapter(adapter);
                editText.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        adapter.getFilter().filter(s);
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        textView.setText(adapter.getItem(position));
                        dialog.dismiss();
                    }
                });
            }
        });

        //setContentView(TextUtils.isEmpty(phoneNumberInPrefs) ? R.layout.activity_sign_in_1 : R.layout.activity_sign_in_2);
    }
}