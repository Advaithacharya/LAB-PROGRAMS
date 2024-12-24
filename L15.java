/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class Human{
    public void job(){
        System.out.println("Working professional");
    }
}
class Teacher extends Human{
    public void job(){
        System.out.println("Teacher");
    }
}
class Doctor extends Human{
    public void job(){
        System.out.println("Doctor");
    }
}
public class L15{
    public static void main(String[] args){
        Human Amar=new Human();
        Teacher Babu=new Teacher();
        Doctor Chandra=new Doctor();
        Human dinesh=new Doctor();
        Amar.job();
        Babu.job();
        Chandra.job();
        dinesh.job(); 
    }
}

