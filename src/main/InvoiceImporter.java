package main;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class InvoiceImporter implements Importer{


    private static final String NAME_PREFIX = "Dear ";
    private static final String PATIENT = "";
    private static final String AMOUNT_PREFIX = "Amount: ";
    private static final String AMOUNT = "";

    @Override
    public Document importFile(File file) throws IOException {
        final TextFile textFile = new TextFile(file);

        textFile.addLineSuffix(NAME_PREFIX,PATIENT);
        textFile.addLineSuffix(AMOUNT_PREFIX, AMOUNT);
        final Map<String, String> attributes = textFile.getAttributes();
        attributes.put(Attributes.TYPE, "INVOICE");

        return new Document(attributes);
    }
}
