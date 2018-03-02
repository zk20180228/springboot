package com.honry.nosql;

import com.honry.bean.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/17 10:39
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Repository
public class MongoDBTest {

    @Resource
    private MongoTemplate mongoTemplate;


    public void addDocuments(){

        List<User> users = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            User u = new User();
            u.setName("第 "+(i+1));
            u.setId(UUID.randomUUID().toString().replace("-",""));
            u.setAge(35-i);
            u.setSex(i%2==0?"男":"女");
            u.setAddress("河南");
            users.add(u);
        }

        mongoTemplate.insert(users,User.class);
    }

    public void delDocument(){

        Query query=new Query();
        Criteria criteria= new Criteria();
        criteria.and("age").is(35);
        query.addCriteria(criteria);
        mongoTemplate.remove(query,User.class);
    }


    public void updateDocument(){

        Query query=new Query();
        Criteria criteria= new Criteria();
        criteria.and("sex").is("男");
        query.addCriteria(criteria);


        Update update=new Update();
        update.set("sex","女");
        mongoTemplate.updateMulti(query,update,User.class);
    }


    public void findDocument01(){

        Query query=new Query();
        Criteria criteria= new Criteria();
        criteria.and("sex").is("女");
        query.addCriteria(criteria);
        query.skip(0).limit(2);

        List<User> users = mongoTemplate.find(query, User.class);
        for (User user : users) {
            System.out.println(user);
        }

    }



}
