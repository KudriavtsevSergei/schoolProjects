package k10;

public class Student {
	private String gakusekiNo;
	private String gakuseiName;
	
	Student(String gakusekiNo,String gakuseiName){
		this.gakusekiNo=gakusekiNo;
		this.gakuseiName=gakuseiName;
	}
	
	@Override
	public int hashCode() {
		return(gakusekiNo+gakuseiName).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		boolean ret;
		if (this==obj) {
			ret=true;
		}else {
			if(obj==null) {
				ret=false;
			}else {
				if(obj instanceof Student) {
					Student other=(Student)obj;
					ret=gakusekiNo.equals(other.gakusekiNo)&&gakuseiName.equals(other.gakuseiName);
				}else {
					ret=false;
				}
			}
		}
		return ret;
	}
}
