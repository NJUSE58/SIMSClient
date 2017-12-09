package vo;


/**
 *
* @ClassName: ViewObject
* @Description: 数据对象
 */
public class ViewObject {

	public String id;
	public String date;

	@Override
	public String toString() {
		return "[ID=" + this.id + "]";
	}
}
