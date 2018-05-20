package egovframework.com.bidserver.distribution.service;

import java.util.HashMap;
import java.util.List;

public interface DistributionService {

	public List<HashMap> selectBidList(HashMap map) throws Exception; 
	
	public int getBidListCnt(HashMap map) throws Exception;  
	
	public List<HashMap> selectBidUserCnt(HashMap map) throws Exception; 
	
	public List<HashMap> selectBidList2(HashMap map) throws Exception; 
	
	public int getBidListCnt2(HashMap map) throws Exception;  
	
	public int selectDisCnt(HashMap map) throws Exception;  
	
	public int insertDistributionList(HashMap map) throws Exception;
	
	public void updateDistributionList(HashMap map) throws Exception; 
	
	public int selectDisDtlCnt(HashMap map) throws Exception; 
	
	public List<HashMap> selectDistributionDtl(HashMap map) throws Exception; 
	
	public void updateBidBaseAmount(HashMap map) throws Exception;
	
	public void updateBidDetailInfo(HashMap map) throws Exception; 
	
	public List<HashMap> selectBidDtl(HashMap map) throws Exception; 
	
	public HashMap selectBidSubj(HashMap map) throws Exception; 
	
	public HashMap selectBidRisk(HashMap map) throws Exception; 
	
	public HashMap selectApplyInfo(HashMap map) throws Exception; 
	
	public int manufactureChk(HashMap map) throws Exception;  
	
	public List<HashMap> selectBizRelList(HashMap map) throws Exception; 
	
	public List<HashMap> selectBizManufactureList(HashMap map) throws Exception; 
	
	public void updateBidDtl(HashMap map) throws Exception;
	
	public void updateBidList(HashMap map) throws Exception;
	
	public void updateBidRisk(HashMap map) throws Exception;
	
	public void updateBidRisk2(HashMap map) throws Exception;
	
	public void updateBidSubj(HashMap map) throws Exception;
	
	public void deleteManufactureList(HashMap map) throws Exception; 
	
	public void updateManufactureList(HashMap map) throws Exception; 
	
	public void updateApply(HashMap map) throws Exception;
	
	public void updateManufactureList2(HashMap map) throws Exception; 
	
	public void updateManufactureList3(HashMap map) throws Exception; 
	
	public void deleteManufactureChoice(HashMap map) throws Exception; 
	
	public void updateApply2(HashMap map) throws Exception;
	
	public void updateBidDtl2(HashMap map) throws Exception;
	
	public void updateDrop(HashMap map) throws Exception;
	
	public void updatePick(HashMap map) throws Exception;
	
	public List<HashMap> selectUserList(HashMap map) throws Exception; 
	
	public List<HashMap> selectComboList(HashMap map) throws Exception; 
	
	public List<HashMap> manufactureList(HashMap map) throws Exception; 
	
	public void insertBidMessage(HashMap map) throws Exception;
	
	public void updateBusinessRelList(HashMap map) throws Exception; 
	
	public void scheduleDrop(HashMap map) throws Exception;
	
	public void insertBidNotice(HashMap map) throws Exception;
	
	public List<HashMap> selectEstimateList(HashMap map) throws Exception; 
	
	public List<HashMap> selectBidApplyList(HashMap map) throws Exception; 
	
	public void scheduleJoinCnt(HashMap map) throws Exception;
	
	public List<HashMap> selectBigoDtl(HashMap map) throws Exception; 
	
	public List<HashMap> selectBigoDtl2(HashMap map) throws Exception; 
	
	public void updateBigo(HashMap map) throws Exception; 
	
	public void updateBigo2(HashMap map) throws Exception; 
	
	public void updateColorType(HashMap map) throws Exception;
}
