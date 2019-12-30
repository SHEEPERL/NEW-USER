import java.util.Scanner;
import java.util.Hashtable;
public class Dateprocessing {
	
	//����һ����ϣ����������û�������Ϣ
	static Hashtable<String,User>users;
	private static String number;
	static {
		users = new Hashtable<String,User>();
		users.put("KINSA",new CollegeAdministrator("KINSA","1101","CollegAdministrtion","12345678910"));//ѧԺ����Ա
		users.put("LAY",new SystemAdministrator("LAY","1007","SystemAdministrator","10987654321"));//ϵͳ����Ա
		
	}
	
	//��Ѱ�û��Ƿ����
	public static User search(String name,String password) {
		if(users.containsKey(name)) {
			User temp = users.get(name);
			if((temp.getpassword()).equals(password)) {
				return temp;
			}
		}
		return null;
	}
	
	//�����û�����
	public static boolean update1(String name,String password,String role,String number) {
		User user;
		if(users.containsKey(name)) {//�����û�����Ϣ
			if(role.equalsIgnoreCase("CollegeAdministrator")) {
				user = new CollegeAdministrator(name,password,role,number);
			}else {
				user = new SystemAdministrator(name,password,role,number);
			}
		
			users.put(password,user);//��������
			return true;
		}
		else {
			return false;
		}
	}
	
	//�޸ĵ绰����
	public static boolean update2(String name,String password,String role,String number) {
		User user;
		if(users.containsKey(name)) {//�����û�����Ϣ
			if(role.equalsIgnoreCase("CollegeAdministrator")) {
				user = new CollegeAdministrator(name,password,role,number);
			}else {
				user = new SystemAdministrator(name,password,role,number);
			}
		
			users.put(number,user);//��������
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String name,password;
		String system = "�˶���������ϵͳ";
		String menu = "��ѡ��˵�";
		String exit = "���˳�ϵͳ";
		String info = "��ӭʹ��"+system+"\n"+"1 ��¼"+"\n"+"2 �˳�"+"\n"+"��������Ӧ����"+"\n";
		
		System.out.println(info);//��ʾ�û�ѡ��
		System.out.println(menu);
		
		Scanner Input1 = new Scanner(System.in);//�ж��û�����ĵ�¼��Ϣ�Ƿ���ȷ��������ʾ
		int k = Input1.nextInt();
		if(k==1) {//�û�ѡ���¼
			System.out.println("�������û���");
			name = Input1.next();
			System.out.println("����������");
			password = Input1.next();

			if(!users.containsKey(name)) {//�ж��û��Ƿ����
				System.out.println("�û�������");
				System.exit(0);
			}
			
			if(!(users.get(name).getpassword().equals(password))) {//�ж������Ƿ���ȷ
				System.out.println("�������");
				System.exit(0);
			}
			
			switch(search(name,password).getrole()) {//���ݲ˵�ѡ�������Ŀ
			case("CollegeAdministrator")://ѧԺ����Ա��Ŀ
				CollegeAdministrator a = new CollegeAdministrator(name,password,search(name,password).getrole(),search(name,password).getnumber());
			    System.out.println("����ɹ���");
			    a.Menu();//ϵͳ����Ա�˵�
			    int i  = Input1.nextInt();
			    switch(i) {//ѡ�����蹦��
			    case(1):
			    	a.changepassword(password);
			        break;
			    case(2):
			    	a.changenumber(number);
			        break;
			    }
			    break;
			
			case("SystemAdministrator")://ϵͳ����Ա��Ŀ
				SystemAdministrator b = new SystemAdministrator(name,password,search(name,password).getrole(),search(name,password).getnumber());
			    System.out.println("����ɹ���");
				b.Menu();//ϵͳ����Ա�˵�
				int j = Input1.nextInt();
				switch(j) {//ѡ�����蹦��
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
		else {//k=2���û�ѡ��ǳ�
			System.out.println(exit);//����ǳ���ʾ
		}
		Input1.close();
	}
}
