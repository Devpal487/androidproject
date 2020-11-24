package com.dreams.chat.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.dreams.chat.R;
import com.dreams.chat.fragments.BaseFullDialogFragment;

public class PrivacyPolicyActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private WebView webView;
    private Context context;
    private TextView tvPrivacyPolicy;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setHasOptionsMenu(true);

    }
    /*@Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }*/

    @Nullable
    //@Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_privacy, container);

        initViews(view);

        getHtml(tvPrivacyPolicy);

        return view;
    }

    private void getHtml( TextView textView){
        String html = getResources().getString(R.string.privacy_policy_html);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {

            textView.setText(Html.fromHtml(html, Html.FROM_HTML_MODE_COMPACT));
        } else {
            textView.setText(Html.fromHtml(html));
        }
    }

    private void initViews(View view) {


        tvPrivacyPolicy = view.findViewById(R.id.tv_privacy_policy);

    }
/*
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        webView = findViewById(R.id.webView);
        progressBar = findViewById(R.id.progressBar);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(getString(R.string.privacy_policy_url));

        findViewById(R.id.accept).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PrivacyPolicyActivity.this, MainActivity.class));
                finish();
            }
        });
    }
*/

  /*  public class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            progressBar.setVisibility(View.GONE);
        }
    }*/
}