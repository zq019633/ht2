package com.talkfun.cloudlive.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 时间计时器
 * Created by ccy on 2018/9/7/17:55
 */
public class CountTimeUitls {
    private ScheduledExecutorService lance;
    private long initialDelay;
    private long period;

    /**
     * 一秒为单位
     *
     * @param initialDelay
     * @param period
     */
    public CountTimeUitls(long initialDelay, long period) {
        lance = Executors.newSingleThreadScheduledExecutor();
        this.initialDelay = initialDelay;
        this.period = period;
    }

    public void startTime(Runnable runnable) {
        if (lance != null) {
            lance.scheduleAtFixedRate(runnable, initialDelay, period, TimeUnit.SECONDS);
        }
    }

    public void stopTime() {
        if (lance != null && !lance.isShutdown()) {
            lance.shutdown();
            lance = null;
        }
    }
}
