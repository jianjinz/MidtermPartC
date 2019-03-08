/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midtermexam_versiona_extensioncode;

/**
 *
 * @author jinze
 */
public class TestUserprofile {
    
    public void main(String[] args){
        UserProfile up = new UserProfile;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input your name");
        
        System.out.println("Choose your favorite genre");
        for(int i=0,i<4,i++){
        System.out.println(up.getGenre());
        }
    
    }
}
