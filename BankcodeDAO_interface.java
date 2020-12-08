package com.bankcode.model;

import java.util.List;

public interface BankcodeDAO_interface {

	    public void insert(BankcodeVO bankcodeVO);
	    public void update(BankcodeVO bankcodeVO);
	    public void delete(String b_code);
	    public BankcodeVO findByPrimaryKey(String b_code);
	    public List<BankcodeVO> getAll();
	    //�U�νƦX�d��(�ǤJ�Ѽƫ��AMap)(�^�� List)
	//  public List<EmpVO> getAll(Map<String, String[]> map); 
}
