package controller;

import model.Generator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by WinHan on 13/3/17.
 */
public class CollectionFilterTest {

    private CollectionFilter collectionFilter;
    private List<Integer> rangeList;
    private List<Generator> totalCollection;

    @Before
    public void setup(){
        collectionFilter = new CollectionFilter();
        totalCollection = new ArrayList<>();
        totalCollection.add(new Generator(1));
        totalCollection.add(new Generator(3));
        totalCollection.add(new Generator(4999));
        getRangeList();

    }

    @Test
    public void testFilterAll(){
        List<Generator> selfNumbers= collectionFilter.filerAll(totalCollection);
        Assert.assertEquals(1,selfNumbers.get(0).getNumber());
        Assert.assertEquals(3,selfNumbers.get(1).getNumber());
        Assert.assertEquals(4999,selfNumbers.get(2).getNumber());
        Assert.assertEquals(3,selfNumbers.size());
    }



    private void getRangeList(){
        rangeList = new ArrayList<>();
        for(int i=0;i<5000;i++){
            rangeList.add(i+1);
        }
    }

}