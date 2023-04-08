package org.Seminar2.classTask1.model;

public interface QueueBehavior {
    public void takeQueue(Human human);

    public void takeOrders();

    public void giveOrders();

    public void releaseFromQueue();
}
