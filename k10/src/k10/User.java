package k10;

public class User implements Comparable<User> {
	private int no;
	private String name;
	public User(int no, String name) {
		super();
		this.no=no;
		this.name=name;
	}
	
	public void print() {
		System.out.println(no+"\t"+name);
	}
	@Override
	public int compareTo(User o) {
		int ret=no-o.no;
		if (ret==0) {
			ret=name.compareTo(o.name);
		}
		return ret;
	}
	@Override
	public int hashCode() {
		return (no+name).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		boolean ret;
		if(this==obj) {
			ret=true;
		}else {
			if (obj==null) {
				ret=false;
			}else {
				if(obj instanceof User) {
					User other=(User)obj;
					ret=no==other.no&&name.equals(other.name);
				}else {
					ret=false;
				}
			}
		}
		return ret;
	}
}
