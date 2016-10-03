package kreitech.googleSearch;

import java.io.IOException;

import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.customsearch.Customsearch;
import com.google.api.services.customsearch.Customsearch.Builder;
import com.google.api.services.customsearch.model.Search;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Customsearch cs ;
    	Builder builder = new Customsearch.Builder(new NetHttpTransport(), new JacksonFactory(), null);
    	builder.setApplicationName("miapp");
    	cs = builder.build();
    	
		Search execute = cs.cse().list("prosur").setKey("AIzaSyAxHHjR28nClL7XwToOK6MHjyL9T8P-JZM").setCx("008249811503354722583:3pvqwwdlko8").execute();
		System.out.println(execute.toPrettyString());
		
    }
}
