package jdbc.demo.Models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("todo_list")
public class ToDoListModel {

    @Id
    private Long id;
    private String name;
    private List<ToDoModel> todoList;

    public void setId( Long id) {
        this.id=id;
    }

    public ToDoListModel(Long id, List<ToDoModel> todoList, String name) {
        this.id = id;
        this.todoList = todoList;
        this.name=name;
    }

    public static ToDoListModel create( List<ToDoModel> todoList, String name) {
        return new ToDoListModel(null, todoList,name);
    }
    

    
    
}
