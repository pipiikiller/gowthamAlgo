package controller;

import model.Generator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WinHan on 13/3/17.
 */
public class CollectionFilter {

    private List<Integer> rangeList;
    private List<Generator> seflNumbers;


    public List<Generator> filerAll(List<Generator> totalCollection){

        generateSelfNumbersListAndRangeList(5000);
        for(Generator generator:totalCollection){
            boolean found = filter(generator);
            if(found){
                seflNumbers.remove(generator);
            }
        }

        return seflNumbers;

    }

    public boolean filter(Generator generator){

        boolean found = false;
        if(rangeList.contains(generator.getNumber())){
            found = true;
        }

        return found;

    }

    public void generateSelfNumbersListAndRangeList(int range){
        seflNumbers = new ArrayList<>();
        rangeList = new ArrayList<>();

        for(int i=0;i<range;i++){
            rangeList.add(i+1);
            seflNumbers.add(new Generator(i));
        }

    }



    /**
     * get self Numbers
     * @return
     */
    public List<Generator> getSeflNumbers() {
        return seflNumbers;
    }
}
