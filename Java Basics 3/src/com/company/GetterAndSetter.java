package com.company;

public class GetterAndSetter {
    public static void main(String[] args) {
        Person p=new Person();
        p.setFirstName("John");
        p.setSecondName("Smith");
        p.setAge(12);
        System.out.println(p.getFullName());
        System.out.println(p.getAge());
        System.out.println(p.isTeen());
    }
    public static class Person {
        String firstName,lastName;
        int age;
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public int getAge(){
            return age;
        }

        public void setFirstName(String firstName){
            this.firstName=firstName;
        }
        public void setSecondName(String lastName){
            this.lastName=lastName;
        }
        public void setAge(int age){
            if(getAge()<0||getAge()>100){
                this.age=0;
            }
            else{
                this.age=age;
            }
        }

        public boolean isTeen(){
            if(age>12&&age<20){
                return true;
            }else{
                return false;
            }
        }

        public String getFullName(){
            if(getFirstName()==null&&getLastName()==null){
                return (" ");
            }
            else if(getLastName()==null){
                return getFirstName();
            }
            else if(getFirstName()==null){
                return getLastName();
            }
            else{
                return (getFirstName()+" "+getLastName());
            }
        }
    }
}