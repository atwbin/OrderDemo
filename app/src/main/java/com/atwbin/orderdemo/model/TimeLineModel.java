package com.atwbin.orderdemo.model;

/**
 * 时间轴的事件定义
 *
 */
public class TimeLineModel {
    private String event;
    private String time;
   private String name;
    public TimeLineModel(String event, String time,String name) {
        this.event = event;
        this.time = time;
        this.name = name;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
