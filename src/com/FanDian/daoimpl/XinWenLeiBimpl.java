package com.FanDian.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.FanDian.dao.XinWenLeiBdao;
import com.FanDian.entity.XinWenLeiB;
import com.FanDian.util.DBManager;

public class XinWenLeiBimpl implements XinWenLeiBdao {

	public List<XinWenLeiB> queryXinWenLeiBs() {
		List<XinWenLeiB> xwlb = new ArrayList<XinWenLeiB>();
		ResultSet rs = DBManager.querySQL("select * from xinwenleib;");
       try {
		while(rs.next()){
			XinWenLeiB lb = new XinWenLeiB(); 
			lb.setId(rs.getInt(1));
			lb.setLeib(rs.getString(2));
			xwlb.add(lb);
		   }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return xwlb;

	}

}
