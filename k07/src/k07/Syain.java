package k07;

public  abstract class Syain {
		private String code;
		private String name;
		Syain(String code, String name){
			this.code=code;
			this.name=name;
		}
		
		String getName() {
			return name;
		}
		String getCode() {
			return code;
		}
		abstract void work();
}
