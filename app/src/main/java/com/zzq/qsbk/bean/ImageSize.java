package com.zzq.qsbk.bean;

import java.util.List;

/**
 * Created by 朱志强 on 2017/4/21.
 * 图片尺寸
 */

public class ImageSize {
        /**
         * s : [220,145,6285]
         * m : [640,421,77379]
         */

    private List<Integer> s;
    private List<Integer> m;

    public void setS(List<Integer> s) {
        this.s = s;
    }

    public void setM(List<Integer> m) {
        this.m = m;
    }

    public List<Integer> getS() {
        return s;
    }

    public List<Integer> getM() {
        return m;
    }

    @Override
    public String toString() {
        return "ImageSize{" +
                "s=" + s +
                ", m=" + m +
                '}';
    }
}