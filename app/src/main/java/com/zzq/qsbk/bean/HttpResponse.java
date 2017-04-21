package com.zzq.qsbk.bean;

/**
 * Created by 朱志强 on 2017/4/21.
 */

public class HttpResponse<T> {
    private int count;
    private int err;
    private T items;
    private int total;
    private int page;
    private int refresh;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getErr() {
        return err;
    }

    public void setErr(int err) {
        this.err = err;
    }

    public T getItems() {
        return items;
    }

    public void setItems(T items) {
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRefresh() {
        return refresh;
    }

    public void setRefresh(int refresh) {
        this.refresh = refresh;
    }

    @Override
    public String toString() {
        return "HttpResponse{" +
                "count=" + count +
                ", err=" + err +
                ", items=" + items +
                ", total=" + total +
                ", page=" + page +
                ", refresh=" + refresh +
                '}';
    }
}
