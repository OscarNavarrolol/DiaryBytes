/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonebook;

/**
 *
 * @author USUARIO
 */
public class contactXuser {
    private int userxcontact_id;
    private int id_contact;
    private int id_user;

    public contactXuser() {
    }

    public contactXuser(int userxcontact_id, int id_contact, int id_user) {
        this.userxcontact_id = userxcontact_id;
        this.id_contact = id_contact;
        this.id_user = id_user;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getUserxcontact_id() {
        return userxcontact_id;
    }

    public void setUserxcontact_id(int userxcontact_id) {
        this.userxcontact_id = userxcontact_id;
    }

    public int getId_contact() {
        return id_contact;
    }

    public void setId_contact(int id_contact) {
        this.id_contact = id_contact;
    }
    
    
    }
