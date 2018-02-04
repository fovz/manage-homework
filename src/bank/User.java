package bank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
		private String ID;
		private String name;
		private Integer num;
		public String getID() {
			return ID;
		}

		public void setID(String iD) {
			ID = iD;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getNum() {
			return num;
		}

		public void setNum(Integer num) {
			this.num = num;
		}

		List idlist=new ArrayList();
		List namelist=new ArrayList();
		List numlist=new ArrayList();
		
		public void menu() {
			
			System.out.println("-----���й���ϵͳ-----");
			System.out.println("-----1.����------");
			System.out.println("-----2.��Ǯ------");
			System.out.println("-----3.ȡǮ---------");
			System.out.println("-----4.ת��---------");
			System.out.println("-----5.��ѯ���---------");

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
				store();
				menu();
				break;
			}  
			case 3:{
				take();
				menu();
				break;
			}
			case 4:{
				form();
				menu();
				break;
			}
			case 5:{
				search();
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
			System.out.println("���뿨��");
			Scanner id=new Scanner(System.in);
			setID(id.next());
			String ids=getID();
			if(idlist.contains(ids)) {
			    System.out.println("�ÿ����Ѵ���");
			}else {
				idlist.add(ids);
				int index=idlist.indexOf(ids);
				System.out.println("��������");
				Scanner nam=new Scanner(System.in);
				setName(nam.next());
				namelist.add(index, getName());
				System.out.println("������");
				Scanner num=new Scanner(System.in);
				setNum(num.nextInt());
				numlist.add(index, getNum());
				System.out.println("�����ɹ���");
			}
			
		}
		
		public void store() {
			System.out.println("���뿨��");
			Scanner id=new Scanner(System.in);
			setID(id.next());
			String idm=getID();
			if(idlist.contains(idm)) {
				int index=idlist.indexOf(idm);
				int n=(int) numlist.get(index);
				System.out.println("���Ϊ��"+n);
				System.out.println("��������");
				Scanner num=new Scanner(System.in);
				int nums=num.nextInt();
				int numa=n+nums;
				numlist.set(index,numa);
				System.out.println("����ɹ������Ϊ��"+numlist.get(index));
			}else {
				System.out.println("���û�������");
			}
		}
		
		public void take() {
			System.out.println("����ID");
			Scanner id=new Scanner(System.in);
			setID(id.next());
			String idm=getID();
			if(idlist.contains(idm)) {
				int index=idlist.indexOf(idm);
				int n=(int) numlist.get(index);
				System.out.println("���Ϊ��"+n);
				System.out.println("����ȡǮ��");
				Scanner num=new Scanner(System.in);
				int nums=num.nextInt();
				int numa=n-nums;
				numlist.set(index, numa);
				System.out.println("���Ϊ��"+numa);
			}else {
				System.out.println("���û�������");
			}
			
		}
	
		public void form() {
			System.out.println("��������ID��");
			Scanner id=new Scanner(System.in);
			setID(id.next());
			String idm=getID();
			if(idlist.contains(idm)) {
				int index=idlist.indexOf(idm);
				int n=(int) numlist.get(index);
				System.out.println("���Ϊ��"+n);
				System.out.println("����ת����");
				Scanner nums=new Scanner(System.in);
				int nz=nums.nextInt();
				int numsa=n-nz;
				System.out.println("����Է����ţ�");
				Scanner ids=new Scanner(System.in);
				String idms=ids.next();
				if(idlist.contains(idms)) {
					int indexs=idlist.indexOf(idms);
					int ns=(int) numlist.get(indexs);
					int na=ns+nz;
					numlist.set(indexs,na);
					numlist.set(index,numsa);
					System.out.println("ת�˳ɹ���");
				}else {
					System.out.println("�û������ڣ����������룺");
				}
				
				
			}else {
				
				System.out.println("���û�������");
			}
			
		}
		public void search() {
			System.out.println("����ID");
			Scanner id=new Scanner(System.in);
			setID(id.next());
			String idm=getID();
			if(idlist.contains(idm)) {
				int index=idlist.indexOf(idm);
				int n=(int) numlist.get(index);
				System.out.println("���Ϊ��"+n);
			}else {
				System.out.println("���û�������");
			}
			
		}
}
