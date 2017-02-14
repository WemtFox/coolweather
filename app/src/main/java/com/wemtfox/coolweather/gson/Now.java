package com.wemtfox.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wangqihao on 2017/2/13.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
