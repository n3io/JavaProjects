package com.n3io.unittesting.unittesting.business;

import com.n3io.unittesting.unittesting.data.SomeDataService;
import org.springframework.beans.factory.annotation.Autowired;

public class SomeBusinessImpl {



    private SomeDataService someDataService;

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    public int calculateSum(int[] data){
        int sum = 0;
        for (int value : data) sum += value;
        return sum;
    }

    public int calculateSumUsingDataService(){
        int sum = 0;
        int[] data = someDataService.retrieveAllData();
        for (int value : data) sum += value;
        return sum;
    }
}
