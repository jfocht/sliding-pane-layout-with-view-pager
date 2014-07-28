package com.example;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class HeirarchicalPageView extends Activity
{
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ColorPagingFragment f = new ColorPagingFragment();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction tx = manager.beginTransaction();
        tx.replace(R.id.fragment, f);
        tx.addToBackStack(null);
        tx.commit();
    }

}
