package com.cokes.timed.constant;

public enum TipContentEnum {

    MORNING_TIP_CONTENT("记得带装备~，今天有跑步活动！"),
    AFTERNOON_TIP_CONTENT("准备出发跑步了！~"),
    EAT_TIP_CONTENT("吃饭了！go ~");
    private String content;
    TipContentEnum (String content) {
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
