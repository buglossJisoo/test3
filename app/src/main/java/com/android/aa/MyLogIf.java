package com.android.aa;
import android.util.Log;
import com.kt.smcp.gw.ca.gwfrwk.adap.stdsys.sdk.tcp.LogIf;

import org.apache.log4j.chainsaw.Main;

import java.util.Map;

public class MyLogIf extends LogIf {

    public static DeviceTask d = new DeviceTask(MainActivity.rows);
    public String str;
    public int n=0;
    @Override
    public void handleControlReq(Long arg0, Map<String, Double> arg1, Map<String, String> strValues) {
        // TODO Auto-generated method stub
        super.handleControlReq(arg0, arg1, strValues);

        if (strValues.size() > 0) {
            str = strValues.get("sendCmd");
            Log.d("size", "ok + str"+ str);


            if(str.equals("OFF")){
                n++;
                Log.d("off sign", "ok");


                d.connector.deactivate();
            }
        }
    }
}