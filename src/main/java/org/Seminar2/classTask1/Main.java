package org.Seminar2.classTask1;

import org.Seminar2.classTask1.model.Buyer;
import org.Seminar2.classTask1.model.Human;
import org.Seminar2.classTask1.model.Market;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Market market = new Market();
        market.acceptToMarket(human);
        market.takeQueue(human);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
    }
}
