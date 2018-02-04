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
			
			System.out.println("-----银行管理系统-----");
			System.out.println("-----1.开户------");
			System.out.println("-----2.存钱------");
			System.out.println("-----3.取钱---------");
			System.out.println("-----4.转账---------");
			System.out.println("-----5.查询余额---------");

			System.out.print("--输入选择：");
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
				System.out.println("输入错误");
				menu();
			}
			}
		}
		
		public void add() {
			System.out.println("输入卡号");
			Scanner id=new Scanner(System.in);
			setID(id.next());
			String ids=getID();
			if(idlist.contains(ids)) {
			    System.out.println("该卡号已存在");
			}else {
				idlist.add(ids);
				int index=idlist.indexOf(ids);
				System.out.println("输入姓名");
				Scanner nam=new Scanner(System.in);
				setName(nam.next());
				namelist.add(index, getName());
				System.out.println("输入金额");
				Scanner num=new Scanner(System.in);
				setNum(num.nextInt());
				numlist.add(index, getNum());
				System.out.println("开户成功！");
			}
			
		}
		
		public void store() {
			System.out.println("输入卡号");
			Scanner id=new Scanner(System.in);
			setID(id.next());
			String idm=getID();
			if(idlist.contains(idm)) {
				int index=idlist.indexOf(idm);
				int n=(int) numlist.get(index);
				System.out.println("余额为："+n);
				System.out.println("输入存入金额：");
				Scanner num=new Scanner(System.in);
				int nums=num.nextInt();
				int numa=n+nums;
				numlist.set(index,numa);
				System.out.println("存入成功，余额为："+numlist.get(index));
			}else {
				System.out.println("该用户不存在");
			}
		}
		
		public void take() {
			System.out.println("输入ID");
			Scanner id=new Scanner(System.in);
			setID(id.next());
			String idm=getID();
			if(idlist.contains(idm)) {
				int index=idlist.indexOf(idm);
				int n=(int) numlist.get(index);
				System.out.println("余额为："+n);
				System.out.println("输入取钱金额：");
				Scanner num=new Scanner(System.in);
				int nums=num.nextInt();
				int numa=n-nums;
				numlist.set(index, numa);
				System.out.println("余额为："+numa);
			}else {
				System.out.println("该用户不存在");
			}
			
		}
	
		public void form() {
			System.out.println("输入您的ID：");
			Scanner id=new Scanner(System.in);
			setID(id.next());
			String idm=getID();
			if(idlist.contains(idm)) {
				int index=idlist.indexOf(idm);
				int n=(int) numlist.get(index);
				System.out.println("余额为："+n);
				System.out.println("输入转出金额：");
				Scanner nums=new Scanner(System.in);
				int nz=nums.nextInt();
				int numsa=n-nz;
				System.out.println("输入对方卡号：");
				Scanner ids=new Scanner(System.in);
				String idms=ids.next();
				if(idlist.contains(idms)) {
					int indexs=idlist.indexOf(idms);
					int ns=(int) numlist.get(indexs);
					int na=ns+nz;
					numlist.set(indexs,na);
					numlist.set(index,numsa);
					System.out.println("转账成功！");
				}else {
					System.out.println("用户不存在，请重新输入：");
				}
				
				
			}else {
				
				System.out.println("该用户不存在");
			}
			
		}
		public void search() {
			System.out.println("输入ID");
			Scanner id=new Scanner(System.in);
			setID(id.next());
			String idm=getID();
			if(idlist.contains(idm)) {
				int index=idlist.indexOf(idm);
				int n=(int) numlist.get(index);
				System.out.println("余额为："+n);
			}else {
				System.out.println("该用户不存在");
			}
			
		}
}
