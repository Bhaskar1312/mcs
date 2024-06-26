package it.mulders.mcs.search.printer;

import it.mulders.mcs.search.SearchQuery;
import it.mulders.mcs.search.SearchResponse;
import java.io.PrintStream;

public interface OutputPrinter {
    void print(final SearchQuery query, final SearchResponse.Response response, final PrintStream stream);
}
