package com.reihan.latihanarka1.webview

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.reihan.latihanarka1.R
import com.reihan.latihanarka1.databinding.ActivitySimpleWebViewBinding

class SimpleWebViewActivity : AppCompatActivity(), WebViewListener {

    private lateinit var binding : ActivitySimpleWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_web_view)

        binding.webView.loadUrl("https://mojok.co")


        binding.webView.webChromeClient = jajalChromeClient(this)
        binding.webView.webViewClient = jajalCLient(this)

    }

    class jajalChromeClient(private val listener: WebViewListener) : WebChromeClient() {
        override fun onProgressChanged(view: WebView?, newProgress: Int) {
            listener.onProgressChange(newProgress)
            super.onProgressChanged(view, newProgress)
        }
    }

    class jajalCLient(private val listener: WebViewListener) : WebViewClient() {
        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            super.onPageStarted(view, url, favicon)
            listener.onPageStarted()
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            listener.onPageFinish()
        }

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            listener.onShouldOverrideUrl(url.orEmpty())
            return super.shouldOverrideUrlLoading(view, url)
        }

        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            listener.onShouldOverrideUrl(request?.url?.toString().orEmpty())
            return super.shouldOverrideUrlLoading(view, request)
        }

    }

    override fun onPageStarted() {
        binding.progressBar.visibility = View.VISIBLE
        Toast.makeText(this, "PageStarted", Toast.LENGTH_SHORT).show()

    }

    override fun onPageFinish() {
        binding.progressBar.visibility = View.GONE
    }

    override fun onShouldOverrideUrl(redirectUrl: String) {
        Toast.makeText(this, "redirect url : $redirectUrl", Toast.LENGTH_SHORT ).show()
    }

    override fun onProgressChange(progress: Int) {
        binding.progressBar.progress = progress
    }
}