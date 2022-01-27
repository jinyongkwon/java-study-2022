package postapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // User(int id, String username, ...)
@Data
public class UserData {
    private int id;
    private String title;
    private String content;
    private User user;
    private String created;
    private String updated;
}
