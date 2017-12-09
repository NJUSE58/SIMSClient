package rmi;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * 解析XML
 * @author Lijie
 * @date 2017年11月28日
 */
public class ParseXML {

	private String filePath = "DATA/DataService.xml";
	private Document document;
	private Element element;
	private Element root;

	public ParseXML(String fileName) {

	}

	public void init(String filePath, String fileName) {
		try {
			/* 创建一个DocumentBuilderFactory的对象 */
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();  //创建DocumentBuilder对象
			document = db.parse(new File(filePath));  //通过DocumentBuilder对象的parser方法加载DataService.xml文件到当前项目下
			root = document.getDocumentElement();
			element = (Element)selectSingleNode("/DATA/Data[name='" + fileName + "']", root);
		} catch (DOMException e) {
			System.out.println(e.getMessage());
		} catch (ParserConfigurationException e) {
			System.out.println(e.getMessage());
		} catch (SAXException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private Element selectSingleNode(String string, Element root2) {
		return null;
	}


}
