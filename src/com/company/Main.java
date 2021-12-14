package com.company;

 public class Main{
     private int salary;private String name;
     public Main(){
         this.salary=100000;
         this.name="Rohit";
     }
     public  Main(int salary,String name){
         this.salary=salary;
         this.name=name;
     }
     public Main(Main em){
         this.salary=em.salary+30000+4000;
         this.name =em.name;
     } public void display(){
         System.out.println(salary+""+name);
     }
     public static void main(String[] args) {
         Main ob = new Main();
         Main ob2 = new Main(100000, "karan");
         Main ob3 = new Main(ob2);
         Main ob4=new Main(ob2);
         ob.display();
         ob2.display();
         ob3.display();
         ob4.display();
     }
 }