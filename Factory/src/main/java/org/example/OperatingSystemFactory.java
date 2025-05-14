package org.example;

import org.example.factories.LinuxOperatingSystem;
import org.example.factories.OperatingSystem;
import org.example.factories.WindowsOperatingSystem;

public class OperatingSystemFactory {
    private OperatingSystemFactory(){

    }

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type) {
            case "WINDOWS":
                return new WindowsOperatingSystem(version, architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("OS not supported");
        }
    }

}
