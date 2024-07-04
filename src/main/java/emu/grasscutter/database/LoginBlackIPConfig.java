package emu.grasscutter.database;

import dev.morphia.annotations.*;
import org.bson.types.ObjectId;


@Entity(value = "LoginBlackIPConfig", useDiscriminator = false)
public class LoginBlackIPConfig {
    @Id
    private int id;
    private String ip;
    private String msg;

    public LoginBlackIPConfig() {}

    public LoginBlackIPConfig(int id, String ip, String msg) {
        this.id = id;
        this.ip = ip;
        this.msg = msg;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
