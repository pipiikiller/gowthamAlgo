package controller;

import model.Generator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WinHan on 13/3/17.
 */
public class GeneratorCollector {

    private static GeneratorCollector instance;
    List<Generator> totalCollection;

    //Singleton constructor
    private GeneratorCollector(){
        totalCollection = new ArrayList<>();
    }

    public static GeneratorCollector getInstance(){

        if(instance == null){
            instance = new GeneratorCollector();
        }
        return instance;
    }

    public void collect(Generator totalGenerator){

        if(totalGenerator != null){
            totalCollection.add(totalGenerator);
        }

    }

    public List<Generator> getTotalCollection(){
        return  totalCollection;
    }
}
