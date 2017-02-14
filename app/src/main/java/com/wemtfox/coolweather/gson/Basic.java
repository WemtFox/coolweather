package com.wemtfox.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wangqihao on 2017/2/13.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
