/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librery;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rahman
 */
public class Librery extends javax.swing.JFrame {
    
    

   long number=11111111;
   
    long numbermbrIn;
    Writer out1;
     Writer out2;
     Writer out3;
                  
//=================
     
     public void getBook(String patch,String nameBook, String date){
         
        Member member=new Member();
  member.membershipNumber=Long.parseLong(patch);
Book book=new Book();
book.date=date;
	int i=0;
     String str2,str3,str4;
            //  String array[];
              Scanner input;
           try {
               
		File fileDir1 = new File("library\\"+member.membershipNumber+"\\"+"books"+".txt");
                File fileDir2 = new File("library\\"+member.membershipNumber+"\\"+"numberBooks"+".txt");
                File fileDir3 = new File("library\\"+member.membershipNumber+"\\"+"date"+".txt");
           	
                        out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir2), "UTF8"));
                        member.numberBook++;
		out1.append(""+member.numberBook).append("");
                
		out1.flush();
		out1.close();
           
		in = new BufferedReader(
		 new InputStreamReader(
                      new FileInputStream(fileDir2), "UTF8"));
		      
		
		      
		while ((str2 = in.readLine()) != null) {
		
                    jLabel26.setText(str2);
		}
              		int t= Integer.parseInt(jLabel26.getText()) ;
                       
                in.close();
                String  tempString;
     if(t==1){
          out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir1), "UTF8"));
		out1.append( nameBook).append("");
		out1.flush();
		out1.close();
                               out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir3), "UTF8"));
                       
		out1.append(""+book.date).append("");
                
		out1.flush();
		out1.close();
         
     }else {
         in = new BufferedReader(
		 new InputStreamReader(
                      new FileInputStream(fileDir1), "UTF8"));
		      
     	while ((str3 = in.readLine()) != null) {
		
                    jLabel26.setText(str3);
		}
              		  tempString= jLabel26.getText() ;
                       tempString=tempString+" "+nameBook;
                in.close();
                  out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir1), "UTF8"));
		out1.append(tempString).append("");
                
		out1.flush();
		out1.close();
                //===============================
                   in = new BufferedReader(
		 new InputStreamReader(
                      new FileInputStream(fileDir3), "UTF8"));
		      
     	while ((str4 = in.readLine()) != null) {
		
                    jLabel26.setText(str3);
		}
              		  tempString= jLabel26.getText() ;
                       tempString=tempString+" "+book.date;
                in.close();
                  out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir3), "UTF8"));
		out1.append(tempString).append("");
                
		out1.flush();
		out1.close();
     
     }    
   
                
	
	        
	    } 
	   catch (UnsupportedEncodingException e) 
	   {
		System.out.println(e.getMessage());
                
	   } 
	   catch (IOException e) 
	   {
		System.out.println(e.getMessage());
	    }
	   catch (Exception e)
	   {
		System.out.println(e.getMessage());
	   } 
     
         
         
     
     }
     ///=====================================
    
     boolean flagesearchMember;
        boolean flageInMember;
     public boolean searchMember(String number){
     
        
     Member member=new Member();
     try{
   member.membershipNumber=Long.parseLong(number);
     }catch(NumberFormatException ne){
       JOptionPane.showMessageDialog (null, "ورودی ها رو درست وارد کنید","پیام" , JOptionPane.INFORMATION_MESSAGE);
     }
   boolean flg;
              
           try {
		File fileDir1 = new File("library\\"+member.membershipNumber+"\\"+"fullname"+".txt");
                              
		in = new BufferedReader(
		 new InputStreamReader(
                      new FileInputStream(fileDir1), "UTF8"));
		     in.close();
                     
		flg=true;
            
	    } 
	    catch (UnsupportedEncodingException e) 
	    { 
                flg=false;
			
	    } 
	    catch (IOException e) 
	    {
		flg=false;	
	    }
	    catch (Exception e)
	    {
			
                       flg=false;

	    }
     if(flg){
   
    numbermbrIn= member.memberNumber(member.membershipNumber);
      return true;
     }
     else 
         return false;
     }
     ///===================================
     
     public void updateMember(){
         
        
             String str=jTextField10.getText();;
         int flag=0;
       Member member=new Member();
      if(jComboBox2.getSelectedItem()=="نام و نام خانوادگی"){
          System.err.println(""+"dddddddddddddddddd1");
         flag=1;
      }
     if(jComboBox2.getSelectedItem()=="سن"){
       System.err.println(""+"dddddddddddddddddd2");
     flag=2;
     }
     if(jComboBox2.getSelectedItem()=="جنسیت"){
         System.err.println(""+"dddddddddddddddddd3");
         flag=3;
     }
       
    member.membershipNumber= Long.parseLong(jTextField9.getText());
    
   
              System.err.println(""+"fld"+flag);
           try {
               if(flag==1){
	  File fileDir1 = new File("library\\"+member.membershipNumber+"\\"+"fullname"+".txt");
                	 out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir1), "UTF8"));
		out1.append(str).append("");
		out1.flush();
		out1.close();
                  System.err.println(""+"dddddddddddddddddd2");
               }
               if(flag==2){
              File fileDir2 = new File("library\\"+member.membershipNumber+"\\"+"age"+".txt");
                      out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir2), "UTF8"));
		out1.append(str).append("");
		out1.flush();
		out1.close();
               }
                  if(flag==3){
                        File fileDir3 = new File("library\\"+member.membershipNumber+"\\"+"sex"+".txt");
                          out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir3), "UTF8"));
		out1.append(str).append("");
		out1.flush();
		out1.close();
                  }
               
              
             
	
          
	        
	    } 
	   catch (UnsupportedEncodingException e) 
	   {
		System.out.println(e.getMessage());
                
	   } 
	   catch (IOException e) 
	   {
		System.out.println(e.getMessage());
	    }
	   catch (Exception e)
	   {
		System.out.println(e.getMessage());
	   }
     
     
     
         
         
         
         
         
         
         
   
     }
     
     
     //==============================================
     public void deleteMember(String numberMember){
     
     
	File dir = new File("library");
		dir.mkdir();
               
                File dir2 = new File("library//"+numberMember);
		dir2.mkdir();

    
              
           try {
		File fileDir1 = new File("library\\"+numberMember+"\\"+"name"+".txt");
                File fileDir2 = new File("library\\"+numberMember+"\\"+"nevisande"+".txt");                  File fileDir3 = new File("library\\"+numberMember+"\\"+"shabak"+".txt");
                File fileDir4 = new File("library\\"+numberMember+"\\"+"tittle"+".txt");
                File fileDir5 = new File("library\\"+numberMember+"\\"+"books"+".txt");
                File fileDir6 = new File("library\\"+numberMember+"\\"+"numberBooks"+".txt");
                File fileDir7 = new File("library\\"+numberMember+"\\"+"date"+".txt");
                 File fileDir8 = new File("library\\"+numberMember+"\\"+"fullname"+".txt");
                File fileDir9 = new File("library\\"+numberMember+"\\"+"age"+".txt");
                File fileDir10 = new File("library\\"+numberMember+"\\"+"sex"+".txt");
                    fileDir8.delete();
               fileDir9.delete();
                fileDir10.delete();
             dir2.delete();
             fileDir1.delete();
              fileDir2.delete();
               fileDir3.delete();
                fileDir4.delete();
                fileDir5.delete();
               fileDir6.delete();
                fileDir7.delete();
               dir2.delete();
	JOptionPane.showMessageDialog (null,"حذف شد"+""+numberMember+" "+"این عضو با شماره عضویت", "خطا", JOptionPane.INFORMATION_MESSAGE);
	        
	    } 
	
	   catch (Exception e)
	   {
		 JOptionPane.showMessageDialog (null, "شماره عضویت اشتباه است", "خطا", JOptionPane.INFORMATION_MESSAGE);
	   }
     
     
     
     }
     
        //=========================================
        BufferedReader in;
     public void showMember(){
     
//String d=numberRemember.getText();
 Member member=new Member();
   member.membershipNumber=Long.parseLong(numberRemember.getText());
   String str2,str3,str4;
        try {
           
		File fileDir1 = new File("library\\"+member.membershipNumber+"\\"+"fullname"+".txt");
                File fileDir2 = new File("library\\"+member.membershipNumber+"\\"+"age"+".txt");
	        File fileDir3 = new File("library\\"+member.membershipNumber+"\\"+"sex"+".txt");
                
		in = new BufferedReader(
		 new InputStreamReader(
                      new FileInputStream(fileDir1), "UTF8"));
		      
		
		      
		while ((str2 = in.readLine()) != null) {
		
                    labelfullname.setText(str2);
		}
              		       
                in.close();
             
                	in = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir2), "UTF8"));
		      
		
		      
		while ((str3 = in.readLine()) != null) {
		
                    labelAge.setText(str3);
		}
              		        
                in.close();
                	in = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir3), "UTF8"));
		      
		
		      
		while ((str4 = in.readLine()) != null) {
		  
                    labelSex.setText(str4);
		}
              	in.close();	        
                
	    } 
	    catch (UnsupportedEncodingException e) 
	    {
			System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog (null, "شماره عضویت موجود نیست", "خطا", JOptionPane.INFORMATION_MESSAGE);
	    } 
	    catch (IOException e) 
	    {
			System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog (null, "شماره عضویت موجود نیست", "خطا", JOptionPane.INFORMATION_MESSAGE);
	    }
	    catch (Exception e)
	    {
			System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog (null, "شماره عضویت موجود نیست", "خطا", JOptionPane.INFORMATION_MESSAGE);
	    }
     
     
     
     }
     //======================
     boolean falgeSearch;
     boolean falgeSearchBook;
     boolean falgeSearchMember;
     public boolean searchBook(String name){
      
     Book book=new Book();
   book.name=name;
   
boolean flg;
    
              
           try {
		File fileDir1 = new File("library\\"+ book.name+"\\"+"name"+".txt");
                File fileDir2 = new File("library\\"+ book.name+"\\"+"nevisande"+".txt");
                File fileDir3 = new File("library\\"+ book.name+"\\"+"shabak"+".txt");
                File fileDir4 = new File("library\\"+ book.name+"\\"+"tittle"+".txt");
                
		in = new BufferedReader(
		 new InputStreamReader(
                      new FileInputStream(fileDir1), "UTF8"));
		     in.close();
                      
	flg=true;
	    } 
	    catch (UnsupportedEncodingException e) 
	    {
                  flg=false;
			
	    } 
	    catch (IOException e) 
	    {  flg=false;
            }
	    catch (Exception e)
	    { flg=false;
			
	    }
     if(flg)
         return true;
         else
         return false;
     }
     
     //=================================
     public void showBook(){
     
     Book book=new Book();
   book.name=jtfNmameBook.getText();
   String str2,str3,str4,str5;

    
              
           try {
		File fileDir1 = new File("library\\"+ book.name+"\\"+"name"+".txt");
                File fileDir2 = new File("library\\"+ book.name+"\\"+"nevisande"+".txt");
                File fileDir3 = new File("library\\"+ book.name+"\\"+"shabak"+".txt");
                File fileDir4 = new File("library\\"+ book.name+"\\"+"tittle"+".txt");
                
		in = new BufferedReader(
		 new InputStreamReader(
                      new FileInputStream(fileDir1), "UTF8"));
		      
		
		      
		while ((str2 = in.readLine()) != null) {
		
                   jLabelNameBook.setText(str2);
		}
              		       
                in.close();
             
                	in = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir2), "UTF8"));
		      
		
		      
		while ((str3 = in.readLine()) != null) {
		
                     jLabelnamenevi.setText(str3);
		}
              		        
                in.close();
                	in = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir3), "UTF8"));
		      
		
		      
		while ((str4 = in.readLine()) != null) {
		  
                     jLabelshabak.setText(str4);
		}
              	in.close();	
                    	in = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir4), "UTF8"));
		      
		
		      
		while ((str5 = in.readLine()) != null) {
		  
                     jLabeltittle.setText(str5);
		}
              	in.close();
                
	    } 
	    catch (UnsupportedEncodingException e) 
	    {
			System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog (null, "", "با این نام کتابی موجود نیست", JOptionPane.INFORMATION_MESSAGE);
	    } 
	    catch (IOException e) 
	    {
			System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog (null, "با این نام کتابی موجود نیست", "خطا", JOptionPane.INFORMATION_MESSAGE);
	    }
	    catch (Exception e)
	    {
			System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog (null, "با این نام کتابی موجود نیست", "خطا", JOptionPane.INFORMATION_MESSAGE);
	    }
     
     
     }/////////////////////////
     
     public void showAferRegisterMember(String fn,String ag,String sex,String num){
     
     jLabel35.setText(fn);
        jLabel36.setText(ag);
           jLabel37.setText(sex);
              jLabel38.setText(num);
         
     }
 
     //=============================================
     public void deleteBook(String nameBook){
     
		

    
	File dir = new File("library");
		dir.mkdir();
               
                File dir2 = new File("library//"+nameBook);
		dir2.mkdir();

    
              
           try {
		File fileDir1 = new File("library\\"+nameBook+"\\"+"name"+".txt");
                File fileDir2 = new File("library\\"+nameBook+"\\"+"nevisande"+".txt");
                File fileDir3 = new File("library\\"+nameBook+"\\"+"shabak"+".txt");
                File fileDir4 = new File("library\\"+nameBook+"\\"+"tittle"+".txt");
             fileDir1.delete();
              fileDir2.delete();
               fileDir3.delete();
                fileDir4.delete();
             dir2.delete();
	
	        JOptionPane.showMessageDialog (null, "کتاب مورد نظر حذف شد","پیام" , JOptionPane.INFORMATION_MESSAGE);
	    } 
	
	   catch (Exception e)
	   {
		System.out.println(e.getMessage());
                JOptionPane.showMessageDialog (null, "کتاب با این نام موجود نمی باشد","پیام" , JOptionPane.INFORMATION_MESSAGE);
	   }
     
     
     
     
     
     }
     
     /////////////////////////////////////////////
     boolean flageedit;
     public void editBook(){
      if(!searchBook(jTextField3.getText())){
        JOptionPane.showMessageDialog (null, "نام کتاب موجود نیست", "خطا", JOptionPane.INFORMATION_MESSAGE);
      }
      else{
         String str=jTextField2.getText();;
         int flag=0;
         Book book=new Book();
      if(jComboBox1.getSelectedItem()=="عنوان"){
         
         flag=1;
      }
     if(jComboBox1.getSelectedItem()=="نویسنده"){
       
     flag=2;
     }
     if(jComboBox1.getSelectedItem()=="شابک"){
         
         flag=3;
     }
     
     book.name=jTextField3.getText();
    
       JOptionPane.showMessageDialog (null, "ویرایش با موفقیت انجام شد", "خطا", JOptionPane.INFORMATION_MESSAGE);
    
              
           try {
               if(flag==1){
		  File fileDir1 = new File("library\\"+book.name+"\\"+"tittle"+".txt");
                	 out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir1), "UTF8"));
		out1.append(str).append("");
		out1.flush();
		out1.close();
               }
               if(flag==2){
                File fileDir2 = new File("library\\"+book.name+"\\"+"nevisande"+".txt");
                      out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir2), "UTF8"));
		out1.append(str).append("");
		out1.flush();
		out1.close();
               }
                  if(flag==3){
                      File fileDir3 = new File("library\\"+book.name+"\\"+"shabak"+".txt");
                          out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir3), "UTF8"));
		out1.append(str).append("");
		out1.flush();
		out1.close();
                  }
               
              
             
	
          
	        
	    } 
	   catch (UnsupportedEncodingException e) 
	   {
		System.out.println(e.getMessage());
                
	   } 
	   catch (IOException e) 
	   {
		System.out.println(e.getMessage());
	    }
	   catch (Exception e)
	   {
		System.out.println(e.getMessage());
	   }
     
     
     
              }
     }
     
     //==================================
     
     public void addBook(String nameBook,String shabak,String tittle,String nameNevisande)
    {
     Book book=new Book();
     book.name=nameBook;
     book.nevisande.fullname=nameNevisande;
     book.shabak=shabak;
     book.tittle=tittle;
     
     
	File dir = new File("library");
		dir.mkdir();
               
                File dir2 = new File("library//"+book.name);
		dir2.mkdir();

    
              
           try {
		File fileDir1 = new File("library\\"+book.name+"\\"+"name"+".txt");
                File fileDir2 = new File("library\\"+book.name+"\\"+"nevisande"+".txt");
                File fileDir3 = new File("library\\"+book.name+"\\"+"shabak"+".txt");
                File fileDir4 = new File("library\\"+book.name+"\\"+"tittle"+".txt");
             
		 out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir1), "UTF8"));
		out1.append(book.name).append("");
		out1.flush();
		out1.close();
                 out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir2), "UTF8"));
		out1.append(""+ book.nevisande.fullname).append("");
		out1.flush();
		out1.close();
                 out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir3), "UTF8"));
		out1.append(book.shabak).append("");
		out1.flush();
		out1.close();
                   out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir4), "UTF8"));
		out1.append(book.tittle).append("");
		out1.flush();
		out1.close();
	        
	    } 
	   catch (UnsupportedEncodingException e) 
	   {
		System.out.println(e.getMessage());
                
	   } 
	   catch (IOException e) 
	   {
		System.out.println(e.getMessage());
	    }
	   catch (Exception e)
	   {
		System.out.println(e.getMessage());
	   }
     
     
     
     }
     
     //===============================
     
     
     
   public void addmember(String fullname,Short age, String  sex)
   {
       int ti=0;
       Member member=new Member();
      member.membershipNumber=number;
   String str2;
        try {
           
		File fileDir1 = new File("library\\"+"valnumber"+".txt");
                
                
		in = new BufferedReader(
		 new InputStreamReader(
                      new FileInputStream(fileDir1), "UTF8"));
		      
		
		      
		while ((str2 = in.readLine()) != null) {
		
                   jLabel46.setText(str2);
		}
              		 ti=Integer.parseInt(jLabel46.getText());
                   in.close();
             ti++;
              File fileDir4 = new File("library\\"+"valnumber"+".txt");
             	 out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir1), "UTF8"));
		out1.append(""+ti).append("");
		out1.flush();
		out1.close();
        	    member.membershipNumber+=ti;    
                
	    } 
	    catch (UnsupportedEncodingException e) 
	    {
			System.out.println(e.getMessage());
                        //JOptionPane.showMessageDialog (null, "شماره عضویت موجود نیست", "خطا", JOptionPane.INFORMATION_MESSAGE);
	    } 
	    catch (IOException e) 
	    {
			System.out.println(e.getMessage());
                       // JOptionPane.showMessageDialog (null, "شماره عضویت موجود نیست", "خطا", JOptionPane.INFORMATION_MESSAGE);
	    }
	    catch (Exception e)
	    {
			System.out.println(e.getMessage());
                       // JOptionPane.showMessageDialog (null, "شماره عضویت موجود نیست", "خطا", JOptionPane.INFORMATION_MESSAGE);
	    }
     
     
  /////////////////////////////
   
   member.fullname=fullname;
   member.age=age;
   member.sex=sex;

  if(searchMember(""+member.membershipNumber)){
JOptionPane.showMessageDialog (null, "dxcecerc","پیام" , JOptionPane.INFORMATION_MESSAGE);
     
  }
  else{ 
       showAferRegisterMember(fullname,""+age, sex,""+member.membershipNumber);
	File dir = new File("library");
		dir.mkdir();
               
                File dir2 = new File("library//"+member.membershipNumber);
		dir2.mkdir();

    
              
           try {
		File fileDir1 = new File("library\\"+member.membershipNumber+"\\"+"fullname"+".txt");
                File fileDir2 = new File("library\\"+member.membershipNumber+"\\"+"age"+".txt");
                File fileDir3 = new File("library\\"+member.membershipNumber+"\\"+"sex"+".txt");
            
		 out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir1), "UTF8"));
		out1.append( member.fullname).append("");
		out1.flush();
		out1.close();
                 out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir2), "UTF8"));
		out1.append(""+member.age).append("");
		out1.flush();
		out1.close();
                 out1 = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir3), "UTF8"));
		out1.append( member.sex).append("");
		out1.flush();
		out1.close();
	        
	    } 
	   catch (UnsupportedEncodingException e) 
	   {
		System.out.println(e.getMessage());
                
	   } 
	   catch (IOException e) 
	   {
		System.out.println(e.getMessage());
	    }
	   catch (Exception e)
	   {
		System.out.println(e.getMessage());
	   } 
   }
  
   }
         //========================================
   
   public void showImformationBookForMember(){
   
      
          Book book=new Book();
   book.name=jtfNmameBook.getText();
   Member member=new Member();
    member.membershipNumber=numbermbrIn;
   String str2,str3,str4;

    
              
           try {
	File fileDir1 = new File("library\\"+member.membershipNumber+"\\"+"books"+".txt");
                File fileDir2 = new File("library\\"+member.membershipNumber+"\\"+"numberBooks"+".txt");
                File fileDir3 = new File("library\\"+member.membershipNumber+"\\"+"date"+".txt");
                
		in = new BufferedReader(
		 new InputStreamReader(
                      new FileInputStream(fileDir1), "UTF8"));
		      
		
		      
		while ((str2 = in.readLine()) != null) {
		
                   jEditorPane1.setText(str2);
		}
              		       
                in.close();
             
                	in = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir2), "UTF8"));
		      
		
		      
		while ((str3 = in.readLine()) != null) {
		
                     jLabel32.setText(str3);
		}
              		        
                in.close();
                	in = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir3), "UTF8"));
		      
		
		      
		while ((str4 = in.readLine()) != null) {
		  
                     jEditorPane2.setText(str4);
		}
              	in.close();	
    
                
	    } 
	    catch (UnsupportedEncodingException e) 
	    {
			System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog (null, "", "با این نام کتابی موجود نیست", JOptionPane.INFORMATION_MESSAGE);
	    } 
	    catch (IOException e) 
	    {
			System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog (null, "با این نام کتابی موجود نیست", "خطا", JOptionPane.INFORMATION_MESSAGE);
	    }
	    catch (Exception e)
	    {
			System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog (null, "با این نام کتابی موجود نیست", "خطا", JOptionPane.INFORMATION_MESSAGE);
	    }
       
       
       
       
       
   
   
   }
   
   //===================
