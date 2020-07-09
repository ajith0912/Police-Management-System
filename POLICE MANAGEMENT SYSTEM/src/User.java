/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
class User {
    private int id;
    private String description, address;
    
    public User(int id,String description, String address)
    {
        this.id=id;
        this.description=description;
        this.address=address;
    }
    public int getid(){
        return id;
    }
    public String getdescription(){
        return description;
    }
    public String getaddress(){
        return address;
    }
}
