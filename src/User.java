import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class User {
		private String userId;
		private String name;
		private String sex;
		
		List idlist=new ArrayList();
		List namelist=new ArrayList();
		List sexlist=new ArrayList();

		public  String getUserId() {
			return userId;
		}
		public  void setUserId(String userId) {
			this.userId = userId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public void menu() {
			

			System.out.println("-----�û�����ϵͳ-----");
			System.out.println("-----1.����û�------");
			System.out.println("-----2.ɾ���û�------");
			System.out.println("-----3.��ѯ---------");
			System.out.println("-----4.�޸�---------");
			System.out.print("--����ѡ��");
			Scanner select=new Scanner(System.in);
			int sel=select.nextInt();
			
			switch(sel) {
			case 1:{
				add();
				menu();
				break;
			}
			case 2:{
				remove();
				menu();
				break;
			}  
			case 3:{
				search();
				menu();
				break;
			}
			case 4:{
				replace();
				menu();
				break;
			}
			default :{
				System.out.println("�������");
				menu();
			}
			}
		}
	
		public void add() {
		
           
			System.out.print("�����û�ID��");
			Scanner ui=new Scanner(System.in);
			if(idlist.contains(ui)){
				System.out.println("���û��Ѵ���");
			}
			
			else{
			setUserId(ui.next());
			idlist.add(getUserId());
			
			System.out.print("�����û�������");
			Scanner un=new Scanner(System.in);
			setName(un.next());
			namelist.add(getName());
			
			System.out.print("�����û��Ա�");
			Scanner us=new Scanner(System.in);
			setSex(us.next());
			sexlist.add(getSex());
			
			System.out.println("��ӳɹ�");
			}
		}
		
		public void remove() {
			System.out.println("�����û�ID");
			Scanner rm=new Scanner(System.in);
			String rem=rm.next();
			if(idlist.contains(rem)) {
				int index=idlist.indexOf(rem);
				idlist.remove(index);
				namelist.remove(index);
				sexlist.remove(index);
				System.out.println("ɾ���ɹ�");	
			}else{
			   System.out.println("���û�������");	
			};	
		}
		
		public void search() {
			System.out.println("�����û�ID");
			Scanner us=new Scanner(System.in);
			String usd=us.next();
			if(idlist.contains(usd)) {
				int index=idlist.indexOf(usd);
				System.out.print(idlist.get(index)+" ");
				System.out.print(namelist.get(index)+" ");
				System.out.println(sexlist.get(index));	
			}else{
			   System.out.println("���û�������");	
			};	
		}
		
		public void replace() {
			System.out.println("�����û�ID");
			Scanner us=new Scanner(System.in);
			String usd=us.next();
			if(idlist.contains(usd)) {
				int index=idlist.indexOf(usd);
				System.out.print("�޸�����Ϊ:");
				Scanner un=new Scanner(System.in);
				String unm=un.next();
				namelist.set(index, unm);
				
				System.out.print("�޸��Ա�Ϊ:");
				Scanner ux=new Scanner(System.in);
				String uxm=ux.next();
				sexlist.set(index, uxm);
				
				System.out.println("�޸ĳɹ�!");
			}else{
			   System.out.println("���û�������");	
			};	
			
			
			
		}
	
}
