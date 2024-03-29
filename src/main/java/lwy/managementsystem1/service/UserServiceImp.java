package lwy.managementsystem1.service;

import lwy.managementsystem1.entity.User;
import lwy.managementsystem1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(int id) {

        return userMapper.getUserInfo(id);
    }


    public int deleteById(int id) {
        return userMapper.deleteById(id);
    }

    public int Update(User user) {
        return userMapper.update(user);
    }

    public User save(User user) {
        int save = userMapper.save(user);
        return user;
    }

    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    public int selectD(String department) {
        return userMapper.selectD();
    }

    public List<User> printByDepartment(String department) {
        return userMapper.printByDepartment(department);
    }

    public List<User> printBySex(int sex) {
        return userMapper.printBySex(sex);
    }
}

