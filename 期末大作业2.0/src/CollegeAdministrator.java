
class CollegeAdministrator extends User{
	
	public CollegeAdministrator(String name,String password,String role,String number){
		super(name,password,role,number);//���ùؼ���super�����ø���
	}

	public void Menu() {
		System.out.println("ѧԺ����Ա�˵����£�\n"
				+ "[1]�޸�����\n"
				+ "[2]�޸���ϵ�绰\n"
				+ "[3]�˶�Ա������Ϣ����Ŀǰû�иù��ܣ�\n"
				+ "[4]���²�ѯ��Ŀǰû�иù��ܣ�\n");
		
		System.out.print("����������ѡ��");	
	}
	
}
