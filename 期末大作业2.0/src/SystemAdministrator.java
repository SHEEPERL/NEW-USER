
class SystemAdministrator extends User{

	public SystemAdministrator(String name,String password,String role,String number) {
		super(name,password,role,number);//���ùؼ���super�����ø���
	}
	
	public void Menu() {
		System.out.println("ϵͳ����Ա�˵����£�\n"
				+ "[1]�޸�����\n"
				+ "[2]�޸���ϵ�绰\n"
				+ "[3]ѧԺ����Ա��Ϣ����Ŀǰû�иù��ܣ�\n"
				+ "[4]�˶�Ա�ɼ��������ѯ��Ŀǰû�иù��ܣ�\n");
		
		System.out.print("����������ѡ��");	
	}
	
}