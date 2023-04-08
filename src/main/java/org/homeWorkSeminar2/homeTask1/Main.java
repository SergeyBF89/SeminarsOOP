package org.homeWorkSeminar2.homeTask1;

import org.homeWorkSeminar2.homeTask1.model.DataBase;
import org.homeWorkSeminar2.homeTask1.model.UserFilter;

public class Main {
    public static void main(String[] args) {
        DataBase data = new DataBase();
        for(int i = 1; i<=40; i++){
            data.addNew(DataBase.creatRandomLaptop());
        }

        UserFilter userFilter = new UserFilter(data);
        while (userFilter.isUserHere()) {
            userFilter.askFilter();
        }
    }

}
