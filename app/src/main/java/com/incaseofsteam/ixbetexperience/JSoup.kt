package com.incaseofsteam.ixbetexperience

import android.content.Context
import com.incaseofsteam.ixbetexperience.Constants.Campaign1
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class JSoup(val context: Context) {
    private var jsoup: String? = "null"
    private val hawk : String? = Hawk.get(Campaign1)

    private var forJsoupSetNaming: String = Constants.FilterURL + Constants.subber1 + hawk
    suspend fun getDocSecretKey(): String?{
        withContext(Dispatchers.IO){
            val doc = Jsoup.connect(forJsoupSetNaming).get()
            jsoup = doc.text().toString()
        }
        return jsoup
    }
}