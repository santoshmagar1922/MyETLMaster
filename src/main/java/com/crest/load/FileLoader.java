package com.crest.load;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLoader implements Loader {

	
	@Override
	public String load(String content, String destination){
	
		try {
			File file = new File(destination);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
			return "fail";
		}
		
		return "success";
	}
   /* @Override
    public Consumer<Document> load(String outputDir) {
        try {
            org.apache.commons.io.FileUtils.cleanDirectory(new File(outputDir));
        } catch (Exception e) {
            System.out.println("Output dir not present");
        }
        return d -> writeTo(outputDir + "/" + d.getName(), d.getContent());
    }

    public static void writeTo(String filename, List<String> content) {
        try {
            Files.write(Paths.get(filename),
                    (Iterable<String>) content.stream()::iterator,
                    CREATE, WRITE, APPEND);
        } catch (IOException e) {
            System.out.println("Unable to write content to file");
        }
    }*/
}
