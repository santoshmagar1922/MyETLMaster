package com.crest.extract;


import java.util.function.Supplier;
import java.util.stream.Stream;

public interface Extractor {
//    Supplier<Stream<Document>> extract(String source);
	String extract(String fileName);


}
