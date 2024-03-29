package lwy.managementsystem1.controller;

import lwy.managementsystem1.entity.User;
import lwy.managementsystem1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RestController
@RequestMapping("/lwy")
public class UserController {

    @Autowired
    private UserService userService;

    //通过用户id获取用户所有信息
    //    http://localhost:8081/lwy/getUser/1(此处1为要获取的id）
    //@RequestMapping(value = "getUser/{id}", method = RequestMethod.POST)
    //    http://localhost:8081/lwy/getUser?id=1(此处1为要获取的id）
    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public String GetUser(@RequestBody User user) {
        return userService.getUserInfo(user.getId()).toString();
    }

    //通过用户id删除用户
    //    http://localhost:8081/lwy/delete?id=1(此处1为要删除的id）
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody User user) {
        int result = userService.deleteById(user.getId());
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    //按部门打印
    @RequestMapping(value = "/printByDepartment",method = RequestMethod.POST)
    public List<User> ListByDepartment(@RequestBody User user){
        return userService.printByDepartment(user.getDepartment());
    }

    //按性别打印
    @RequestMapping(value = "/printBySex",method = RequestMethod.POST)
    public List<User> ListBySex(@RequestBody User user){
        return userService.printBySex(user.getSex());
    }

    //查询部门人数
    @RequestMapping(value = "/selectD", method = RequestMethod.POST)
    public int selectDepartment(@RequestBody User user){
        return userService.selectD(user.getDepartment());
    }

    //根据用户id更新用户信息
    //http://localhost:8081/lwy/update?id=2&name=波波&age=23&department=产研部&salary=21000
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestBody User user) {
        int result = userService.Update(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //插入新用户
    //   http://localhost:8081/lwy/insert?id=100&name=波波&age=23&department=产研部&salary=21000
    @RequestMapping(value = "/insert", method = RequestMethod.POST)

    public  User insert( @RequestBody User user) {
        return userService.save(user);
    }
    //打印所有用户信息
    //    http://localhost:8081/lwy/selectAll
    @RequestMapping("/selectAll")
    @ResponseBody
    public List<User> ListUser() {
        return userService.selectAll();
    }

}
