package com.distributed.lock;

import java.util.concurrent.TimeUnit;

/**
 * Created by sunyujia@aliyun.com on 2016/2/26.
 */
public interface DistributedReentrantLock {
     boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException;

     void unlock();
}
