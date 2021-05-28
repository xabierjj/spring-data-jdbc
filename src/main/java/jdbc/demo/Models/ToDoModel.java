package jdbc.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("todo")
public class ToDoModel {
    
    @Id
    private Long id;

    private String description;

    private boolean done;


    public void setId( Long id) {
        this.id=id;
    }
    

    public ToDoModel(Long id, String description, boolean done) {
        this.id = id;
        this.description = description;
        this.done = done;
    }

    public static ToDoModel create(String description) {


        return new ToDoModel(null,description, false);
    }

}
