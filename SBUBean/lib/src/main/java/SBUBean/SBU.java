package SBUBean;

import java.util.List;

public class SBU {
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empDetails;
	
	SBU(){}

	public SBU(String sbuId, String sbuName, String sbuHead) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	

	public SBU(String sbuId, String sbuName, String sbuHead, List<Employee> empDetails) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.empDetails = empDetails;
	}

	
	public List<Employee> getEmpDetails() {
		return empDetails;
	}

	public void setEmpDetails(List<Employee> empDetails) {
		this.empDetails = empDetails;
	}

	public String getSbuId() {
		return sbuId;
	}

	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", empDetails=" + empDetails
				+ "]";
	}

	
	

}
