import java.util.Scanner;

abstract class User {//定义抽象类class
	private String name;
	private String password;
	private String role;
	private String number;//修改属性的可见性来限制对属性的访问
	
	User(String name,String password,String role,String number){//定义构造方法
		this.name = name;
		this.password = password;
		this.role = role;
		this.number = number;//this关键字方便其他对象调用
	}
	
	
	//对每个值属性提供对外的公有的get、set方法访问，也就是创建一对赋值方式
	//用于对私有属性进行访问
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getpassword() {
		return password;
	}
	
	public void setpassword(String password) {
		this.password = password;
	}
	
	public String getrole() {
		return role;
	}
	
	public void setrole(String role) {
		this.role = role;
	}
	
	public String getnumber() {
		return number;
	}
	
	public void setnumber(String number) {
		this.role = number;
	}
	
	//修改密码
	public boolean changepassword(String password) {
		System.out.println("请输入新的密码");
		Scanner input = new Scanner(System.in);//输入
		password = input.next();
		input.close();
		
		if(Dateprocessing.update1(name,password,role,number)) {
			this.password= password;
			System.out.println("修改成功");
			return true;
		}
		else {
			System.out.println("修改失败");
			return false;
		}	
	}
	
	//修改电话号码
	public boolean changenumber(String number) {
		System.out.println("请输入新的号码");
		Scanner input2 = new Scanner(System.in);
		number = input2.next();
		input2.close();
		
		if(Dateprocessing.update1(name,password,role,number)) {
			this.number= number;
			System.out.println("修改成功");
			return true;
		}
		else {
			System.out.println("修改失败");
			return false;
		}
	}
	
	public abstract void Menu();//定义抽象方法Menu
	
	public void exitSystem(){//定义退出系统方法exitSystem
		System.out.println("系统已退出");
		System.exit(0);
	}
}