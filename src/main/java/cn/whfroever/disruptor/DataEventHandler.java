package cn.whfroever.disruptor;

import com.lmax.disruptor.EventHandler;

/**
 * 消费者事件1
 * @author wuhf
 * @Date 2018/8/14 16:21
 **/
public class DataEventHandler implements EventHandler<DataEvent> {
    @Override
    public void onEvent(DataEvent dataEvent, long l, boolean b) throws Exception {
        System.out.println("Event: " + dataEvent.getValue());
    }
}
