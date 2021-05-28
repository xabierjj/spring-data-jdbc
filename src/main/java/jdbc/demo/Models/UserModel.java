package jdbc.demo.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("user")
public class UserModel {

    @Id
    private Long id;
    private String name;
    private List<ToDoListModel> todolists;
    
    public UserModel(Long id, String name,List<ToDoListModel> todolists)  {
        this.id = id;
        this.name = name;
        this.todolists = todolists;
    }

    public static UserModel create(String name,List<ToDoListModel> todolists) {
        return new UserModel(null, name, todolists);
    }
    public static UserModel create(String name) {
        return new UserModel(null, name, null);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

}