package it.unimib.disco.bigtwine.commons.csv;

import it.unimib.disco.bigtwine.commons.csv.adapters.ApacheCsvParserAdapter;
import it.unimib.disco.bigtwine.commons.csv.adapters.ApacheCsvPrinterAdapter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.Reader;

public class CSVFactory {
    public CSVWriter getWriter(final Appendable out, final char delimiter) throws IOException {
        return new ApacheCsvPrinterAdapter(new CSVPrinter(out, CSVFormat.DEFAULT.withDelimiter(delimiter)));
    }

    public CSVReader getReader(final Reader reader, final char delimiter) throws IOException {
        return new ApacheCsvParserAdapter(new CSVParser(reader, CSVFormat.DEFAULT.withDelimiter(delimiter)));
    }
}
