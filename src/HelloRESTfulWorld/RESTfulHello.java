package HelloRESTfulWorld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class RESTfulHello {
	//call this method if plain text is requested e.g. TEXT_PLAIN  
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloPlainText(){
		return "Hello RESTful World";
	}
	
	//call this method if XML is requested
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXML(){
		return "<?xml version=\"1.0\"?>" + "<hello> Hello RESTful World" + "</hello>";
	}
	
	//call this method if HTML is requested 
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello(){
		return "<html>" + "<title>" + "RESTful Hello" + "</title>" + "<body><h1>" +
				"This is a RESTful Hello" + "</h1></body>" + "</html>"; 
	}
}



