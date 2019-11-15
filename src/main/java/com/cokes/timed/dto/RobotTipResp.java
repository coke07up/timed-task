package com.cokes.timed.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class RobotTipResp {

    @SerializedName("errcode")
    private int errCode;
    @SerializedName("errmsg")
    private String errMsg;

}
