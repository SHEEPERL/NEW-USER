import java.util.Scanner;

abstract class User {//���������class
	private String name;
	private String password;
	private String role;
	private String number;//�޸����ԵĿɼ��������ƶ����Եķ���
	
	User(String name,String password,String role,String number){//���幹�췽��
		this.name = name;
		this.password = password;
		this.role = role;
		this.number = number;//this�ؼ��ַ��������������
	}
	
	
	//��ÿ��ֵ�����ṩ����Ĺ��е�get��set�������ʣ�Ҳ���Ǵ���һ�Ը�ֵ��ʽ
	//���ڶ�˽�����Խ��з���
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
	
	//�޸�����
	public boolean changepassword(String password) {
		System.out.println("�������µ�����");
		Scanner input = new Scanner(System.in);//����
		password = input.next();
		input.close();
		
		if(Dateprocessing.update1(name,password,role,number)) {
			this.password= password;
			System.out.println("�޸ĳɹ�");
			return true;
		}
		else {
			System.out.println("�޸�ʧ��");
			return false;
		}	
	}
	
	//�޸ĵ绰����
	public boolean changenumber(String number) {
		System.out.println("�������µĺ���");
		Scanner input2 = new Scanner(System.in);
		number = input2.next();
		input2.close();
		
		if(Dateprocessing.update1(name,password,role,number)) {
			this.number= number;
			System.out.println("�޸ĳɹ�");
			return true;
		}
		else {
			System.out.println("�޸�ʧ��");
			return false;
		}
	}
	
	public abstract void Menu();//������󷽷�Menu
	
	public void exitSystem(){//�����˳�ϵͳ����exitSystem
		System.out.println("ϵͳ���˳�");
		System.exit(0);
	}
}