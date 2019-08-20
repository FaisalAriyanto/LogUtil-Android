package pkp.map.errorutil;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

public class LogError {
    public static void e(String message) {
        Log.e("HUHUHU", message);
    }

    public static void navigate(Activity activity) {
        activity.startActivity(new Intent(activity, MainErrorActivity.class));
    }
}
