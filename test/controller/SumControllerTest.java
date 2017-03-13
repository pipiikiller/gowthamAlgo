package controller;

import com.sun.tools.javac.jvm.Gen;
import model.Generator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by WinHan on 13/3/17.
 */
public class SumControllerTest {

    private String numbers;
    private SumController controller;
    private Map<Integer,List<Generator>> map;


    @Before
    public void setUp() throws Exception {
        controller = new SumController();
        numbers= "23";
        map  = new HashMap<>();
        List<Generator> generators =  new ArrayList<>();
        generators.add(new Generator(2));
        generators.add(new Generator(3));
        map.put(23,generators);
    }

    @Test
    public void testSplit(){

        Map<Integer,List<Generator>> splitMap = controller.split(numbers);

        int originNumber = splitMap.keySet().iterator().next();
        Generator firstNumber  = splitMap.values().iterator().next().get(0);
        Generator secondNumber = splitMap.values().iterator().next().get(1);

        Assert.assertEquals(23,originNumber);
        Assert.assertEquals(2,firstNumber.getNumber());
        Assert.assertEquals(3,secondNumber.getNumber());


    }

    @Test
    public void testSingleSplit(){
        Map<Integer,List<Generator>> splitMap = controller.split("2");

        int originNumber = splitMap.keySet().iterator().next();
        Generator firstNumber  = splitMap.values().iterator().next().get(0);

        Assert.assertEquals(2,originNumber);
        Assert.assertEquals(2,firstNumber.getNumber());


    }

    /*@Test
    public void testCalculate(){



    }*/

}