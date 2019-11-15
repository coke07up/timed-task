package com.cokes.timed.dto;

import com.cokes.timed.constant.TipContentEnum;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RobotTipReq {

    @SerializedName("msgtype")
    private String msgType;
    private TipText text;

    /**
     * 默认文本类型
     */
    public RobotTipReq(){
        this.msgType = "text";
        this.text = new TipText();
}

    @Data
    public static class TipText {
        private String content;
        @SerializedName("mentioned_list")
        private List<String> mentionedList;

        /**默认@all*/
        public TipText(){
            this.mentionedList = new ArrayList<>();
            mentionedList.add("@all");
        }
    }

    public static RobotTipReq getInstance(TipContentEnum tipContentEnum) {
        RobotTipReq robotTipReq = new RobotTipReq();
        robotTipReq.getText().setContent(tipContentEnum.getContent());
        return robotTipReq;
    }
}
