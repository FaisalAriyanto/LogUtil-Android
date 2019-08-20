package pkp.map.logutilexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import pkp.map.logutil.LogDebug
import pkp.map.logutil.LogDebug3

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogDebug().d("huhuhu")
    }
}
