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
			

			System.out.println("-----用户管理系统-----");
			System.out.println("-----1.添加用户------");
			System.out.println("-----2.删除用户------");
			System.out.println("-----3.查询---------");
			System.out.println("-----4.修改---------");
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
				System.out.println("输入错误");
				menu();
			}
			}
		}
	
		public void add() {
		
           
			System.out.print("输入用户ID：");
			Scanner ui=new Scanner(System.in);
			if(idlist.contains(ui)){
				System.out.println("该用户已存在");
			}
			
			else{
			setUserId(ui.next());
			idlist.add(getUserId());
			
			System.out.print("输入用户姓名：");
			Scanner un=new Scanner(System.in);
			setName(un.next());
			namelist.add(getName());
			
			System.out.print("输入用户性别：");
			Scanner us=new Scanner(System.in);
			setSex(us.next());
			sexlist.add(getSex());
			
			System.out.println("添加成功");
			}
		}
		
		public void remove() {
			System.out.println("输入用户ID");
			Scanner rm=new Scanner(System.in);
			String rem=rm.next();
			if(idlist.contains(rem)) {
				int index=idlist.indexOf(rem);
				idlist.remove(index);
				namelist.remove(index);
				sexlist.remove(index);
				System.out.println("删除成功");	
			}else{
			   System.out.println("该用户不存在");	
			};	
		}
		
		public void search() {
			System.out.println("输入用户ID");
			Scanner us=new Scanner(System.in);
			String usd=us.next();
			if(idlist.contains(usd)) {
				int index=idlist.indexOf(usd);
				System.out.print(idlist.get(index)+" ");
				System.out.print(namelist.get(index)+" ");
				System.out.println(sexlist.get(index));	
			}else{
			   System.out.println("该用户不存在");	
			};	
		}
		
		public void replace() {
			System.out.println("输入用户ID");
			Scanner us=new Scanner(System.in);
			String usd=us.next();
			if(idlist.contains(usd)) {
				int index=idlist.indexOf(usd);
				System.out.print("修改名字为:");
				Scanner un=new Scanner(System.in);
				String unm=un.next();
				namelist.set(index, unm);
				
				System.out.print("修改性别为:");
				Scanner ux=new Scanner(System.in);
				String uxm=ux.next();
				sexlist.set(index, uxm);
				
				System.out.println("修改成功!");
			}else{
			   System.out.println("该用户不存在");	
			};	
			
			
			
		}
	
}
