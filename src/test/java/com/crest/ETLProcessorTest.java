package com.crest;

import com.crest.extract.Extractor;
import com.crest.extract.FileExtractor;
import com.crest.load.FileLoader;
import com.crest.load.Loader;
import com.crest.transform.Transformer;
import com.crest.transform.UpperCaseTransformer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ETLProcessorTest extends TestCase
{
	
	public static final String INPUT = "./Input/test.txt";
    public static final String OUTPUT = "./Output/test.txt";
	ETLProcessor classUnderTest = new ETLProcessor();
	
	public void testThatProcessShouldReturnSuccess () {
		Extractor fileExtractor = new FileExtractor();
        Transformer transformer = new UpperCaseTransformer();
        Loader fileLoader = new FileLoader();
		
        try {
			String res = classUnderTest.process(fileExtractor, INPUT, transformer, fileLoader, OUTPUT);
			assertEquals("success", res);
		} catch (Exception e) {
			fail();
//			e.printStackTrace();
		}
	}
	
}
