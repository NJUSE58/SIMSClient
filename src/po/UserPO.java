package po;

import dataenum.UserRole;

import javafx.scene.image.ImageView;

public class UserPO extends PersistObject {

	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	private UserRole role;
	private ImageView image;



	/**
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param id
	* @param @param id2
	* @param @param name
	* @param @param password
	* @param @param role
	* @param @param image    设定文件
	* @return   返回类型
	* @throws
	*/
	public UserPO(String id, String name, String password, UserRole role, ImageView image) {
		super(id);
		this.name = name;
		this.password = password;
		this.role = role;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public UserRole getRole() {
		return role;
	}

	public ImageView getImage() {
		return image;
	}


}
