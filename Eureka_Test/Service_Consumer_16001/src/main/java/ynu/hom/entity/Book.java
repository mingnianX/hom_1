package ynu.hom.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ynu.hom.entity.User;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private User user;
    private List<String> bookList;
}
