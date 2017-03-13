package controller;

import model.Generator;

import java.util.List;
import java.util.Map;

/**
 * Created by WinHan on 13/3/17.
 */
public interface Controller {

    void calculate(Map<Integer,List<Generator>> splitterMap);
    Map<Integer,List<Generator>> split(String numbers);
    Map<Integer,List<Generator>> getSplitterMap();
}
