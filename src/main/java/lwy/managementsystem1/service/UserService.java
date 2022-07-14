package lwy.managementsystem1.service;

import lwy.managementsystem1.entity.User;


import java.util.List;

public interface UserService {


    public User getUserInfo(int id);


    public int deleteById(int id);

    public int Update(User user) ;

    public User save( User user);

    public List<User> selectAll();

    public int selectD(String department);

    public List<User> printByDepartment(String department);
    public List<User> printBySex(int sex);
}
