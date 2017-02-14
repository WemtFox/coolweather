package com.wemtfox.coolweather.gson;

/**
 * Created by wangqihao on 2017/2/13.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
