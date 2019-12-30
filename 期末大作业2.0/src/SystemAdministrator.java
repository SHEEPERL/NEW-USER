
class SystemAdministrator extends User{

	public SystemAdministrator(String name,String password,String role,String number) {
		super(name,password,role,number);//利用关键字super来调用父类
	}
	
	public void Menu() {
		System.out.println("系统管理员菜单如下：\n"
				+ "[1]修改密码\n"
				+ "[2]修改联系电话\n"
				+ "[3]学院管理员信息管理（目前没有该功能）\n"
				+ "[4]运动员成绩管理与查询（目前没有该功能）\n");
		
		System.out.print("请输入您的选择：");	
	}
	
}