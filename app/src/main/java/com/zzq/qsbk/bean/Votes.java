package com.zzq.qsbk.bean;

/**
 * Created by 朱志强 on 2017/4/21.
 * 点赞 顶 踩
 */

public class Votes {
        /**
         * down : -10
         * up : 81
         */

    private int down;
    private int up;

    public void setDown(int down) {
        this.down = down;
    }

    public void setUp(int up) {
        this.up = up;
    }

    public int getDown() {
        return down;
    }

    public int getUp() {
        return up;
    }

    @Override
    public String toString() {
        return "Votes{" +
                "down=" + down +
                ", up=" + up +
                '}';
    }
}