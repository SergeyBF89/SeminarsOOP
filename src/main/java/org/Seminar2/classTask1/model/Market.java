package org.Seminar2.classTask1.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehavior, MarketBehavior{
    List<Buyer> list = new ArrayList<>();
    Queue<Buyer> queue = new LinkedList<>();

    @Override
    public void acceptToMarket(Human human) {
        list.add(human);
    }

    @Override
    public void releaseFromMarket(Human human) {
        list.remove(human);
    }

    @Override
    public void update() {

    }

    @Override
    public void takeQueue(Human human) {
        queue.add(human);
    }

    @Override
    public void takeOrders() {
        queue.peek().setTakeOrder();
    }

    @Override
    public void giveOrders() {
        queue.peek().setMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        queue.poll();
    }
}
