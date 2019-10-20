package it.lukluca.androidwebview.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.jetbrains.handson.mpp.mobile.Page

import it.lukluca.androidwebview.R

private const val ARG_PAGE_URL = "pageUrl"

/**
 * A simple [Fragment] subclass.
 * Use the [WebViewFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class WebViewFragment : Fragment() {
    private var pageUrl: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            pageUrl = it.getString(ARG_PAGE_URL)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_webview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pageUrl?.let {
            val myWebView: WebView = view.findViewById(R.id.webView)
            myWebView.loadUrl(it)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *emulator
         * @param pageUrl the url to load.
         * @return A new instance of fragment WebViewFragment.
         */
        @JvmStatic
        fun newInstance(pageUrl: String) =
            WebViewFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PAGE_URL, pageUrl)
                }
            }

        @JvmStatic
        fun newFirstPageInstance() =
            newInstance(Page.THE_USELESS_WEB.url)

        @JvmStatic
        fun newSecondPageInstance() =
            newInstance(Page.BORED_BUTTON.url)

        @JvmStatic
        fun newThirdPageInstance() =
            newInstance(Page.WEIRD_CONFUSING.url)
    }

}
