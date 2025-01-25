package com.trg.serverInfo;

public class Server {
    int serverid;
    String serverName, ipAddr, location;

    //get/set, cons, toString

    public Server() {
    }

    public Server(int serverid, String serverName, String ipAddr, String location) {
        this.serverid = serverid;
        this.serverName = serverName;
        this.ipAddr = ipAddr;
        this.location = location;
    }

    public int getServerid() {
        return serverid;
    }

    public String getServerName() {
        return serverName;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public String getLocation() {
        return location;
    }

    public void setServerid(int serverid) {
        this.serverid = serverid;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Server{" +
                "serverid=" + serverid +
                ", serverName='" + serverName + '\'' +
                ", ipAddr='" + ipAddr + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
