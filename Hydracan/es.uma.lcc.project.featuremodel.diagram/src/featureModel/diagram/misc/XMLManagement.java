package featureModel.diagram.misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import org.xml.sax.SAXException;


public class XMLManagement {
	
	String path, filename;
	ConfigurationList configurationList = null;
	private URI myURI = null;
	Document dom;
	
	public XMLManagement (String filename){
		this.filename = filename;
		configurationList = new ConfigurationList();
	}
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public URI getMyURI() {
		return myURI;
	}

	public void setMyURI(URI myURI) {
		this.myURI = myURI;
	}

	public ConfigurationList getConfigList(){
		return configurationList;
	}
	
	public void setPath(String path){
		this.path = path;
	}
	
	public void readFile() {
		
		initData();
		
		//parse the xml file and get the dom object
		parseXmlFile();
		
		//get each employee element and create a Employee object
		if (dom != null) parseDocument();
		
	}
	
	// load dom with the xml file
	private void parseXmlFile(){
		//get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			
			//Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			String slash = System.getProperty("file.separator");
			
			InputStream myInputStream = new FileInputStream(path + slash + filename);
			
			//parse using builder to get DOM representation of the XML file
			dom = db.parse(myInputStream);	
			
			myInputStream.close();
			

		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			// no existe el fichero de entrada
		}
	}

	// load de configurationList with the dom
	private void parseDocument(){
		//get the root elememt
		Element docEle = dom.getDocumentElement();
		
		//get a nodelist of <employee> elements
		NodeList nl = docEle.getElementsByTagName("Config");
		if(nl != null && nl.getLength() > 0) {
			for(int i = 0 ; i < nl.getLength();i++) {
				
				//get the employee element
				Element el = (Element)nl.item(i);
				
				//get the Employee object
				Configuration c = getConfiguration(el);
				
				//add it to list
				configurationList.add(c);
			}
		}
	}


	public void writeFile(){
		createDOMTree();
		printToFile();
	}

	/**
	 * Add a list of configuration to the list
	 * In a production system you might populate the list from a DB
	 */
	public void loadData(){
		configurationList.add(new Configuration("Config1", "pathConfig1"));
		configurationList.add(new Configuration("Config2", "pathConfig2"));
	}
	
	
	public void addConfiguration(String name, String path){
		configurationList.add(new Configuration(name, path));
	}
	
	public void deleteConfiguration(String name){
		configurationList.removeConfiguration(name);
	}
	
	/**
	 * Create new dom object
	 * Using JAXP in implementation independent manner create a document object
	 * using which we create a xml tree in memory
	 */
	private void createDocument() {

		//get an instance of factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
		//get an instance of builder
		DocumentBuilder db = dbf.newDocumentBuilder();

		//create an instance of DOM
		dom = db.newDocument();

		}catch(ParserConfigurationException pce) {
			//dump it
			System.out.println("Error while trying to instantiate DocumentBuilder " + pce);
			System.exit(1);
		}

	}

	/**
	 * The real workhorse which creates the XML structure
	 */
	private void createDOMTree(){
		
		createDocument();
		
		//create the root element <Books>
		Element rootEle = dom.createElement("Configurations");
		dom.appendChild(rootEle);

		//No enhanced for
		Iterator<Configuration> it  = configurationList.iterator();
		while(it.hasNext()) {
			Configuration b = (Configuration)it.next();
			//For each Book object  create <Book> element and attach it to root
			Element configEle = createConfigurationElement(b);
			rootEle.appendChild(configEle);
		}

	}

	/**
	 * Helper method which creates a XML element <Book>
	 * @param b The book for which we need to create an xml representation
	 * @return XML element snippet representing a book
	 */
	private Element createConfigurationElement(Configuration b){

		Element configEle = dom.createElement("Config");
//		configEle.setAttribute("Subject", b.getSubject());

		//create author element and author text node and attach it to bookElement
		Element eBaseName = dom.createElement("BaseName");
		Text tModelName = dom.createTextNode(b.getBaseName());
		eBaseName.appendChild(tModelName);
		configEle.appendChild(eBaseName);
		
//		Element eDiagramName = dom.createElement("DiagramName");
//		Text tDiagramName = dom.createTextNode(b.getBaseName() + b.getDiagramExtension());
//		eDiagramName.appendChild(tDiagramName);
//		configEle.appendChild(eDiagramName);

		//create title element and title text node and attach it to bookElement
		Element pathEle = dom.createElement("Path");
		Text titleText = dom.createTextNode(b.getPath());
		pathEle.appendChild(titleText);
		configEle.appendChild(pathEle);

		return configEle;

	}

	/**
	 * This method uses Xerces specific classes
	 * prints the XML document to file.
     */
	private void printToFile(){

		try
		{
			
			Transformer tr = TransformerFactory.newInstance().newTransformer(); 
			tr.setOutputProperty(OutputKeys.INDENT, "yes"); 
			tr.setOutputProperty(OutputKeys.METHOD,"xml"); 
			tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3"); 
			//to send the output to a file 
			
			String slash = System.getProperty("file.separator");
			tr.transform( new DOMSource(dom),new StreamResult(new FileOutputStream(path + slash + filename))); 


		} catch(IOException ie) {
		    ie.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * I take an employee element and read the values in, create
	 * an Employee object and return it
	 * @param config
	 * @return
	 */
	private Configuration getConfiguration(Element config) {
		
		//for each <employee> element get text or int values of 
		//name ,id, age and name
		String name = getTextValue(config,"BaseName");
		String path = getTextValue(config, "Path");
		
		//Create a new Employee with the value read from the xml nodes
		Configuration e = new Configuration(name,path);
		
		return e;
	}


	/**
	 * I take a xml element and the tag name, look for the tag and get
	 * the text content 
	 * i.e for <employee><name>John</name></employee> xml snippet if
	 * the Element points to employee node and tagName is name I will return John  
	 * @param ele
	 * @param tagName
	 * @return
	 */
	private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if(nl != null && nl.getLength() > 0) {
			Element el = (Element)nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}
	
	public boolean withElements (){
		return configurationList.isNotEmpty();
	}
	
	public void leer(){
		try {
			File file = new File("c:\\MyXMLFile.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element " + doc.getDocumentElement().getNodeName());
			NodeList nodeLst = doc.getElementsByTagName("employee");
			System.out.println("Information of all employees");

			for (int s = 0; s < nodeLst.getLength(); s++) {

				Node fstNode = nodeLst.item(s);

				if (fstNode.getNodeType() == Node.ELEMENT_NODE) {

					Element fstElmnt = (Element) fstNode;
					NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("firstname");
					Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
					NodeList fstNm = fstNmElmnt.getChildNodes();
					System.out.println("First Name : "  + ((Node) fstNm.item(0)).getNodeValue());
					NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("lastname");
					Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
					NodeList lstNm = lstNmElmnt.getChildNodes();
					System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initData(){
		configurationList = new ConfigurationList();
	}
	
	
}