int w=400,h=400;
//................................................................
    public Librery() {
        initComponents();
        
        add(new Background());
        //=========
             this.setLocationRelativeTo(null); 
       
                        this.setResizable(false);
                          this.setSize(w,h);
               this.setTitle("سامانه کتابخانه ");
           
        
        
        //===========================
                  register.setLocationRelativeTo(null); 
       
                        register.setResizable(false);
                          register.setSize(w,h);
            register.setTitle("سامانه کتابخانه ");
                 
      
        //==============
               showMember.setLocationRelativeTo(null); 
       
                         showMember.setResizable(false);
                           showMember.setSize(w,h);
               showMember.setSize(w,h);
                    
                   showMember .setTitle("سامانه کتابخانه ");
                   ///=============
                   
        //==============================
      showMember_sub.setLocationRelativeTo(null); 
       
                         showMember_sub.setResizable(false);
                         showMember_sub.setSize(w,h);
               showMember_sub.setSize(w,h);
                   showMember .setTitle("سامانه کتابخانه ");
                    //=================================================================
                    
        addBook.setLocationRelativeTo(null); 
       
                        addBook.setResizable(false);
                       addBook.setSize(w,h);
            
                  addBook .setTitle("سامانه کتابخانه ");
                   
             ////////==============================================
                    deletedBook.setLocationRelativeTo(null); 
       
                       deletedBook.setResizable(false);
                       deletedBook.setSize(w,h);
             deletedBook .setTitle("سامانه کتابخانه ");
                   
               ///==========================================
                   
                        showBook.setLocationRelativeTo(null); 
       
                      showBook.setResizable(false);
                      showBook.setSize(w,h);
           showBook .setTitle("سامانه کتابخانه ");
                  
                 
                   //=============================
                       show_book.setLocationRelativeTo(null); 
       
                        show_book.setResizable(false);
                        show_book.setSize(w,h);
                 show_book.setTitle("سامانه کتابخانه ");
                    
                   //==========================
                    
                      show_book.setLocationRelativeTo(null); 
       
                       jfSearchBook.setResizable(false);
                       jfSearchBook.setSize(w,h);
             jfSearchBook.setTitle("سامانه کتابخانه ");
                   
                    //================
                      editBook.setLocationRelativeTo(null); 
       
                       editBook.setResizable(false);
                       editBook.setSize(w,h);
              editBook.setTitle("سامانه کتابخانه ");
                 
                   //=====================================
                       amanat.setLocationRelativeTo(null); 
       
                       amanat.setResizable(false);
                       amanat.setSize(w,h);
              
                 amanat .setTitle("سامانه کتابخانه ");
                //======================
                      environmentMember.setLocationRelativeTo(null); 
       
                       environmentMember.setResizable(false);
                       environmentMember.setSize(w,h);
             environmentMember.setTitle("سامانه کتابخانه ");
                  
                   
                  //========================
                   
                      inMember.setLocationRelativeTo(null); 
       
                       inMember.setResizable(false);
                       inMember.setSize(w,h);
             inMember .setTitle("سامانه کتابخانه ");
                   
               
                   //=============================
                   
                    informationBook_Member.setLocationRelativeTo(null); 
       
                       informationBook_Member.setResizable(false);
                       informationBook_Member.setSize(w,h);
             informationBook_Member .setTitle("سامانه کتابخانه ");
                   //=========================
              
                      removeMember.setLocationRelativeTo(null); 
       
                       removeMember.setResizable(false);
                       removeMember.setSize(w,h);
             removeMember.setTitle("سامانه کتابخانه ");
              //=================================
                           editMember.setLocationRelativeTo(null); 
       
                       editMember.setResizable(false);
                       editMember.setSize(w,h);
                       editMember.setTitle("سامانه کتابخانه ");
              
              //====================
                        admin.setLocationRelativeTo(null); 
       
                       admin.setResizable(false);
                       admin.setSize(w,h);
                       admin.setTitle("سامانه کتابخانه ");
              //=======================================///////////////////////////
                       manageMember.setLocationRelativeTo(null); 
       
                       manageMember.setResizable(false);
                       manageMember.setSize(w,h);
                      manageMember .setTitle("سامانه کتابخانه ");
                       //================
                            maneageBook.setLocationRelativeTo(null); 
       
                       maneageBook.setResizable(false);
                       maneageBook.setSize(w,h);
                     maneageBook .setTitle("سامانه کتابخانه ");
                       //showAfterRigister
                       //=====================
                            mangmentLogIn.setLocationRelativeTo(null); 
       
                       mangmentLogIn.setResizable(false);
                       mangmentLogIn.setSize(w,h);
                      mangmentLogIn .setTitle("سامانه کتابخانه ");
                       //====================
               showAfterRigister.setLocationRelativeTo(null); 
       
                         showAfterRigister.setResizable(false);
                         showAfterRigister.setSize(w,h);
                      showAfterRigister .setTitle("سامانه کتابخانه ");
                       
                       
                       
                       
                       
    }
