package bussinesslogicservice.commodityblservice;

import dataenum.ResultMessage;
import vo.commodity.ClassificationVO;

public interface ClassificationBLService {

	public ResultMessage insert(ClassificationVO vo);

	public void delete(ClassificationVO vo);

	public ResultMessage update(ClassificationVO vo);

}
