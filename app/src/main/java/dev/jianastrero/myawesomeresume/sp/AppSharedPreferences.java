package dev.jianastrero.myawesomeresume.sp;

import android.content.Context;
import android.content.SharedPreferences;

public class AppSharedPreferences {

    private static final String PREF_NAME = "app_prefs";

    private static final String KEY_IS_LOGGED_IN = "is_logged_in";
    private static final String KEY_PRIMARY_COLOR = "primary_color";

    private SharedPreferences sp;

    public AppSharedPreferences(Context context) {
        sp = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public boolean getIsLoggedIn() {
        return sp.getBoolean(KEY_IS_LOGGED_IN, false);
    }

    public String getPrimaryColor() {
        return sp.getString(KEY_PRIMARY_COLOR, "#000000");
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        sp.edit()
                .putBoolean(KEY_IS_LOGGED_IN, isLoggedIn)
                .apply();
    }

    public void setPrimaryColor(String primaryColor) {
        sp.edit()
                .putString(KEY_PRIMARY_COLOR, primaryColor)
                .apply();
    }

}
