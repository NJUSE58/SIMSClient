package SIMSclient.src.bussinesslogicservice.commodityblservice;

import SIMSclient.src.dataenum.ResultMessage;
import SIMSclient.src.vo.commodity.ClassificationVO;

public interface ClassificationBLService {

	public ResultMessage insert(ClassificationVO vo);

	public void delete(ClassificationVO vo);

	public ResultMessage update(ClassificationVO vo);

}
