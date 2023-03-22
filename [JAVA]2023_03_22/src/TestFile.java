public class TestFile {
	
	private String id;
	private String pw;
	private String name;
	
	public String getId() {
		return id;
	}

	TestFile setId(String id) {
		this.id = id;
		return this;
	}

	public String getPw() {
		return pw;
	}
	
	TestFile setPw(String pw) {
		this.pw = pw;
		return this;
	}

	public String getName() {
		return name;
	}

	TestFile setName(String name) {
		this.name = name;
		return this;
	}
	
	
	public static void main(String[] args) {
		
		TestFile tf = new TestFile();
		tf.setId("1").setPw("1234@").setName("민우");
		
	}
}
