package pkp.map.logutil

import android.util.Log

class LogDebug {

    val TAG = "LIBRARY_TAG"

    fun d(message: String) {
        Log.d(TAG, message)
    }

}