package org.Seminar2.classTask1.model;

import java.util.List;

public interface MarketBehavior {
    public void acceptToMarket(Human human);
    public void releaseFromMarket(Human human);
    public void update();

}
