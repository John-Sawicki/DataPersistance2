package app.cominjohnsawickitrkhp_identity_photo.linkedin.httpswww.datapersistance2.ui.ui.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class AppSettings {
    SharedPreferences mSharedPreferences;
    public AppSettings(Context context){
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }
    public String getStoragePreference(){
        return mSharedPreferences.getString("Storage", StorageType.INTERNAL)
    }
}
