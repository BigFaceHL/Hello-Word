
public class Test {

	public static void main(String[] args) {
	String path="D:/wamp/www/employee/images/credentials/1996.png,D:/wamp/www/employee/images/credentials/1996.png,";
		int start=path.indexOf("employee")+"employee".length();
		String newpath=path.substring(start);
	System.out.println(newpath);
	System.out.println(start);
	
	
	for (int j = 0; j < args.length; j++) {
		System.out.println("J:"+j);
	}
	
	System.out.println(path.substring(0, path.length()-1));;
	}

}
