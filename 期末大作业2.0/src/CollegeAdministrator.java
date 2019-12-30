
class CollegeAdministrator extends User{
	
	public CollegeAdministrator(String name,String password,String role,String number){
		super(name,password,role,number);//利用关键字super来调用父类
	}

	public void Menu() {
		System.out.println("学院管理员菜单如下：\n"
				+ "[1]修改密码\n"
				+ "[2]修改联系电话\n"
				+ "[3]运动员报名信息管理（目前没有该功能）\n"
				+ "[4]赛事查询（目前没有该功能）\n");
		
		System.out.print("请输入您的选择：");	
	}
	
}
