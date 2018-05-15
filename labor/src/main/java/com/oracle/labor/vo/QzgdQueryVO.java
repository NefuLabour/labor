package com.oracle.labor.vo;

public class QzgdQueryVO {
	
	private String bipCitizenid;

	private String bipName;
	
	private String sjStart;
	
	private String sjEnd;
	
	private String sfdj;

	public String getBipCitizenid() {
		return bipCitizenid;
	}

	public void setBipCitizenid(String bipCitizenid) {
		this.bipCitizenid = bipCitizenid;
	}

	public String getBipName() {
		return bipName;
	}

	public void setBipName(String bipName) {
		this.bipName = bipName;
	}

	public String getSjStart() {
		return sjStart;
	}

	public void setSjStart(String sjStart) {
		this.sjStart = sjStart;
	}

	public String getSjEnd() {
		return sjEnd;
	}

	public void setSjEnd(String sjEnd) {
		this.sjEnd = sjEnd;
	}

	public String getSfdj() {
		return sfdj;
	}

	public void setSfdj(String sfdj) {
		this.sfdj = sfdj;
	}

	@Override
	public String toString() {
		return "QzgdQueryVO [bipCitizenid=" + bipCitizenid + ", bipName=" + bipName + ", sjStart=" + sjStart
				+ ", sjEnd=" + sjEnd + ", sfdj=" + sfdj + "]";
	}
	
}
