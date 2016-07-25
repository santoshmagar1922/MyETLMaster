package com.crest.transform;


import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public class UpperCaseTransformer implements Transformer {


    @Override
    public String transform(String fileContent) {
    	StringBuffer sfinal = new StringBuffer();
    	String [] allArr = fileContent.split(" ");
    	for (String s : allArr) {
    		sfinal = sfinal.append(s.toUpperCase() + " ");
    	}
        return sfinal.toString();
    }
}
