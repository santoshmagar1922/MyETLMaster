package com.crest.transform;


import java.util.function.Function;

public interface Transformer {

//    Function<Document, Document> transform();
	String transform(String doc);
}
