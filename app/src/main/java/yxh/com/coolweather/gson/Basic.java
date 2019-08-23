package yxh.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

   /***
    "baseic":{
              "city":"苏州",
              "id":"CN101190401",
              "update":{
                   "loc":"2016-08-08  21:58"
                }
    }
    **/


    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
