package com.crest;

import com.crest.extract.Extractor;
import com.crest.extract.FileExtractor;
import com.crest.load.FileLoader;
import com.crest.load.Loader;
import com.crest.transform.Transformer;
import com.crest.transform.UpperCaseTransformer;

public class ETLProcessor {

    public static final String INPUT = "./Input/test.txt";
    public static final String OUTPUT = "./Output/test.txt";

    public static String process(Extractor extractor, String extractSource, Transformer transformer, Loader loader, String outputDestination) throws Exception {
        //extractor.extract(extractSource).get().map(transformer.transform()).forEach(loader.load(outputDestination));
    	
    	String str = extractor.extract(extractSource);
    	String trsformedStr = transformer.transform(str);
    	String status = loader.load(trsformedStr, OUTPUT);
    	System.out.println("STATUS : " + status);
    	return status;
    }

    public static void main( String[] args ) throws Exception {
        Extractor fileExtractor = new FileExtractor();
        Transformer transformer = new UpperCaseTransformer();
        Loader fileLoader = new FileLoader();

        ETLProcessor.process(fileExtractor, INPUT,transformer,fileLoader, OUTPUT);
    }
}

