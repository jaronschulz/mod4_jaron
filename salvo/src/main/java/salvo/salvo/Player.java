package salvo.salvo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

    Player(){}

    Player(String userName){
        this.userName = userName;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



}