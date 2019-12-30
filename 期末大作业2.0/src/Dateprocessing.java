import java.util.Scanner;
import java.util.Hashtable;
public class Dateprocessing {
	
	//定义一个哈希表类来存放用户登入信息
	static Hashtable<String,User>users;
	private static String number;
	static {
		users = new Hashtable<String,User>();
		users.put("KINSA",new CollegeAdministrator("KINSA","1101","CollegAdministrtion","12345678910"));//学院管理员
		users.put("LAY",new SystemAdministrator("LAY","1007","SystemAdministrator","10987654321"));//系统管理员
		
	}
	
	//搜寻用户是否存在
	public static User search(String name,String password) {
		if(users.containsKey(name)) {
			User temp = users.get(name);
			if((temp.getpassword()).equals(password)) {
				return temp;
			}
		}
		return null;
	}
	
	//更改用户密码
	public static boolean update1(String name,String password,String role,String number) {
		User user;
		if(users.containsKey(name)) {//调出用户的信息
			if(role.equalsIgnoreCase("CollegeAdministrator")) {
				user = new CollegeAdministrator(name,password,role,number);
			}else {
				user = new SystemAdministrator(name,password,role,number);
			}
		
			users.put(password,user);//更改密码
			return true;
		}
		else {
			return false;
		}
	}
	
	//修改电话号码
	public static boolean update2(String name,String password,String role,String number) {
		User user;
		if(users.containsKey(name)) {//调出用户的信息
			if(role.equalsIgnoreCase("CollegeAdministrator")) {
				user = new CollegeAdministrator(name,password,role,number);
			}else {
				user = new SystemAdministrator(name,password,role,number);
			}
		
			users.put(number,user);//更改密码
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String name,password;
		String system = "运动会程序管理系统";
		String menu = "请选择菜单";
		String exit = "已退出系统";
		String info = "欢迎使用"+system+"\n"+"1 登录"+"\n"+"2 退出"+"\n"+"请输入相应数字"+"\n";
		
		System.out.println(info);//提示用户选择
		System.out.println(menu);
		
		Scanner Input1 = new Scanner(System.in);//判断用户输入的登录信息是否正确并作出提示
		int k = Input1.nextInt();
		if(k==1) {//用户选择登录
			System.out.println("请输入用户名");
			name = Input1.next();
			System.out.println("请输入密码");
			password = Input1.next();

			if(!users.containsKey(name)) {//判断用户是否存在
				System.out.println("用户不存在");
				System.exit(0);
			}
			
			if(!(users.get(name).getpassword().equals(password))) {//判断密码是否正确
				System.out.println("密码错误");
				System.exit(0);
			}
			
			switch(search(name,password).getrole()) {//根据菜单选择操作项目
			case("CollegeAdministrator")://学院管理员项目
				CollegeAdministrator a = new CollegeAdministrator(name,password,search(name,password).getrole(),search(name,password).getnumber());
			    System.out.println("登入成功！");
			    a.Menu();//系统管理员菜单
			    int i  = Input1.nextInt();
			    switch(i) {//选择所需功能
			    case(1):
			    	a.changepassword(password);
			        break;
			    case(2):
			    	a.changenumber(number);
			        break;
			    }
			    break;
			
			case("SystemAdministrator")://系统管理员项目
				SystemAdministrator b = new SystemAdministrator(name,password,search(name,password).getrole(),search(name,password).getnumber());
			    System.out.println("登入成功！");
				b.Menu();//系统管理员菜单
				int j = Input1.nextInt();
				switch(j) {//选择所需功能
				case(1):
					b.changepassword(password);
				    break;
				case(2):
					b.changenumber(number);
				    break;
				}
				break;
			}
		}
		else {//k=2，用户选择登出
			System.out.println(exit);//输出登出提示
		}
		Input1.close();
	}
}
