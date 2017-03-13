package controller;

import model.Generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WinHan on 13/3/17.
 */
public class SumController implements Controller {

    private int total;
    private Map<Integer,List<Generator>> splitterMap;
    private GeneratorCollector generatorCollector;

    public SumController(){
        splitterMap = new HashMap<>();
        generatorCollector = GeneratorCollector.getInstance();
    }

    @Override
    public void calculate (Map<Integer,List<Generator>> splitterMap) {

        for(int originNumber: splitterMap.keySet()) {
            total = originNumber;
            List<Generator> generators = splitterMap.get(originNumber);
            for (Generator generator : generators) {
                    total = total + generator.getNumber();
                }
                generatorCollector.collect(new Generator(total));
            }

    }

    @Override
    public Map<Integer, List<Generator>> split(String numbers) {

        String[] numbersList = numbers.split("(?<=.)");
        ArrayList<Generator> generators = new ArrayList<>();
        //getting split numbers
        for(String number: numbersList){
            Generator generator = new Generator(Integer.parseInt(number));
            generators.add(generator);
        }

        splitterMap.put(Integer.parseInt(numbers),generators);
        return splitterMap;

    }

    /**
     * to empty the splitter Map
     */
    public void flushMap(){
        splitterMap = new HashMap<>();
    }

    /**
     * get the splitter Map
     * @return
     */
    public Map<Integer, List<Generator>> getSplitterMap() {
        return splitterMap;
    }
}
