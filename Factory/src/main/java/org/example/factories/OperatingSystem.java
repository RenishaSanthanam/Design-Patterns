package org.example.factories;

public abstract class OperatingSystem {
    private String version;
    private  String architechture;

    public OperatingSystem(String version, String architechture) {
        this.version = version;
        this.architechture = architechture;
    }

    public String getArchitechture() {
        return architechture;
    }

    public void setArchitechture(String architechture) {
        this.architechture = architechture;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public abstract void changeDir(String dir);
    public abstract void removeDir(String dir);



}
