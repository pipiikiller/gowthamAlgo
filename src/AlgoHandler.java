import controller.CollectionFilter;
import controller.Controller;
import controller.GeneratorCollector;
import controller.SumController;
import model.Generator;

import java.util.List;

/**
 * Created by WinHan on 13/3/17.
 */
public class AlgoHandler {

    private CollectionFilter collectionFilter;
    public void run(){
        Controller sumController = new SumController();
        GeneratorCollector generatorCollector = GeneratorCollector.getInstance();
        collectionFilter = new CollectionFilter();

        for(int i =1;i<5000;i++){
            sumController.split(String.valueOf(i));

        }
        sumController.calculate(sumController.getSplitterMap());

        collectionFilter.filerAll(generatorCollector.getTotalCollection());
    }

    public void printSelfNumbers(){
        List<Generator> selfNumbers=  collectionFilter.getSeflNumbers();
        int total =0;

        for(Generator generator: selfNumbers){
            System.out.println(generator.getNumber());
            total = total + generator.getNumber();
        }
        System.out.println("The total sum of all Self Number: "+ total);
        System.out.println("Numbers of self Numbers: " +selfNumbers.size());
    }
}
