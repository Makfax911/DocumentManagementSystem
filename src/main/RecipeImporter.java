package main;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class RecipeImporter implements Importer {
    private static final String NAME_PREFIX = "Dear ";
    @Override
    public Document importFile(File file) throws IOException {
        final TextFile textFile = new TextFile(file);

//        textFile.addLineSuffix(NAME_PREFIX, Attributes.PATIENT);

        final Map<String, String> attributes = textFile.getAttributes();
        attributes.put(Attributes.TYPE, "RECIPE");
        return new Document(attributes);
    }
}
