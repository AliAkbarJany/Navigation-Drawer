package com.rafsan.cls277to282navigation_drawer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class InmedismFragment extends Fragment {

    WebView inmedismWebView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View myView = inflater.inflate(R.layout.fragment_inmedism, container, false);

        inmedismWebView = myView.findViewById(R.id.inmedismWebView);

        inmedismWebView.getSettings().setJavaScriptEnabled(true);
        inmedismWebView.loadUrl("https://inmedism.com/");

        if (container != null){
            container.removeAllViews();
        }

        return myView;
    }
}