////=================
 
    
    public void logIn(String patch){
    
    
    
    }
    
    ///===================
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inMember = new javax.swing.JFrame();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        register = new javax.swing.JFrame();
        fullname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        showAfterRigister = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jButton43 = new javax.swing.JButton();
        admin = new javax.swing.JFrame();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        manageMember = new javax.swing.JFrame();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        maneageBook = new javax.swing.JFrame();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        showMember = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        numberRemember = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        environmentMember = new javax.swing.JFrame();
        jButton38 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jButton49 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        showMember_sub = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelfullname = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        labelSex = new javax.swing.JLabel();
        labelNumbergetBook = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        addBook = new javax.swing.JFrame();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jTextnameBook = new javax.swing.JTextField();
        jTextTittle = new javax.swing.JTextField();
        jTextNameNevisande = new javax.swing.JTextField();
        jTextShabak = new javax.swing.JTextField();
        deletedBook = new javax.swing.JFrame();
        fieldNameBook = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        showBook = new javax.swing.JFrame();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabelNameBook = new javax.swing.JLabel();
        jLabeltittle = new javax.swing.JLabel();
        jLabelnamenevi = new javax.swing.JLabel();
        jLabelshabak = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        show_book = new javax.swing.JFrame();
        jtfNmameBook = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jfSearchBook = new javax.swing.JFrame();
        jButton28 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        searchNameBook = new javax.swing.JTextField();
        jButton29 = new javax.swing.JButton();
        editBook = new javax.swing.JFrame();
        jTextField2 = new javax.swing.JTextField();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jMenuItem4 = new javax.swing.JMenuItem();
        amanat = new javax.swing.JFrame();
        jLabel24 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel26 = new javax.swing.JLabel();
        informationBook_Member = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton47 = new javax.swing.JButton();
        removeMember = new javax.swing.JFrame();
        jLabel33 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        editMember = new javax.swing.JFrame();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel43 = new javax.swing.JLabel();
        jButton44 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        mangmentLogIn = new javax.swing.JFrame();
        jTextField11 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jLabel46 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();

        jLabel1.setText("نام کاربری");

        jLabel2.setText("رمز عبور");

        jPasswordField1.setText("jPasswordField1");

        jButton3.setText("ورود");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton39.setText("برگشت");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jMenu7.setText("راهنما");

        jMenuItem7.setText("نام کاربری و رمز عبور شماره عضویت شما می باشد");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuBar6.add(jMenu7);

        inMember.setJMenuBar(jMenuBar6);

        javax.swing.GroupLayout inMemberLayout = new javax.swing.GroupLayout(inMember.getContentPane());
        inMember.getContentPane().setLayout(inMemberLayout);
        inMemberLayout.setHorizontalGroup(
            inMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inMemberLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(inMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inMemberLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton39)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        inMemberLayout.setVerticalGroup(
            inMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inMemberLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(inMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(inMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton39))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jLabel4.setText("سن");

        sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "مذکر", "مونث" }));
        sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexActionPerformed(evt);
            }
        });

        jLabel5.setText("نام و نام خانوادگی");

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        jLabel6.setText("جنسیت");

        jButton5.setText("ثبت نام");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("برگشت");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register.getContentPane());
        register.getContentPane().setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerLayout.createSequentialGroup()
                        .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerLayout.createSequentialGroup()
                        .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerLayout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jLabel3.setText("ثبت نام با موفقیت انجام شد");

        jLabel34.setText("مشخصات فرد عضو شده:");

        jLabel35.setText(".......................");

        jLabel36.setText(".......................");

        jLabel37.setText(".......................");

        jLabel38.setText(".......................");

        jLabel39.setText("نام و نام خانوادگی:");

        jLabel40.setText("سن:");

        jLabel41.setText("جنسیت:");

        jLabel42.setText("شماره عضویت:");

        jButton43.setText("برگشت");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout showAfterRigisterLayout = new javax.swing.GroupLayout(showAfterRigister.getContentPane());
        showAfterRigister.getContentPane().setLayout(showAfterRigisterLayout);
        showAfterRigisterLayout.setHorizontalGroup(
            showAfterRigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showAfterRigisterLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel3)
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showAfterRigisterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(showAfterRigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showAfterRigisterLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showAfterRigisterLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showAfterRigisterLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showAfterRigisterLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39))
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton43, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        showAfterRigisterLayout.setVerticalGroup(
            showAfterRigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showAfterRigisterLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addGroup(showAfterRigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(showAfterRigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(showAfterRigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(showAfterRigisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel42))
                .addGap(31, 31, 31)
                .addComponent(jButton43)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jButton10.setText("مدیریت کتاب");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("مدیریت اعضا");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton7.setText("امانت دادن کتاب");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton33.setText("برگشت");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminLayout = new javax.swing.GroupLayout(admin.getContentPane());
        admin.getContentPane().setLayout(adminLayout);
        adminLayout.setHorizontalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        adminLayout.setVerticalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton33)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jButton12.setText("ثبت نام");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("حذف عضو");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("نمایش عضو");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton40.setText("برگشت");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton48.setText("ویرایش عضو");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageMemberLayout = new javax.swing.GroupLayout(manageMember.getContentPane());
        manageMember.getContentPane().setLayout(manageMemberLayout);
        manageMemberLayout.setHorizontalGroup(
            manageMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageMemberLayout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addGroup(manageMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(jButton40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        manageMemberLayout.setVerticalGroup(
            manageMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageMemberLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14)
                .addGap(7, 7, 7)
                .addComponent(jButton48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton40)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jButton15.setText("افزودن کتاب");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("حذف کتاب");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("نمایش کتاب");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("جست و جو");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("ویرایش کتاب");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton4.setText("برگشت");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout maneageBookLayout = new javax.swing.GroupLayout(maneageBook.getContentPane());
        maneageBook.getContentPane().setLayout(maneageBookLayout);
        maneageBookLayout.setHorizontalGroup(
            maneageBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(maneageBookLayout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addGroup(maneageBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        maneageBookLayout.setVerticalGroup(
            maneageBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maneageBookLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jLabel7.setText("شماره عضویت");

        jButton8.setText("نمایش");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        numberRemember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberRememberActionPerformed(evt);
            }
        });

        jButton9.setText("برگشت");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout showMemberLayout = new javax.swing.GroupLayout(showMember.getContentPane());
        showMember.getContentPane().setLayout(showMemberLayout);
        showMemberLayout.setHorizontalGroup(
            showMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showMemberLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(showMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showMemberLayout.createSequentialGroup()
                        .addComponent(numberRemember, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showMemberLayout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8)
                        .addGap(74, 74, 74))))
        );
        showMemberLayout.setVerticalGroup(
            showMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showMemberLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(showMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberRemember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(showMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(304, Short.MAX_VALUE))
        );

        jButton38.setText("جستجو");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel28.setText("نام کتاب");

        jButton49.setText("برگشت");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jMenu1.setText("منو");

        jMenuItem1.setText("اطلاعات کتاب های گرفته شده");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        environmentMember.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout environmentMemberLayout = new javax.swing.GroupLayout(environmentMember.getContentPane());
        environmentMember.getContentPane().setLayout(environmentMemberLayout);
        environmentMemberLayout.setHorizontalGroup(
            environmentMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, environmentMemberLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(environmentMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(environmentMemberLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, environmentMemberLayout.createSequentialGroup()
                        .addComponent(jButton49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addGap(19, 19, 19))
        );
        environmentMemberLayout.setVerticalGroup(
            environmentMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(environmentMemberLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(environmentMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(environmentMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton49)
                    .addComponent(jButton38))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jLabel8.setText("نام و نام خانوادگی:");

        jLabel9.setText("سن:");

        jLabel10.setText("جنسیت:");

        jLabel11.setText("تعداد کتاب های گرفته:");

        labelfullname.setText(".................");

        labelAge.setText(".................");

        labelSex.setText(".................");

        labelNumbergetBook.setText(".................");

        jButton20.setText("برگشت");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout showMember_subLayout = new javax.swing.GroupLayout(showMember_sub.getContentPane());
        showMember_sub.getContentPane().setLayout(showMember_subLayout);
        showMember_subLayout.setHorizontalGroup(
            showMember_subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showMember_subLayout.createSequentialGroup()
                .addGroup(showMember_subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showMember_subLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelSex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showMember_subLayout.createSequentialGroup()
                        .addContainerGap(230, Short.MAX_VALUE)
                        .addGroup(showMember_subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showMember_subLayout.createSequentialGroup()
                                .addComponent(labelfullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showMember_subLayout.createSequentialGroup()
                                .addComponent(labelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addComponent(jButton20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showMember_subLayout.createSequentialGroup()
                                .addComponent(labelNumbergetBook, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))))
                .addContainerGap())
        );
        showMember_subLayout.setVerticalGroup(
            showMember_subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showMember_subLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(showMember_subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(showMember_subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(showMember_subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labelSex))
                .addGap(33, 33, 33)
                .addGroup(showMember_subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labelNumbergetBook))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jButton20)
                .addGap(23, 23, 23))
        );

        jLabel12.setText("نام کتاب");

        jLabel13.setText("عنوان ");

        jLabel14.setText("نام نویسنده");

        jLabel16.setText("شابک کتاب");

        jButton21.setText("ثبت");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("برگشت");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jTextNameNevisande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameNevisandeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addBookLayout = new javax.swing.GroupLayout(addBook.getContentPane());
        addBook.getContentPane().setLayout(addBookLayout);
        addBookLayout.setHorizontalGroup(
            addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookLayout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addBookLayout.createSequentialGroup()
                        .addGroup(addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextnameBook)
                            .addComponent(jTextTittle)
                            .addComponent(jTextNameNevisande)
                            .addComponent(jTextShabak, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(addBookLayout.createSequentialGroup()
                        .addComponent(jButton22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        addBookLayout.setVerticalGroup(
            addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextnameBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextNameNevisande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextShabak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jButton22))
                .addGap(35, 35, 35))
        );

        jLabel15.setText("نام کتاب");

        jButton23.setText("حذف");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText("برگشت");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletedBookLayout = new javax.swing.GroupLayout(deletedBook.getContentPane());
        deletedBook.getContentPane().setLayout(deletedBookLayout);
        deletedBookLayout.setHorizontalGroup(
            deletedBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletedBookLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(deletedBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, deletedBookLayout.createSequentialGroup()
                        .addComponent(jButton24)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deletedBookLayout.createSequentialGroup()
                        .addComponent(fieldNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        deletedBookLayout.setVerticalGroup(
            deletedBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletedBookLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(deletedBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(29, 29, 29)
                .addGroup(deletedBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23)
                    .addComponent(jButton24))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jLabel17.setText("عنوان :");

        jLabel18.setText("نام نویسنده:");

        jLabel19.setText("شابک کتاب:");

        jLabel20.setText("نام کتاب:");

        jLabelNameBook.setText("..............");

        jLabeltittle.setText("..............");

        jLabelnamenevi.setText("..............");

        jLabelshabak.setText("..............");

        jButton25.setText("برگشت");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout showBookLayout = new javax.swing.GroupLayout(showBook.getContentPane());
        showBook.getContentPane().setLayout(showBookLayout);
        showBookLayout.setHorizontalGroup(
            showBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showBookLayout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addGroup(showBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showBookLayout.createSequentialGroup()
                        .addGroup(showBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showBookLayout.createSequentialGroup()
                                .addComponent(jLabelnamenevi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showBookLayout.createSequentialGroup()
                                .addComponent(jLabeltittle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showBookLayout.createSequentialGroup()
                                .addComponent(jLabelNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showBookLayout.createSequentialGroup()
                                .addComponent(jLabelshabak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showBookLayout.createSequentialGroup()
                        .addComponent(jButton25)
                        .addGap(19, 19, 19))))
        );
        showBookLayout.setVerticalGroup(
            showBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showBookLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(showBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabelNameBook))
                .addGap(18, 18, 18)
                .addGroup(showBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabeltittle))
                .addGap(18, 18, 18)
                .addGroup(showBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabelnamenevi))
                .addGap(18, 18, 18)
                .addGroup(showBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabelshabak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jButton25)
                .addGap(37, 37, 37))
        );

        jLabel21.setText("نام کتاب");

        jButton26.setText("نمایش");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("برگشت");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout show_bookLayout = new javax.swing.GroupLayout(show_book.getContentPane());
        show_book.getContentPane().setLayout(show_bookLayout);
        show_bookLayout.setHorizontalGroup(
            show_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_bookLayout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(show_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, show_bookLayout.createSequentialGroup()
                        .addComponent(jtfNmameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addGap(48, 48, 48))
                    .addGroup(show_bookLayout.createSequentialGroup()
                        .addComponent(jButton27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton26)
                        .addContainerGap())))
        );
        show_bookLayout.setVerticalGroup(
            show_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_bookLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(show_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNmameBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(45, 45, 45)
                .addGroup(show_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton26)
                    .addComponent(jButton27))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jButton28.setText("جستجو");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel22.setText("نام کتاب");

        jButton29.setText("برگشت");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jfSearchBookLayout = new javax.swing.GroupLayout(jfSearchBook.getContentPane());
        jfSearchBook.getContentPane().setLayout(jfSearchBookLayout);
        jfSearchBookLayout.setHorizontalGroup(
            jfSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfSearchBookLayout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(jfSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfSearchBookLayout.createSequentialGroup()
                        .addComponent(searchNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22))
                    .addGroup(jfSearchBookLayout.createSequentialGroup()
                        .addComponent(jButton29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton28)))
                .addContainerGap())
        );
        jfSearchBookLayout.setVerticalGroup(
            jfSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfSearchBookLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jfSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(searchNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jfSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton28)
                    .addComponent(jButton29))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jButton30.setText("تایید");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("برگشت");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "عنوان", "نویسنده", "شابک" }));

        jLabel23.setText("نام کتاب");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editBookLayout = new javax.swing.GroupLayout(editBook.getContentPane());
        editBook.getContentPane().setLayout(editBookLayout);
        editBookLayout.setHorizontalGroup(
            editBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editBookLayout.createSequentialGroup()
                .addGroup(editBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editBookLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editBookLayout.createSequentialGroup()
                        .addGap(96, 181, Short.MAX_VALUE)
                        .addGroup(editBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editBookLayout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23))
                            .addGroup(editBookLayout.createSequentialGroup()
                                .addComponent(jButton31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(56, 56, 56))
        );
        editBookLayout.setVerticalGroup(
            editBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBookLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(editBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(editBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30)
                    .addComponent(jButton31))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jMenuItem4.setText("jMenuItem4");

        jLabel24.setText("نام کتاب");

        jButton34.setText("استعلام");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel25.setText("شماره عضویت");

        jButton35.setText("استعلام");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setText("دریافت کتاب");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setText("برگشت");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jLabel27.setText("تاریخ برگرداندن");

        jTextField6.setText("__/___/___");

        jMenu3.setText("راهنما");

        jMenuItem2.setText("ابتدا از نام کتاب و شماره عضویت  استعلام بگیرید بعد دکمه دریافت کتاب رو بزنید ");
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        amanat.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout amanatLayout = new javax.swing.GroupLayout(amanat.getContentPane());
        amanat.getContentPane().setLayout(amanatLayout);
        amanatLayout.setHorizontalGroup(
            amanatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, amanatLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(amanatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(amanatLayout.createSequentialGroup()
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton36)
                        .addGap(76, 76, 76))
                    .addGroup(amanatLayout.createSequentialGroup()
                        .addGroup(amanatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton34, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton35, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(amanatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(amanatLayout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27))
                            .addGroup(amanatLayout.createSequentialGroup()
                                .addGroup(amanatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(jTextField5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(amanatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24))))
                        .addGap(33, 33, 33))))
        );
        amanatLayout.setVerticalGroup(
            amanatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amanatLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(amanatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34))
                .addGap(18, 18, 18)
                .addGroup(amanatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35))
                .addGap(10, 10, 10)
                .addGroup(amanatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(amanatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton36)
                    .addComponent(jButton37))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jLabel26.setText("jLabel26");

        jScrollPane1.setViewportView(jEditorPane1);

        jScrollPane2.setViewportView(jEditorPane2);

        jLabel29.setText("نام کتاب های گرفته شده");

        jLabel30.setText("تاریخ برگرداندن کتاب های گرفته شده");

        jLabel31.setText("تعداد کتاب های گرفته شده:");

        jLabel32.setBackground(java.awt.SystemColor.text);
        jLabel32.setText(".........");

        jButton47.setText("برگشت");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout informationBook_MemberLayout = new javax.swing.GroupLayout(informationBook_Member.getContentPane());
        informationBook_Member.getContentPane().setLayout(informationBook_MemberLayout);
        informationBook_MemberLayout.setHorizontalGroup(
            informationBook_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationBook_MemberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informationBook_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informationBook_MemberLayout.createSequentialGroup()
                        .addGap(0, 206, Short.MAX_VALUE)
                        .addGroup(informationBook_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informationBook_MemberLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informationBook_MemberLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton47)
                .addGap(22, 22, 22))
        );
        informationBook_MemberLayout.setVerticalGroup(
            informationBook_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationBook_MemberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informationBook_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton47)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel33.setText("شماره عضویت");

        jButton41.setText("حذف عضو");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setText("برگشت");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeMemberLayout = new javax.swing.GroupLayout(removeMember.getContentPane());
        removeMember.getContentPane().setLayout(removeMemberLayout);
        removeMemberLayout.setHorizontalGroup(
            removeMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeMemberLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(removeMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeMemberLayout.createSequentialGroup()
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeMemberLayout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addGap(23, 23, 23))))
        );
        removeMemberLayout.setVerticalGroup(
            removeMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeMemberLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(removeMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(removeMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton41)
                    .addComponent(jButton42))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "نام و نام خانوادگی", "سن", "جنسیت" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel43.setText("شماره عضویت");

        jButton44.setText("جستجو");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jButton45.setText("تایید");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setText("برگشت");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editMemberLayout = new javax.swing.GroupLayout(editMember.getContentPane());
        editMember.getContentPane().setLayout(editMemberLayout);
        editMemberLayout.setHorizontalGroup(
            editMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editMemberLayout.createSequentialGroup()
                .addGroup(editMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editMemberLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editMemberLayout.createSequentialGroup()
                        .addGap(19, 74, Short.MAX_VALUE)
                        .addGroup(editMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editMemberLayout.createSequentialGroup()
                                .addComponent(jButton44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel43))
                            .addGroup(editMemberLayout.createSequentialGroup()
                                .addComponent(jButton46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(56, 56, 56))
        );
        editMemberLayout.setVerticalGroup(
            editMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editMemberLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(editMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44))
                .addGap(25, 25, 25)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(editMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton45)
                    .addComponent(jButton46))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jLabel44.setText("نام کاربری");

        jLabel45.setText("رمز عبور");

        jPasswordField2.setText("jPasswordField1");

        jButton50.setText("ورود");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton51.setText("برگشت");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jMenu5.setText("راهنما");

        jMenuItem6.setText("نام کاربری و رمز عبور برای مدیر کلمه admin می باشد");
        jMenu5.add(jMenuItem6);

        jMenuBar5.add(jMenu5);

        mangmentLogIn.setJMenuBar(jMenuBar5);

        javax.swing.GroupLayout mangmentLogInLayout = new javax.swing.GroupLayout(mangmentLogIn.getContentPane());
        mangmentLogIn.getContentPane().setLayout(mangmentLogInLayout);
        mangmentLogInLayout.setHorizontalGroup(
            mangmentLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mangmentLogInLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(mangmentLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField11)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mangmentLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mangmentLogInLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton51)
                .addGap(18, 18, 18)
                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        mangmentLogInLayout.setVerticalGroup(
            mangmentLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mangmentLogInLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(mangmentLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addGap(18, 18, 18)
                .addGroup(mangmentLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mangmentLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton50)
                    .addComponent(jButton51))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jLabel46.setText("jLabel46");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("مدیریت کتابخانه");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("اعضا کتابخانه");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton52.setText("خروج");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(searchMember(jTextField1.getText())&&searchMember(jPasswordField1.getText()))  { 
    environmentMember.setVisible(true); 
    
    inMember.setVisible(false);
}
        else
    JOptionPane.showMessageDialog (null, "نام کاربری یا رمز عبور اشتباه است","پیام" , JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       admin.setVisible(false);
       manageMember.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       manageMember.setVisible(false);
       removeMember.setVisible(true);
      
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        manageMember.setVisible(false);
         showMember.setVisible(true);
       
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
      
        maneageBook.setVisible(false);
        jfSearchBook.setVisible(true);
       
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        admin.setVisible(false);
        maneageBook.setVisible(true);
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       showMember.setVisible(false);
       manageMember.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
showAfterRigister.setVisible(true);
register.setVisible(false);
        try{
        addmember(fullname.getText(),Short.parseShort(age.getText()),""+sex.getSelectedItem());
        }catch(NumberFormatException nm){
          JOptionPane.showMessageDialog (null, "ورودی ها چک شود","پیام" , JOptionPane.INFORMATION_MESSAGE);
        
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         mangmentLogIn.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numberRememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberRememberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberRememberActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     showMember();
     showMember_sub.setVisible(true);
      
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextNameNevisandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameNevisandeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameNevisandeActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
      addBook(jTextnameBook.getText(),jTextShabak.getText(),jTextTittle.getText(),jTextNameNevisande.getText());
        
       // addBook()
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
       deletedBook.setVisible(false);
       
        maneageBook.setVisible(true);
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
deleteBook(fieldNameBook.getText())   ;    
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        show_book.setVisible(true);
   
         maneageBook.setVisible(false);
       
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
     showBook();
     showBook.setVisible(true);
       show_book.setVisible(false);
       
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        show_book.setVisible(false);
        maneageBook.setVisible(true);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
       if(searchBook(searchNameBook.getText()))
         
           
           JOptionPane.showMessageDialog (null, "کتاب با این نام موجود است", "پیام", JOptionPane.INFORMATION_MESSAGE);
      
       else
       JOptionPane.showMessageDialog (null, "کتاب با این نام موجود نیست", "پیام", JOptionPane.INFORMATION_MESSAGE);
       
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
      
 
        
        editBook();
        
       
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        admin.setVisible(false);
        amanat.setVisible(true);


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed

               if(searchBook(jTextField4.getText()))
                 JOptionPane.showMessageDialog (null, "با این نام کتاب موجود است","پیام" , JOptionPane.INFORMATION_MESSAGE);
      else
                  JOptionPane.showMessageDialog (null, "با این نام کتاب موجود نیست","پیام" , JOptionPane.INFORMATION_MESSAGE);
 
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
    
        if(searchBook(jTextField4.getText())&&searchMember(jTextField5.getText())){
        getBook(jTextField5.getText(),jTextField4.getText(),jTextField6.getText());
        JOptionPane.showMessageDialog (null, "کتاب با موفقیت به امانت داده شد","پیام" , JOptionPane.INFORMATION_MESSAGE);
        }
        else   JOptionPane.showMessageDialog (null, "شماره عضویت یا نام کتاب چک شود","پیام" , JOptionPane.INFORMATION_MESSAGE);
            
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
       amanat.setVisible(false);
       admin.setVisible(true);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
    
        
          if(searchMember(jTextField5.getText()))
                 JOptionPane.showMessageDialog (null, "خطای شماره عضویت","پیام" , JOptionPane.INFORMATION_MESSAGE);
      else
                  JOptionPane.showMessageDialog (null, "خطای شماره عضویت","پیام" , JOptionPane.INFORMATION_MESSAGE);
               
        
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        manageMember.setVisible(false);
        register.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
       if (searchBook(jTextField7.getText()))
           JOptionPane.showMessageDialog (null, "این کتاب موجود میباشد می توانید به امانت بگیرید","پیام" , JOptionPane.INFORMATION_MESSAGE);
           else
           JOptionPane.showMessageDialog (null, "این کتاب موجود نمی باشد","پیام" , JOptionPane.INFORMATION_MESSAGE);
           
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
showImformationBookForMember(); 
informationBook_Member.setVisible(true);
environmentMember.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
admin.setVisible(false);
         mangmentLogIn.setVisible(true);

    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
          
        maneageBook.setVisible(false);
       addBook.setVisible(true);
          
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
         maneageBook.setVisible(true);
       addBook.setVisible(false);
       
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        deletedBook.setVisible(true);
         maneageBook.setVisible(false);
       
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
  showBook.setVisible(false);
        show_book.setVisible(true);
        
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
       jfSearchBook.setVisible(false);
     
        maneageBook.setVisible(true);
        
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        editBook.setVisible(true);
        
        maneageBook.setVisible(false);
       
    
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
      editBook.setVisible(false);
        maneageBook.setVisible(true);
         
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        maneageBook.setVisible(false);
     
          admin.setVisible(true);
      
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
      
       manageMember.setVisible(false);
        admin.setVisible(true);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        register.setVisible(false);
        
        manageMember.setVisible(true);
         
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        removeMember.setVisible(false);
        manageMember.setVisible(true);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        deleteMember(jTextField8.getText());
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
      showAfterRigister.setVisible(false);
        manageMember.setVisible(true);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
      if(searchMember(jTextField9.getText()))
                 JOptionPane.showMessageDialog (null, "این شماره عضویت موجود می می باشد","پیام" , JOptionPane.INFORMATION_MESSAGE);
      else
                  JOptionPane.showMessageDialog (null, "خطای شماره عضویت","پیام" , JOptionPane.INFORMATION_MESSAGE);
                      
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
       
        
        if(searchMember(jTextField9.getText())){
          
        updateMember();
      
        JOptionPane.showMessageDialog (null, "با موفقیت ویرایش عضو انجام شد","پیام" , JOptionPane.INFORMATION_MESSAGE);
}
else
             JOptionPane.showMessageDialog (null, "ایتدا جستجو کنید یا خطا در شماره عضویت","پیام" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
       editMember.setVisible(false);
       manageMember.setVisible(true);
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
       manageMember.setVisible(false);
       editMember.setVisible(true);
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       inMember.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        informationBook_Member.setVisible(false);
        environmentMember.setVisible(true);
        
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        inMember.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
       environmentMember.setVisible(false);
       inMember.setVisible(true);
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        showMember_sub.setVisible(false);
        showMember.setVisible(true);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
if(jTextField11.getText().equals("admin")&&jPasswordField2.getText().equals("admin")){
mangmentLogIn.setVisible(false);
admin.setVisible(true);
} else
     JOptionPane.showMessageDialog (null, "رمز عبور یا نام کاربری اشتباه است", "خطا", JOptionPane.INFORMATION_MESSAGE);
    
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        mangmentLogIn.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Librery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Librery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Librery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Librery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Librery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame addBook;
    private javax.swing.JFrame admin;
    private javax.swing.JTextField age;
    private javax.swing.JFrame amanat;
    private javax.swing.JFrame deletedBook;
    private javax.swing.JFrame editBook;
    private javax.swing.JFrame editMember;
    private javax.swing.JFrame environmentMember;
    private javax.swing.JTextField fieldNameBook;
    private javax.swing.JTextField fullname;
    private javax.swing.JFrame inMember;
    private javax.swing.JFrame informationBook_Member;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNameBook;
    private javax.swing.JLabel jLabelnamenevi;
    private javax.swing.JLabel jLabelshabak;
    private javax.swing.JLabel jLabeltittle;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextNameNevisande;
    private javax.swing.JTextField jTextShabak;
    private javax.swing.JTextField jTextTittle;
    private javax.swing.JTextField jTextnameBook;
    private javax.swing.JFrame jfSearchBook;
    private javax.swing.JTextField jtfNmameBook;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelNumbergetBook;
    private javax.swing.JLabel labelSex;
    private javax.swing.JLabel labelfullname;
    private javax.swing.JFrame manageMember;
    private javax.swing.JFrame maneageBook;
    private javax.swing.JFrame mangmentLogIn;
    private javax.swing.JTextField numberRemember;
    private javax.swing.JFrame register;
    private javax.swing.JFrame removeMember;
    private javax.swing.JTextField searchNameBook;
    private javax.swing.JComboBox sex;
    private javax.swing.JFrame showAfterRigister;
    private javax.swing.JFrame showBook;
    private javax.swing.JFrame showMember;
    private javax.swing.JFrame showMember_sub;
    private javax.swing.JFrame show_book;
    // End of variables declaration//GEN-END:variables
}
