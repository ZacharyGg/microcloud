package cn.hlxd.microcloud.dao.Impl;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：V1.0
 * @Date： 2018-06-07-15:04
 * @Description：
 **/

@SuppressWarnings("serial")
public class Permission {
    private Integer id; //int(10) NOT NULL,
    private String permName; //varchar(50) DEFAULT NULL,
    private String permTag; //varchar(50) DEFAULT NULL,

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public String getPermTag() {
        return permTag;
    }

    public void setPermTag(String permTag) {
        this.permTag = permTag;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", permName='" + permName + '\'' +
                ", permTag='" + permTag + '\'' +
                '}';
    }
}
