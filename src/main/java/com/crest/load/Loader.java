package com.crest.load;


import java.util.function.Consumer;

public interface Loader {

    //Consumer<Document> load(String outputDestination);
	String load(String content, String outputDestination);
}
