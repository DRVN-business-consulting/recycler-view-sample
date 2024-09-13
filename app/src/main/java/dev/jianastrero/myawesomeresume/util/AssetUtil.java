package dev.jianastrero.myawesomeresume.util;

import android.content.Context;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class AssetUtil {

    public static String getJson(Context context, String filename) {
        try {
            InputStream inputStream = context.getAssets().open(filename);

            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();

            String json = new String(buffer, StandardCharsets.UTF_8);
            return json;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
