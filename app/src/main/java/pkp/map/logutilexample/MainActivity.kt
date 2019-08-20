package pkp.map.logutilexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import pkp.map.errorutil.LogError
import pkp.map.logutil.LogDebug

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogDebug().d("huhuhu")

        navigateBtn.setOnClickListener {
            LogError.navigate(this)
        }
    }
}
