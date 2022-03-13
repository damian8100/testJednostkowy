package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser>theForumUserList = new ArrayList<>();

    public Forum()
    {
        theForumUserList.add(new ForumUser(1,"Andrzej Kowalski",'M',1987,12,1,15));
        theForumUserList.add(new ForumUser(2,"Barbara Nowak",'F',1996,1,24,23));
        theForumUserList.add(new ForumUser(3,"Marek Struś",'M',2000,3,14,4));
        theForumUserList.add(new ForumUser(4,"Grzegorz Robak",'M',1993,9,12,9));
        theForumUserList.add(new ForumUser(5,"Dominik Grzegorek",'M',2004,7,16,11));
        theForumUserList.add(new ForumUser(6,"Anna Luszczek",'F',1983,11,19,20));
        theForumUserList.add(new ForumUser(7,"Karolina Nosowska",'F',2008,2,29,33));
        theForumUserList.add(new ForumUser(8,"Andrzej Duda",'M',1973,8,7,3));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }
    }


