package com.khnkoyan.carapplication.json;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonA {

    public static String a() {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        try {

//            JSONObject jsonUser = new JSONObject();
            jsonObject.put("name", "Artur");
            jsonObject.put("age", 26);
            jsonArray.put(jsonObject);
            jsonObject = new JSONObject();
            jsonObject.put("name", "Davo");
            jsonObject.put("age", 26);
            jsonArray.put(jsonObject);
            Log.i("a", "jsonArray: " + jsonArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonArray.toString();
    }
}
