package vo.commodity;

import java.util.ArrayList;

public class ClassificationVO {

	String id;
	String name;
	ArrayList<CommodityVO> vo;
	ClassificationVO father;
	ArrayList<ClassificationVO> children;

	public ClassificationVO(String i,String n,ArrayList<CommodityVO> v,ClassificationVO f,ArrayList<ClassificationVO> c){
		id = i;
		name = n;
		vo = v;
		father = f;
		children = c;
	}

	public void setID(String i){
		id = i;
	}

	public String getID(){
		return id;
	}

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	public void setCommodityVOArray(ArrayList<CommodityVO> v){
		vo = v;
	}

	public ArrayList<CommodityVO> getCommodityVOArray(){
		return vo;
	}

	public void setFather(ClassificationVO f){
		father = f;
	}

	public ClassificationVO getFather(){
		return father;
	}

	public void setChildren(ArrayList<ClassificationVO> c){
		children = c;
	}

	public ArrayList<ClassificationVO> getChildren(){
		return children;
	}
}
