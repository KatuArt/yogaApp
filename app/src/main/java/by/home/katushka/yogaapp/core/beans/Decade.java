package by.home.katushka.yogaapp.core.beans;

import java.util.Queue;

import by.home.katushka.yogaapp.core.base.BaseBean;

/**
 * Created by Katushka on 16.07.2015.
 */
public class Decade extends BaseBean {
    public Queue<AsanaBean> asanas;
    public long dayQnty;
    public long number;

    public Decade(Queue<AsanaBean> asanas, long dayQnty, long number) {
        this.asanas = asanas;
        this.dayQnty = dayQnty;
        this.number = number;
    }
}
