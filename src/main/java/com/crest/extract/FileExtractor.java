package com.crest.extract;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExtractor implements Extractor {

	@Override
	 public String extract(String fileName) {
		BufferedReader br = null;
		String total = "";
		try {
			
			String sCurrentLine;

			br = new BufferedReader(new FileReader(fileName));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				total = total + sCurrentLine;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return total;
	}
		
}
	 
	 /* @Override
    public Supplier<Stream<Document>> extract(String source) {
        return () -> {
            try {
                return FileExtractor.getDocumentStreamFrom(source);
            } catch (Exception e) {
                return Stream.of();
            }
        };

    }*/

   /* private static Stream<Document> getDocumentStreamFrom(String dirPath) throws IOException {

        return Files.list(new File(dirPath).toPath()).map(path -> {
            try {
                return new Document(path.getFileName().toString(), Files.readAllLines(path));
            } catch (IOException e) {
                return emptyDocument();
            }
        });
    }*/

